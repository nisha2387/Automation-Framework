package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeCreateALeaveType extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	
	 @FindBy(xpath="//a[.='Leave Types']")
	   private WebElement LeaveTypeslink;
	 
	 @FindBy(xpath="//span[.='Create Leave Type']")
	   private WebElement CreateLeaveTypebutton;
	 
	 @FindBy(id="leaveTypeLightBox_nameField")
	   private WebElement leaveTypeLightBox_nameFieldTextField;
	   
	   @FindBy(xpath="//div[@class='buttonIcon']")
	   private WebElement buttonIcon;
	   
	   public PomActitimeCreateALeaveType(WebDriver driver) 
	   {
	   PageFactory.initElements(driver, this);
	   }
	  public void submit() throws IOException
	  {
		  popupmenuicon.click();
		  LeaveTypeslink.click();
		  CreateLeaveTypebutton.click();
		  leaveTypeLightBox_nameFieldTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,5));
		  buttonIcon.click();
	  }
	
}
