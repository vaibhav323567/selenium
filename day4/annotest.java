package automatedtesting.automatedtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automatedtesting.loginfunc1;

public class annotest extends loginfunc1{
	WebDriver dr;

  @Test
  public void tc1() {
	  String ac=login("personalmail@gmail.com","pass123$",dr);
	  String ex="personalmail@gmail.com";
	  Assert.assertEquals(ac, ex);
	  System.out.println("in tc1");
	  
   
  }
  @Test
  public void tc2() {
	  login("rsonalmail@gmail.com","pass123$",dr);
	  
	  String ac=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")).getText();
	  
	  String ex="Login was unsuccessful. Please correct the errors and try again.\n" + 
	  		"No customer account found";
	  Assert.assertEquals(ac, ex);
	  System.out.println("in tc2");
	   
   
  }

  @Test
  public void tc3() {
	  
	  login("rsonalmai","pass123$",dr);
	  String ac=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
	  String ex="Please enter a valid email address.";
	  Assert.assertEquals(ac, ex);
	  
	  System.out.println("in tc3");
	   
   
  }
@AfterMethod
public void afterwala() {
	System.out.println("in after");
	   
	dr.quit();
 
}
@BeforeMethod
  public void beforewala()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		dr= new ChromeDriver(); 
		dr.get("http://demowebshop.tricentis.com/login");
		System.out.println("in before");
		   
  }
}
