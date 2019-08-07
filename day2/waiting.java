package automatedtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class waiting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebDriverWait wt=new WebDriverWait(dr,10);
//		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")));
		
		
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
		
		
	}

}
