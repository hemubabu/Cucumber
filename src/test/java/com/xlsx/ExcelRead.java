package com.xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Throwable {
		File F = new File("C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\Testing1.xlsx");
		FileInputStream Fin = new FileInputStream(F);
		Workbook WB = new XSSFWorkbook(Fin);
		Sheet S = WB.getSheet("Sheet1");
		for(int i=0;i<S.getPhysicalNumberOfRows();i++) {
			Row r = S.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell C = r.getCell(j);
				int cellType = C.getCellType();		// 1--String,0--Numeric(celltypes)
				if(cellType==1) {
					String namevalue = C.getStringCellValue();
					System.out.println(namevalue);	
				}
				else if (cellType==0) {
					if(DateUtil.isCellDateFormatted(C)) //It will filter the date format (datautil is a class)
					{
						Date dateValue = C.getDateCellValue();
						SimpleDateFormat SD = new SimpleDateFormat("dd/MM/yyyy");
						String formatdate = SD.format(dateValue);
						System.out.println(formatdate);
					}
					else {
						double d = C.getNumericCellValue(); // It supports decimal and whole numbers
						long l = (long)d;   // we can't directly convert double to string so 
											// we are converting to long
						String Regnovalue=String.valueOf(l);
						System.out.println(Regnovalue);
						
						
					}
				}
				
				
				
			}
		}

	}

}
