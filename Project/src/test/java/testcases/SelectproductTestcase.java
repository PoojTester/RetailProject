package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.Selectproduct;
import seleniumreuseablefunctions.Seleniumutility;

public class SelectproductTestcase extends Libraryclass { 
	Seleniumutility selenium;
	Selectproduct spro;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}

	@Test
	public void selpro()
	{
	spro=new Selectproduct(driver);
	spro.shopy();
	spro.search();
	spro.selectproduct();
	}
   
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/select.png");
	closeapp();
  }
}