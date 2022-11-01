package com.winson.showexcel.Utils;

import lombok.Data;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data

public class ExcelParse<T> {

    private T t;

    public ExcelParse(T t) {
        this.t = t;
    }

    /**
     *
     * @param stream
     * @param fileName
     * @return
     * @throws Exception
     */
    public List<Map> AnaliseExcel(InputStream stream, String fileName) throws Exception {
        List<Map> list = new ArrayList<>();
        Workbook workbook = createWorkbookByExcelType(stream, fileName);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = null;

        int maxRows = sheet.getLastRowNum();
        row = sheet.getRow(0);

        int maxCols = row.getLastCellNum();
        ArrayList<String> TempDataList = new ArrayList<>();
        Field[] declaredFields = t.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            System.out.println(name);
            TempDataList.add(name);
        }
        boolean flag = false;
        for (int i = 3; i < maxRows; i++) {
            Map<String, Object> map = new HashMap<>();
            row = sheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < maxCols; j++) {
                    if (row.getCell(j).getCellType() != CellType.BLANK) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    for (int z = 0; z < maxCols; z++) {
                        var celldata = getCelldataType(row.getCell(z));
                        if (celldata != "") {
                            map.put(TempDataList.get(z), celldata);
                        }

                    }

                } else {
                    if (i == sheet.getLastRowNum()) {
                        sheet.removeRow(row);
                    } else {
                        sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
                    }
                }

            }
            list.add(map);
        }
        System.out.println(list.size());
        return list;

    }

    /**
     *
     * @param stream
     * @param fileName
     * @return
     */
    public static Workbook createWorkbookByExcelType(InputStream stream, String fileName) {
        Workbook workbook = null;
        if (fileName == null || fileName.isEmpty()) {
            return null;
        }
        String extStr = fileName.substring(fileName.lastIndexOf("."));
        InputStream is = null;
        try {
            is = stream;
            if (".xls".equals(extStr)) {
                return workbook = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extStr)) {
                return workbook = new XSSFWorkbook(is);
            } else {
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param cell
     * @return
     */
    public static Object getCelldataType(Cell cell) {
        Object value = "";
        if (cell != null) {
            if (cell.getCellType() == CellType.NUMERIC) {
                value = cell.getNumericCellValue();
            } else if (cell.getCellType() == CellType.STRING) {
                value = cell.getStringCellValue();
            }
        }
        return value;
    }
}
