package automatedtesting;

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
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class allfunction {

	String xp="",td="",kw="";
	
	WebDriver dr;
	
	public  void readexcel(String path, int i)
	{
		File f = new File(path);
		try {
		FileInputStream fis;
		
			fis = new FileInputStream(f);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row= sh.getRow(i);
		
		XSSFCell cell1 =row.getCell(1);
		kw=cell1.getStringCellValue();
		
		XSSFCell cell2 =row.getCell(2);
		xp=cell2.getStringCellValue();
		
		XSSFCell cell3 =row.getCell(3);
		td=cell3.getStringCellValue();
		
		wb.close();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		}
	
	public void launch(String url)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_v75.exe");
		dr= new ChromeDriver();
		dr.get(url);
		
	}
		
	public void entertext(String xp, String data)
	{
		dr.findElement(By.xpath(xp)).sendKeys(data);
		
	}
		
	public void click(String xp)
	{
		dr.findElement(By.xpath(xp)).click();
	}
	
	public void verify(String xp,String er)
	{
		String ar="";
		ar=dr.findElement(By.xpath(xp)).getText();
		if(ar.compareTo(er)==0)
			System.out.println("verified email");
		
		
	}
	
	public void writeexcel(String path,String val ,int i)
	{
		File f = new File(path);
		try {
		FileInputStream fis;
		
			fis = new FileInputStream(f);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis); 
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row= sh.getRow(i);
		XSSFCell cell= row.createCell(4);
		cell.setCellValue(val);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
