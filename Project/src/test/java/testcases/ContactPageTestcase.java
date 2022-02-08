package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.ContactPage;
import seleniumreuseablefunctions.Seleniumutility;

public class ContactPageTestcase extends Libraryclass {
	Seleniumutility selenium;
	ContactPage cp;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}
	@Test
	public void contact()
	{
		cp=new ContactPage(driver);
        cp.conatct();
        cp.submit();
		}
   @AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/checkout.png");
	closeapp();
  }
}
