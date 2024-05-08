package com.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Fourth {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("g4072-fullname")).sendKeys("Kishore");
	  driver.findElement(By.name("g4072-email")).sendKeys("Kishore@gmail.com");
	  driver.findElement(By.id("g4072-phonenumber")).sendKeys("8888888");
	  WebElement gender=driver.findElement(By.xpath("//select[@id='g4072-gender']"));
	  Select gen=new Select(gender);
	  gen.selectByVisibleText("Male");
	  driver.findElement(By.name("g4072-yearsofexperience")).click();
	  driver.findElement(By.id("g4072-skills-Functional testing")).click();
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,500)");

	  WebElement qa=driver.findElement(By.id("g4072-qatools"));
	  Select Tools=new Select(qa);
	  Tools.selectByVisibleText("Appium");
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/textarea[1]")).
	  sendKeys("good");
	  driver.findElement(By.className("wp-block-button__link")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://qavalidation.com/demo-form/?contact-form-hash=875a4285a37d67e2416c29f39cb2425c0d8d255c");
  }

  @AfterTest
  public void afterTest() {
	  if(driver.getCurrentUrl().contains("form-id")) {
		  System.out.println("Success");
	  }
	  else {
		  System.out.println("fail");
	  }
  }

}
