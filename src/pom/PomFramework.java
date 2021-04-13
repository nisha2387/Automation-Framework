package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomFramework extends BasePage implements AutoConstant

{
	
  public WebDriver driver;	
  @FindBy(xpath="(//input[@type='text'])[1]")
  private WebElement firstnameTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[2]")
  private WebElement lastnameTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[3]")
  private WebElement usernameTextfield;
  
  @FindBy(xpath="//input[@type='password']")
  private WebElement passwordTextfield;
  
  @FindBy(xpath="(//input[@type='text'])[4]")
  private WebElement EmailIDTextfield;
  
  @FindBy(xpath="(//input[@type='radio'])[1]")
  private WebElement Maleradiobutton;
  
  @FindBy(xpath="(//input[@type='radio'])[2]")
  private WebElement Femaleradiobutton;
  
  @FindBy(xpath="//input[@type='checkbox']")
  private WebElement RememberMeCheckBox;
  
  @FindBy(xpath="//select[@name='countrycode']")
  private WebElement countrycodedropdownlist;

  
  @FindBy(xpath="(//input[@type='text'])[5]")
  private WebElement MobileNumberTextfield;
  
  @FindBy(xpath="//input[@type='button']")
  private WebElement SaveButton;
  
  public PomFramework(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
 	public void submit() throws IOException
 	{
 		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,0));
 		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,1));
 		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,2));
 		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,3));
 		EmailIDTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,4));
 		Maleradiobutton.click();
 		RememberMeCheckBox.click();
 		selectbyvisibletext(countrycodedropdownlist, "+1");
 		MobileNumberTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,5));
 		SaveButton.click();
 		
 	}
  
  
  
  
}



