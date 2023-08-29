package com.xlsx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Throwable {
		File F = new File("C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\ExcelWrite1.xlsx");
		Workbook W	 = new XSSFWorkbook();
		Sheet S = W.createSheet("data");
		Row r = S.createRow(0);
		Cell C = r.createCell(0);
		C.setCellValue("Hemanth");
		//C.setCellValue("13/10/1998");
		FileOutputStream Fout = new FileOutputStream(F);
		W.write(Fout);
		System.out.println("done");
		

	}

}
