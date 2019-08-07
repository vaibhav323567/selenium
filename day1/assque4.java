import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assque4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		
		
	for(int i=0;i<3;i++)
	{
		String dd="";
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		dr.findElement(By.name("Email")).sendKeys(readid(i));
		dr.findElement(By.name("Password")).sendKeys(readpass(i));
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		dd= dr.findElement(By.xpath("//html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		//System.out.println(dd);
		if(dd.compareTo(readid(i))==0) {
			try {
			File f = new File("D:\\\\Training\\\\data.xlsx");
			FileInputStream fis;
			
				fis = new FileInputStream(f);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis); 
			XSSFSheet sh = wb.getSheet("Sheet1");
			
			XSSFRow row1 = sh.getRow(i);
			XSSFCell cell1= row1.createCell(2);
			
			cell1.setCellValue("Pass");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				File f = new File("D:\\\\Training\\\\data.xlsx");
				FileInputStream fis;
				
					fis = new FileInputStream(f);
				
				XSSFWorkbook wb= new XSSFWorkbook(fis); 
				XSSFSheet sh = wb.getSheet("Sheet1");
				
				XSSFRow row1 = sh.getRow(i);
				XSSFCell cell1= row1.createCell(2);
				
				cell1.setCellValue("fail");
				FileOutputStream fos = new FileOutputStream(f);
				wb.write(fos);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	}
	
	}
	
	

	
	public static String readid(int i)
	{
		String s="";
		try {
		File f=new File("D:\\Training\\data.xlsx");
		FileInputStream fis;
		
			fis = new FileInputStream(f);
		
		
		XSSFWorkbook wb= new	XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet1");

		XSSFRow row= sh.getRow(i);
		XSSFCell cell1 =row.getCell(0);
		 s=cell1.getStringCellValue();
		
	}

	catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return s;
	}
	
	public static String readpass(int i)
	{
		String s="";
		try {
		File f=new File("D:\\Training\\data.xlsx");
		FileInputStream fis;
		
			fis = new FileInputStream(f);
		
		
		XSSFWorkbook wb= new	XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet1");

		XSSFRow row= sh.getRow(i);
		XSSFCell cell1 =row.getCell(1);
		 s=cell1.getStringCellValue();
		

	}

	catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return s;
	}

}
