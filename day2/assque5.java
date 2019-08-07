import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assque5 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String title="";
		title=dr.getTitle();
		String exp="Online Bookstore";
		int s = title.compareTo(exp);
		if(s==0)
			System.out.println("Title verification: true");
		WebElement we1=dr.findElement(By.name("category_id"));
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("Databases");

		dr.findElement(By.name("DoSearch")).click();
		
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/b/a")).click();
		
		
		title=dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/h1")).getText();
		exp="Web Database Development";
		int s1 = title.compareTo(exp);
		if(s1==0)
			System.out.println("Item name verification: true");
		
		dr.findElement(By.name("quantity")).clear();
		dr.findElement(By.name("quantity")).sendKeys("2");
		String price=dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/table/tbody/tr/td[2]")).getText();
		
		dr.findElement(By.name("Insert1")).click();
		
		String price1=dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[2]")).getText();
		
		if(price.compareTo(price1)==0)
		{
			System.out.println("Price comparison : true");
		}
	
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[2]/input")).click();
	}
}
