package week5.Day1;

import org.testng.annotations.Test;

public class TestCase {
  @Test(invocationCount=5,priority=-5)
  public void createLead() {
	  System.out.println("Lead created");
  }
  @Test(priority=-2,alwaysRun=true)
  public void deleteLead() {
	  System.out.println("Lead deleted");
  }
  @Test(priority=2)
  public void editLead() {
	  System.out.println("Lead edited");
  }
}
