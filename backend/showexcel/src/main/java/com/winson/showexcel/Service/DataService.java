package com.winson.showexcel.Service;

import com.winson.showexcel.Entity.TbSample;
import com.winson.showexcel.Entity.TbSampleDetailLocation;
import com.winson.showexcel.Mapper.TbSampleDetailLocationMapper;
import com.winson.showexcel.Mapper.TbSampleMapper;
import com.winson.showexcel.Utils.ExcelParse;
import com.winson.showexcel.Utils.TempData;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@MapperScan("com.winson.showexcel.Mapper")
@CrossOrigin
public class DataService {

    @Autowired
    TbSampleMapper tbSampleMapper;
    @Autowired
    TbSampleDetailLocationMapper tbSampleDetailLocationMapper;

    /**
     *
     * @param stream
     * @param sheetName
     * @return
     * @throws Exception
     */
    public List<Map> getDataListByExcel(InputStream stream, String sheetName) throws Exception {
        try {
            return new ExcelParse<>(new TempData()).AnaliseExcel(stream, sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    /**
     *
     * @param dataList
     * @return
     */
    public boolean importExcel(List<Map> dataList) {
        try {
            for (Map map : dataList) {
                if (!map.isEmpty()) {

                    TbSample tbSample = new TbSample();
                    Double uid = (Double) map.get("uid");
                    tbSample.setNo(uid.intValue());
                    tbSample.setSampleId((String) map.get("sampleId"));
                    tbSample.setSurveyShip((String) map.get("surveyShip"));
                    tbSample.setVoyageNumber((String) map.get("voyageNumber"));
                    tbSample.setEndDepth((Double) map.get("endDepth"));
                    tbSample.setDrillerLength((Double) map.get("drillerLength"));
                    tbSample.setStorageLocation((String) map.get("storageLocation"));
                    var storageCondition = map.get("storageCondition");
                    if (storageCondition != null) {
                        if (!storageCondition.equals("")) {
                            tbSample.setStorageCondition((Double) storageCondition);
                        }
                    }

                    tbSample.setRemark((String) map.get("remark"));
                    System.out.println(tbSample.toString());
                    tbSampleMapper.insert(tbSample);
                    TbSampleDetailLocation tbSampleDetailLocation = new TbSampleDetailLocation();
                    tbSampleDetailLocation.setSampleId((String) map.get("sampleId"));
                    tbSampleDetailLocation.setSeaArea((String) map.get("seaArea"));
                    tbSampleDetailLocation.setLocationArea((String) map.get("locationArea"));
                    tbSampleDetailLocation.setCoordinateX((Double) map.get("coordinateX"));
                    tbSampleDetailLocation.setCoordinateY((Double) map.get("coordinateY"));
                    tbSampleDetailLocation.setDetailAddress((String) map.get("detailAddress"));
                    tbSampleDetailLocationMapper.insert(tbSampleDetailLocation);
                }

            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }


}

