package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class dusradriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
//
//		WebDriver dr1=new InternetExplorerDriver();
//		dr1.get("http://www.facebook.com");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		
				WebDriver dr2 =new FirefoxDriver();
				dr2.get("http://www.facebook.com");
				

	}

}
