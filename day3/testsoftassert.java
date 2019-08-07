package automatedtesting;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testsoftassert {
	
  @Test
  public void f() {

	  String er="Noida";
	  String ar="Noid";
	  System.out.println("before assert");
	  SoftAssert sa =new SoftAssert();
	  sa.assertEquals(ar, er);
	  System.out.println("after assert");
	  sa.assertAll();
	  
  }

}
