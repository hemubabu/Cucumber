package com.xlsx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTv {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\ExcelTV1.xlsx");
		FileOutputStream Fout = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet S = w.createSheet("TV data");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\FebCucumber\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("LGTV",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> Tv = driver.findElements(By.xpath("//div[contains(text(),'LG')]"));
		Thread.sleep(3000);
		int size = Tv.size();
		System.out.println(size);
		
		for(int i=0;i<17;i++) {
			WebElement Tvnames = Tv.get(i);
			
			String Tvnameslist = Tvnames.getText();
			System.out.println(Tvnameslist);
			Row r = S.createRow(i);
			Cell C = r.createCell(0);
			C.setCellValue(Tvnameslist);
			
			
		}
		w.write(Fout);


	}

}
