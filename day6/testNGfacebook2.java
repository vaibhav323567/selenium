package testfbpages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.fbhomepage;
import pages.fbloginpage;

public class testNGfacebook2 {
 
	WebDriver dr;
	fbloginpage loginpage;
	fbhomepage homepage;
	
	Logger log;
	
	@BeforeClass
  public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		dr =new ChromeDriver();
		dr.get("https://www.facebook.com");
  }
	
	@Test(priority=0)
	public void testloginpage()
	{
		loginpage =new fbloginpage(dr);
		String loginpagetitle=loginpage.gettitle();
		System.out.println("Title: "+ loginpagetitle);
		
		Assert.assertTrue(loginpagetitle.contains("Facebook"));
		log=Logger.getLogger("devpinoyLogger");
		
		log.info("test executed");
	}
	
	@Test(priority=1)
	public void testhomepage()
	{
		loginpage.dologin("girishindia95@gmail.com", "mynewp@55");
		homepage = new fbhomepage(dr);
		String actualpn=homepage.getprofilename();
		System.out.println("Actual profile name: "+ actualpn);
		Assert.assertTrue(actualpn.contains("Girish"));
		
		
	}
	
}
