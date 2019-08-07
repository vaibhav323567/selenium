package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbhomepage {

	WebDriver dr;
	
	By profile_xp=By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");
	
	
	public  fbhomepage(WebDriver dr)
	{
		this.dr=dr;
		
	}
	
	public String getprofilename()
	{
		return dr.findElement(profile_xp).getText();
	}
	
}
