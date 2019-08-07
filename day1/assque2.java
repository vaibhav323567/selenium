import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_v75.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		
		String actualtitle=dr.getTitle();
		String expectedtitle="Online Bookstore";
		System.out.println("Title comparison: "+actualtitle.equals(expectedtitle));
		
		WebElement we1=dr.findElement(By.name("category_id"));
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("Databases");
		
		dr.findElement(By.name("DoSearch")).click();
		
		dr.close();
		
	}

}
