package com.xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\ExcelWrite1.xlsx");
		FileInputStream FI = new FileInputStream(f);
		Workbook W = new XSSFWorkbook(FI);
		Sheet S = W.getSheet("data");
		for(int i=0;i<S.getPhysicalNumberOfRows();i++) {
			Row r = S.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell C = r.getCell(j);
				int cellType = C.getCellType();
				if(cellType==1) {
					String namevalue = C.getStringCellValue();
					if(namevalue.equals("Hemanth")) {
						C.setCellValue("Babu");
					}
					else {
						System.out.println("Not Present");
					}
				}
				
				
				
			}
		}
		FileOutputStream Fout = new FileOutputStream(f);
		W.write(Fout);

	}

}
