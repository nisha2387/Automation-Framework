package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class PomActitimeDeleteTypeOfwork extends BasePage implements AutoConstant
{
	public WebDriver driver;
  @FindBy(xpath="//a[.='Emergency']/../..//a[contains(text(),'delete')]")
 private WebElement deletelink;
  
  public PomActitimeDeleteTypeOfwork(WebDriver driver)
  {
 	 PageFactory.initElements(driver, this);
 	 this.driver=driver;
  }
  
  public void deletelinkMethod() throws InterruptedException
  {
 	 deletelink.click();
 	 Alert alt=driver.switchTo().alert();
	     Thread.sleep(2000);
	     alt.accept();
}
}