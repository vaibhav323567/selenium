package automatedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		
		WebElement we =dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));//Computers
		
		
		WebElement we1 =dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a"));//Accessories
		
		Actions act=new Actions(dr);
		Action set=act
				.moveToElement(we)
				.build();

		set.perform();
		
		Action set1=act
				.moveToElement(we1)
				.click()
				.build();

		set1.perform();
		
	}

}
