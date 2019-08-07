package automatedtesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationtest 

{
 
	@Test
  public void tc1() 
	{
	  System.out.println("in the tc1");
  }
	
	@Test(priority= 2)
	  public void tc2() 
		{
		  System.out.println("in the tc2");
	  }
	
	@Test(priority=1)
	  public void tc3() 
		{
		  System.out.println("in the tc3");
	  }
	
	@BeforeMethod
	  public void beforewala() 
		{
		  System.out.println("in the before method");
	  }

	@AfterMethod
	  public void Afterwala() 
		{
		  System.out.println("in the after method");
		  System.out.println();
	  }

}
