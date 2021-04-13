package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitimeLoginLogout;

public class TestActitimeloginlogout extends BaseTest
{
	@Test
	public void submitdata() throws IOException
	{
		PomActitimeLoginLogout l=new PomActitimeLoginLogout(driver);
		l.submit();
				
	}

}
