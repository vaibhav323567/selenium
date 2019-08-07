package automatedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class copypaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://wwww.facebook.com");
		WebElement we =dr.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
		WebElement we1 =dr.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
		
		Actions act=new Actions(dr);
		Action manyact=act
				.moveToElement(we)
				.click()
				.sendKeys("java")
				.keyDown(we,Keys.CONTROL)
				.sendKeys("A")
				.sendKeys("c")
				.keyUp(we,Keys.CONTROL)
				.build();
		
		manyact.perform();

		Actions act1=new Actions(dr);
		Action set=act1
				.moveToElement(we1)
				.click(we1)
				.keyDown(we1,Keys.CONTROL)
				.sendKeys("v")
				.keyUp(we,Keys.CONTROL)
				.build();
		
		set.perform();

	}

}
