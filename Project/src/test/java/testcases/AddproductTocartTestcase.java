package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseclass.Libraryclass;
import pages.AddproductTocart;import seleniumreuseablefunctions.Seleniumutility;

public class AddproductTocartTestcase extends Libraryclass {
	Seleniumutility selenium;
	AddproductTocart apro;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}

	@Test
	public void selpro()
	{
	apro=new AddproductTocart(driver);
	apro.shopy();
	apro.search();
	apro.selectproduct();
	apro.prod();
	}
   
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/addtocart.png");
	closeapp();
  }
}

