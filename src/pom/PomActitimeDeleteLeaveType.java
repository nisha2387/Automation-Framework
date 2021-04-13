package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class PomActitimeDeleteLeaveType extends BasePage implements AutoConstant
{
	  public WebDriver driver;
	  @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	
	  @FindBy(xpath="//a[.='Leave Types']")
	   private WebElement LeaveTypeslink;
	 

	   @FindBy(xpath="//span[.='Emergency']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	   private WebElement DeleteCell;
	   
	   public PomActitimeDeleteLeaveType(WebDriver driver) 
	   {
	   PageFactory.initElements(driver, this);
	   this.driver=driver;
	   }
	   
	   public void submit()
	   {
		   popupmenuicon.click();  
		   LeaveTypeslink.click();
	   }
	   public void DeleteCellMethod() throws InterruptedException
	   {
		   DeleteCell.click();
		   Alert alt=driver.switchTo().alert();
	 	     Thread.sleep(2000);
	 	     alt.accept();
	   }
}
