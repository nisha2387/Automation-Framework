package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeEditTypeOfWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	
	@FindBy(xpath="//a[.='Types of Work']")
	   private WebElement TypesofWorklink;
	
	@FindBy(xpath="//a[.='Emergency']")
	 private WebElement textlink;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement nameTextField;
	
  @FindBy(xpath="(//input[@name='billable'])[1]")
  private WebElement billableradiobutton;
  
  @FindBy(xpath="//input[@class='rate']")
  private WebElement rateTextField;
  
  @FindBy(xpath="//div[.='Save']")
  private WebElement SaveButton;
  
  public PomActitimeEditTypeOfWork(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
		 
	  }
	 
  public void popupmenuiconMethod()
  {
	  popupmenuicon.click();
  }
  
  public void TypesofWorklinkMethod()
  {
	  TypesofWorklink.click();
  }
  
  public void textlinkMethod()
  {
	  textlink.click();
  }
  
  public void nameTextFieldMethod() throws IOException
  {
	  nameTextField.clear();
	  nameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,4));
	  
	  
  }
  public void billableradiobuttonMethod()
  {
	  billableradiobutton.click();
  }
  public void SaveButtonMethod()
  {
	  SaveButton.click();
  }
  
}
