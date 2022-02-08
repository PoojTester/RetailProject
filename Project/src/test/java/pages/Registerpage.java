package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
	
		WebDriver driver;
		@FindBy(xpath="//*[@id='username']")
		WebElement username;
		@FindBy(xpath="//*[@id='email']")
		WebElement email;
		@FindBy(xpath="//*[@id='passw1']")
		WebElement passw1;
		@FindBy(xpath="//*[@id='passw2']")
		WebElement passw2;
		//@FindBy(xpath="//*[@id='send_credentials_via_email']")
		//WebElement viamail;
		@FindBy(xpath="//input[@id='register'or @type='submit']")
		WebElement register;
		
		public Registerpage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		}
		
		public void start() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement myaccount=driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div[2]/div[2]/a"));
		   // WebElement regis=driver.findElement(By.xpath("//*[@id=\"menu-item-227763\"]/a"));
		    Actions action=new Actions(driver);
		    action.moveToElement(myaccount).click().perform();
		    WebElement regis = driver.findElement(By.linkText("Register"));
		    js.executeScript("arguments[0].scrollIntoView();", regis);
		    action.moveToElement(regis).click().build().perform();
		}
		public void register(String uname,String mail,String pass1,String pass2)
		{
		
		username.sendKeys(uname);
		email.sendKeys(mail);
		passw1.sendKeys(pass1);
		passw2.sendKeys(pass2);


		}
		public void submit() {
        register.click();
     }
}
