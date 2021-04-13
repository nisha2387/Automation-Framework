package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeCreateATypeOfwork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	
	@FindBy(xpath="//a[.='Types of Work']")
	   private WebElement TypesofWorklink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	 private WebElement CreateTypeofWorkButton;
	 
	 @FindBy(xpath="//input[@id='name']")
	 private WebElement nameTextField;
	 
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement submitButton;
	
	 public PomActitimeCreateATypeOfwork(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
		   this.driver=driver;
		   
	   }
	 
	 
	 public void popupmenuiconMethod() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   /*JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",popupmenuicon );*/
		   popupmenuicon.click();
	   }
	 
	 public void TypesofWorklinkMethod()
	 {
		 TypesofWorklink.click();
	 }
	 public void CreateTypeofWorkButtonMethod()
	 {
		 CreateTypeofWorkButton.click();
	 }
	 public void nameTextFieldMethod() throws IOException
	 {
		 nameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1,4));
		 
	 }
	   public void submitButtonMethod()
	   {
		   submitButton.click();
	   }
}
