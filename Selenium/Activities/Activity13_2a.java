package activity;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2a {
    public void writeExcel(String filePath) throws IOException {
        //Create an instance of the Excel Workbook.
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Create an instance of the Excel Sheet.
        XSSFSheet sheet = workbook.createSheet();
        FileOutputStream out = new FileOutputStream(new File(filePath));
        //"src/test/java/tests/sample.xlsx"
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.NO."};
        String[] row1 = {"1", "Phani", "Cherukuri", "abc.def@gmail.com", "9999999999"};
        String[] row2 = {"2", "Krishna", "Cherukuri", "ghi.jkl@gmail.com", "8888888888"};
        String[] row3 = {"3", "Kumar", "Cherukuri", "mno.pqr@gmail.com", "9999999999"};
        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);
        int rowNum = 0;
        //Iterate over data and read to sheet.
        for (String[] rowData : data) {
            //create each row.
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            //create a column.
            for (String cellData : rowData) {
                Cell cell = row.createCell(colNum++);
                cell.setCellValue(cellData);
            }
        }
        workbook.write(out);
        out.close();
        workbook.close();
    }

    public void readExcel(String filePath) throws IOException {
        try {
        FileInputStream file = new FileInputStream(filePath);
        //Create an Excel workbook.
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        //Create an Excel sheet.
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        //Iterate over each row.
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            //Iterate over each column.
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    default:
                        System.out.println("Invalid Value.");
                        break;
                }
            }
            System.out.println("");
        }
        file.close();
        workbook.close();

    }
    catch(
    Exception e)

    {
        e.printStackTrace();
    }

}
    public static void main(String[] args) throws IOException {

        String filePath = "src/test/resources/sample.xlsx";
        Activity13_2a objExcelFile = new Activity13_2a();
        //Write an Excel File.
        objExcelFile.writeExcel(filePath);
        //Read the Excel File.
        objExcelFile.readExcel(filePath);
    }
}