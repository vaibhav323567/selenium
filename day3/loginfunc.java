package automatedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunc {
	public static String login(String email,String pass)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
		dr.findElement(By.name("Email")).sendKeys(email);
		dr.findElement(By.name("Password")).sendKeys(pass);
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String s=dr.findElement(By.className("account")).getText();
		
		return s;
	}

}
