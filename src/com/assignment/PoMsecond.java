package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoMsecond {
	WebDriver driver;

	public PoMsecond(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public  void config() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	
	public void userNameBx(String us) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(us);
	}
	public void PsBx(String ps) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	public void Login() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();}
	public void logout() {
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]")));
		driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
	}

}
