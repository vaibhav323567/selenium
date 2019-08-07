package maven1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class maventestNGclass {
  @Test
  public void tc1() {
	  String er="agra";
	  String ar="agra";
	  System.out.println("in the tc1 testcase");
	  Assert.assertEquals(er, ar);
  }
}
