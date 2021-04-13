package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomfacebookSignup;

public class TestFacebookSignup extends BaseTest

{
 @Test
 public void submitdata() throws IOException
 {
	 PomfacebookSignup f=new PomfacebookSignup(driver);
	 f.submit();
}
}
