package mavenwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavenwebtestclass {
  @Test
  public void tc1() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe" );
	  WebDriver dr = new ChromeDriver();
	  dr.get("http://demowebshop.tricentis.com/");
	  dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
	  System.out.println("==============inside tc1=========");
  }
}
