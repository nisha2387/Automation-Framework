package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class PomActitimeEditLeaveType extends BasePage implements AutoConstant
{

	public WebDriver driver;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	
	 @FindBy(xpath="//a[.='Leave Types']")
	   private WebElement LeaveTypeslink;
	 
	 @FindBy(xpath="(//td[@class='leaveTypeAffectedBalanceCell'])[6]")
	   private WebElement leaveTypeAffectedBalanceCelllink;
	 
	 @FindBy(xpath="(//input[@type='checkbox'])[3]")
	   private WebElement checkbox;
	   
	   @FindBy(id="asSickDaysRadioButton_affectedBalancePopup")
	   private WebElement radiobutton;
	   
	   @FindBy(xpath="(//span[@class='ui-button-text'])[5]")
	   private WebElement applybutton;
	   
	   public PomActitimeEditLeaveType(WebDriver driver) 
	   {
	   PageFactory.initElements(driver, this);
	   }
	   
	   public void submit()
	   {
		   popupmenuicon.click(); 
		   LeaveTypeslink.click();
		   leaveTypeAffectedBalanceCelllink.click();
		   checkbox.click();
		   radiobutton.click();
		   applybutton.click();
	   }
	 
}
