package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user_login\"]")
	WebElement mail;
	@FindBy(xpath="//*[@id=\"user_pass\"]")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"wppb-submit\"]")
	WebElement login;
	
	public Loginpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver ,this);
	}
	public void login(String user,String pass1)
	{
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions action=new Actions(driver);
    WebElement log = driver.findElement(By.linkText("Log In"));
    js.executeScript("arguments[0].scrollIntoView();", log);
    action.moveToElement(log).click().build().perform();
    mail.sendKeys(user);
	pass.sendKeys(pass1);
   }
	public void submit() {
		 login.click();
	}
    
    public void shopy() {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 Actions action=new Actions(driver);
    	WebElement shop = driver.findElement(By.linkText("Shop"));
        js.executeScript("arguments[0].scrollIntoView();", shop);
        action.moveToElement(shop).click().build().perform();
    }
    
}
	

	
	
