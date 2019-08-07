package automatedtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://facebook.com");
		dr.navigate().back();
		dr.navigate().forward();
		dr.navigate().refresh();
		dr.navigate().to("http://demowebshop.tricentis.com/");
	}

}
