package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeCreateATypeOfwork;
import pom.PomActitimeEditTypeOfWork;
import pom.PomActitimeLoginLogout;

public class TestActitimeEditTypeofwork extends BaseTest
{
@Test
public void submitdata() throws IOException, InterruptedException
{

	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	
	PomActitimeEditTypeOfWork e=new PomActitimeEditTypeOfWork(driver);
	e.popupmenuiconMethod();
	e.TypesofWorklinkMethod();
	e.textlinkMethod();
	e.nameTextFieldMethod();
	e.billableradiobuttonMethod();
	e.SaveButtonMethod();
}
}
