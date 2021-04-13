package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeLoginLogout extends BasePage implements AutoConstant
{
	public WebDriver driver;
 @FindBy(id="username")
 private WebElement usernameTextfield;
 
 @FindBy(xpath="//input[@placeholder='Password']")
 private WebElement passwordTextfield;
 
 @FindBy(id="loginButton")
 private WebElement loginButton;
 
 @FindBy(id="logoutLink")
 private WebElement logoutlink;
 
  
 public PomActitimeLoginLogout(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	  this.driver=driver;
 }
 
 public void submit() throws IOException
 {
	 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,0));
	 passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,1));
	 loginButton.click();
	// logoutlink.click();
	 
 }
 
}
