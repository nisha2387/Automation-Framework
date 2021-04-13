package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeCreateACustomer;
import pom.PomActitimeHomePage;
import pom.PomActitimeLoginLogout;
import pom.PomActitimeTasksCustomerProjectsPage;

public class TestActitimeCreateACustomer extends BaseTest
{
@Test
public void Submitdata() throws InterruptedException, IOException
{
	
	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	Thread.sleep(2000);
	PomActitimeHomePage h=new PomActitimeHomePage(driver);
	h.TasksiconMethod();
	Thread.sleep(2000);
	PomActitimeTasksCustomerProjectsPage t=new PomActitimeTasksCustomerProjectsPage(driver);
	t.AddNewButtonMethod();
	t.itemcreateNewCustomerMethod();
	
	PomActitimeCreateACustomer c=new PomActitimeCreateACustomer(driver);
	c.EnterCustomerNameMethod();
	//c.EnterCustomerDescriptionMethod();
	//c.SelectCustomerMethod();
	//c.selectcustomerfromdropdownlistMethod();
	c.CreateCustomerButtonMethod();
	h.LogoutButtonMethod();
}
}
