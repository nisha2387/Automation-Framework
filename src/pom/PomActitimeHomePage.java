package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;

public class PomActitimeHomePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	   @FindBy(id="container_tasks")
	   private WebElement Taskslink; 
	   
	   @FindBy(xpath="//a[.='Logout']")
	   private WebElement LogoutButton;
	   
	   @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	   private WebElement popupmenuicon;
	   
	   public PomActitimeHomePage(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
		   this.driver=driver;
		   
	   }
	    public void TasksiconMethod()
	    {
	    	Taskslink.click();
	    }
	       
	   public void LogoutButtonMethod()
	   {
		   LogoutButton.click();
	   }
	   
	   public void popupmenuiconMethod() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   /*JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",popupmenuicon );*/
		   popupmenuicon.click();
	   }
}
