package com.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Third {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  WebElement country=driver.findElement(By.xpath("//*[@id=\'post-2646\']/div[2]/div/div/div/p/select"));
	  Select ctry=new Select(country);
	  ctry.selectByVisibleText("India");
	  
	  //Listing all the county
	 List<WebElement> options=ctry.getOptions();
	 System.out.println(options.size());
	 for(int i=0;i<options.size()-1;i++) {
		 System.out.println(options.get(i).getText());
	 }
	 
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
