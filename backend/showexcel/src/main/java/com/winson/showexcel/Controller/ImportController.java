package com.winson.showexcel.Controller;


import com.alibaba.fastjson.JSONObject;
import com.winson.showexcel.Service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@RestController
@MapperScan("com.winson.showexcel.Mapper")
@CrossOrigin
@Slf4j
@RequestMapping("/api")
public class ImportController {
    @Autowired
    DataService service;

    @GetMapping("/me")
    public String hello() {
        return "hello";
    }

    @PostMapping("/upload")
    public String httpUpload(@RequestParam("files") MultipartFile files) throws Exception {
        JSONObject object = new JSONObject();
        String fileName = files.getOriginalFilename();
        InputStream stream = null;
        try {
            stream = files.getInputStream();
            List<Map> dataList = service.getDataListByExcel(stream, fileName);
            var result = service.importExcel(dataList);
            if (result) {
                object.put("result", "imported");
            }
        } catch (Exception e) {
            object.put("result", "import failure");
            return object.toString();
        }
        return object.toString();
    }

}
