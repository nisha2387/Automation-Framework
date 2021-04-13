package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeDeleteLeaveType;
import pom.PomActitimeLoginLogout;

public class TestActitimeDeleteLeaveType extends BaseTest
{
 @Test
 public void submitdata() throws IOException, InterruptedException
 {
	 PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
		l.submit();
		
		PomActitimeDeleteLeaveType dlt=new PomActitimeDeleteLeaveType(driver);
		dlt.submit();
		dlt.DeleteCellMethod();
 }
}
