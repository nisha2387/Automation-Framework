package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomfacebookSignup extends BasePage implements AutoConstant
{
	public WebDriver driver;
 @FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
 private WebElement createnewaccountbutton;
 
 @FindBy(xpath="//input[@placeholder='First name']")
 private WebElement firstnameTextfield;
 
 @FindBy(xpath="//input[@aria-label='Last name']")
 private WebElement lastnameTextfield;
 
 @FindBy(xpath="//input[@aria-label='Mobile number or email']")
 private WebElement MobilenumberTextfield;
 
 @FindBy(xpath="//input[@aria-label='New password']")
 private WebElement NewpasswordTextfield;
 
 
 @FindBy(id="month")
 private WebElement Birthdaymonthdropdownlist;
 
 
 @FindBy(id="day")
 private WebElement Daydropdownlist;
 
 @FindBy(id="year")
 private WebElement yeardropdownlist;
 
 @FindBy(xpath="(//input[@type='radio'])[1]")
 private WebElement Femaleradiobutton;
 
 @FindBy(xpath="(//input[@type='radio'])[2]")
 private WebElement Maleradiobutton;
 
 @FindBy(xpath="(//button[@type='submit'])[2]")
 private WebElement submitbutton;
 
 
 public PomfacebookSignup(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
 }
 
 public void submit() throws IOException
 {
	 createnewaccountbutton.click();
	 firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,0));
	 lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,1));
	 MobilenumberTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,2));
	 NewpasswordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,3));
	 
	 selectbyvisibletext(Birthdaymonthdropdownlist,"Jun");
	 selectbyvisibletext(Daydropdownlist,"10");
	 selectbyvisibletext(yeardropdownlist,"1989");
	 
	 Femaleradiobutton.click();
	 submitbutton.click();
	 
	 
	 
	 
	 
 }
 
}
