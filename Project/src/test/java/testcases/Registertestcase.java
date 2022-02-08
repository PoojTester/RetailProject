package testcases;


	import java.io.IOException;

import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.Registerpage;
import seleniumreuseablefunctions.Seleniumutility;

    public class Registertestcase extends Libraryclass{

	Seleniumutility selenium;
	Registerpage rp;
	@BeforeMethod
	public void openapp()
	{
	launchapp();
	}
	@Test
	public void register()
	{
	rp=new Registerpage(driver);
	rp.start();
	rp.register("Divya", "divyakrish568@gmail.com", "Sruthi", "Sruthi");
	rp.submit();
	}
    @AfterMethod
	public void teardown() throws IOException
	{
	selenium=new Seleniumutility(driver);
	selenium.screenshot("/Project/src/test/resources/Screenshots/register.png");
	closeapp();
	}
  }
