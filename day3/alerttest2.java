package automatedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerttest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	  
	    driver.findElement(By.name("cusid")).click();
	    driver.findElement(By.name("cusid")).sendKeys("ahsjajhsb");
	    driver.findElement(By.name("submit")).click();
	    
	    driver.switchTo().alert().dismiss();
	}

}
