package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeCreateALeaveType;
import pom.PomActitimeLoginLogout;

public class TestActitimeCreateALeaveType extends BaseTest
{
@Test
public void submitdata() throws IOException
{
	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	
	PomActitimeCreateALeaveType lt=new PomActitimeCreateALeaveType(driver);
	lt.submit();
}
}
