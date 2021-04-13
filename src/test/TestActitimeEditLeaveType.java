package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeEditLeaveType;
import pom.PomActitimeLoginLogout;

public class TestActitimeEditLeaveType extends BaseTest
{
@Test
 public void submitdata() throws IOException
 {
	PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
	l.submit();
	
	PomActitimeEditLeaveType elt=new PomActitimeEditLeaveType(driver);
	elt.submit();
 }
}
