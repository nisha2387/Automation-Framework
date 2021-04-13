package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class PomActitimeTasksCustomerProjectsPage extends BasePage implements AutoConstant
{
 @FindBy(xpath="//div[@class='title ellipsis']")
 private WebElement AddNewButton;
 
 @FindBy(xpath="//div[@class='item createNewCustomer']")
 private WebElement itemcreateNewCustomer;
 
 
 public PomActitimeTasksCustomerProjectsPage(WebDriver driver)
 {
	   PageFactory.initElements(driver,this);
	   this.driver=driver;
	   
 }
	
 public void AddNewButtonMethod()
 {
	 AddNewButton.click();
 }
 public void itemcreateNewCustomerMethod()
 {
	 itemcreateNewCustomer.click();
 }
	
}
