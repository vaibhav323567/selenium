package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	
	By uname = By.xpath("//*[@id=\"email\"]");
	By pwd = By.xpath("//*[@id=\"pass\"]");
	By btn = By.id("loginbutton");
	By recent = By.xpath("");
	By recent_login_pwd = By.xpath("");
	By pwd1 = By.xpath("");

	
	WebDriver dr;
	
	public  fbloginpage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void setuname(String un)
	{
		dr.findElement(uname).sendKeys(un);
	}
	
	public void setpwd(String pswd)
	{
		dr.findElement(pwd).sendKeys(pswd);
	}
	
	public void clickbtn()
	{
		dr.findElement(btn).click();
	}
	
	public void dologin(String u, String p)
	{
		this.setuname(u);
		this.setpwd(p);
		this.clickbtn();
	}
	public String gettitle()
	{
		return dr.getTitle();
	}
	
	
}
