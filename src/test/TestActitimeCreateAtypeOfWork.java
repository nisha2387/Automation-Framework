package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeCreateATypeOfwork;
import pom.PomActitimeHomePage;
import pom.PomActitimeLoginLogout;

public class TestActitimeCreateAtypeOfWork extends BaseTest
{
@Test
public void submitdata() throws IOException, InterruptedException
{
	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	
	PomActitimeCreateATypeOfwork c=new PomActitimeCreateATypeOfwork(driver);
	c.popupmenuiconMethod();
	c.TypesofWorklinkMethod();
	c.CreateTypeofWorkButtonMethod();
	c.nameTextFieldMethod();
	c.submitButtonMethod();
	
	PomActitimeHomePage h=new PomActitimeHomePage(driver);
	h.LogoutButtonMethod();
}
}
