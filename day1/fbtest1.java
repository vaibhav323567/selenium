package training;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
//		dr.findElement(By.id("email")).sendKeys("girishindia95@gmail.com");
//		dr.findElement(By.id("pass")).sendKeys("newfbp@55");
//		dr.findElement(By.id("loginbutton")).click();
//		String profile_name,title=dr.getTitle();
//		
//		profile_name=dr.findElement(By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).getText();
//		System.out.println("Title: "+title+"\nprofile name: "+profile_name);
//		
//		WebElement we1=dr.findElement(By.id("day"));
//		Select sel1=new Select(we1);
//		sel1.selectByVisibleText("10");
//		
		
		//dr.findElement(By.cssSelector("input[type='submit']")).click();
	//	System.out.println(dr.findElement(By.xpath("//*[contains(text(),'Create an account')]")).getText());
	//	dr.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).sendKeys("abcd");
		
//		List<WebElement> rb = dr.findElements(By.name("sex"));
//		rb.get(0).click();
//		
	
		boolean cs =dr.findElement(By.name("RememberMe")).isSelected();
		boolean fs=true;
		
		if(cs!=fs)
		{
			dr.findElement(By.name("RememberMe")).click();
		}
		
	
		
	}

}
