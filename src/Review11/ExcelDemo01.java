package Review11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo01 {
    public static void main(String[] args) {
        String path="Files/review11.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
            Row row=sheet1.getRow(3);
            System.out.println(row.getCell(2));
        } catch (Exception e) {
            System.out.println("Please check the path of the file");
        }
    }
}
