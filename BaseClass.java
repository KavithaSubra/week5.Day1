package week5.Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method from Base class");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }

}
