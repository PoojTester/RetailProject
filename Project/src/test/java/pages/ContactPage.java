package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    WebDriver driver;
	@FindBy(xpath="//*[@id=\"evf-227801-field_ys0GeZISRs-1\"]")
	WebElement Name;
	@FindBy(xpath="//*[@id=\"evf-227801-field_LbH5NxasXM-2\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"evf-227801-field_66FR384cge-3\"]")
	WebElement Subject;
	@FindBy(xpath="//*[@id=\"evf-227801-field_yhGx3FOwr2-4\"]")
	WebElement Message;
	@FindBy(xpath="//*[@id=\"evf-submit-227801\"]")
	WebElement Submit;
    
    
	public ContactPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver ,this);
	}
	public void conatct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	Actions action=new Actions(driver);
    	WebElement con = driver.findElement(By.linkText("Contact us"));
        js.executeScript("arguments[0].scrollIntoView();", con);
        action.moveToElement(con).click().build().perform();
        Name.sendKeys("divya");
        Email.sendKeys("divya@gmail.com");
        Subject.sendKeys("Product return");
        Message.sendKeys("Product is damaged");
	}
        
	public void submit()
	{
		Submit.click();
	}
}
