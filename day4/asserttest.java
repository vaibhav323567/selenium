package automatedtesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttest extends loginfunc {

	@Test
	public void tc1() {
		 
	 	String ar="Noida";
	 	String er="Noid";
	 	Assert.assertEquals(ar, er);
	 }
	
	@Test
	public void tc2() {
		 
	 	String ar=login("personalmail@gmail.com","pass123$");
	 	String er="personalmail@gmail.com";
	 	Assert.assertEquals(ar, er);
	 }

	@Test
	public void tc3() {
		 
	 	String ar=login("personalmail@gmail.com","pass123$");
	 	String er="ersonalmail@gmail.com";
	 	Assert.assertEquals(ar, er);
	 }

}
