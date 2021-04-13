package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeCreateATypeOfwork;
import pom.PomActitimeDeleteTypeOfwork;
import pom.PomActitimeHomePage;
import pom.PomActitimeLoginLogout;

public class TestActitimeDeleteTypeOfWork extends BaseTest
{
@Test
public void submitdata() throws IOException, InterruptedException
{
	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	
	PomActitimeCreateATypeOfwork c=new PomActitimeCreateATypeOfwork(driver);
	c.popupmenuiconMethod();
	c.TypesofWorklinkMethod();
	
	PomActitimeDeleteTypeOfwork d=new PomActitimeDeleteTypeOfwork(driver);
	d.deletelinkMethod();
	
	PomActitimeHomePage h=new PomActitimeHomePage(driver);
	h.LogoutButtonMethod();
	
	
	
}
}
