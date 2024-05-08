package com.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class PoMsecondTest {
	WebDriver driver;
	PoMsecond p1;
  @Test
  public void f() {
	 p1.userNameBx("student");
	 p1.PsBx("Password123");
	 p1.Login();
	   }
  @BeforeTest
  public void before() {
	  p1=new PoMsecond(driver);
	  p1.config();
  }
  @AfterTest
  public void after() {
	  p1.logout();
	  driver.close();
  }

}
