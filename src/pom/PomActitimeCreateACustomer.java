package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeCreateACustomer extends BasePage implements AutoConstant
{
	public WebDriver driver;
	  @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	  private WebElement EnterCustomerNameTextfield;
	  
	  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	  private WebElement EnterCustomerDescriptionTextField;
	  
	  @FindBy(xpath="//div[.='- Select Customer -']")
	  private WebElement SelectCustomer;
	  
	  @FindBy(xpath="(//div[.='- Select Customer -'])[3]/..//div[.='Big Bang Company']")
	  private WebElement selectcustomerfromdropdownlist;
	  
	  @FindBy(xpath="//div[.='Create Customer']")
	  private WebElement CreateCustomerButton;
	  
	  public PomActitimeCreateACustomer(WebDriver driver)
	  {
		  this.driver=driver;
	   PageFactory.initElements(driver,this);
	   
	   
	   
	  }
	  
	public void EnterCustomerNameMethod() throws InterruptedException, IOException
	  {
		  Thread.sleep(2000);
		  EnterCustomerNameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,2));
		  
	  }
	  public void EnterCustomerDescriptionMethod() throws InterruptedException, IOException
	  {
		  Thread.sleep(2000);
		  EnterCustomerDescriptionTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name,1,3));	
		  
	  }
	  
	  public void SelectCustomerMethod() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  SelectCustomer.click();
		  
	  }
	  public void selectcustomerfromdropdownlistMethod() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  selectbyvisibletext(selectcustomerfromdropdownlist, "Big Bang Company");
	  }
	  public void CreateCustomerButtonMethod() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  CreateCustomerButton.click();  
	  }
	  
	  
	
}
