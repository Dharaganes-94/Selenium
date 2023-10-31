package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeClass {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("radioButton")).click();
		Thread.sleep(2000);

	    Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));
	    
	    sel.selectByIndex(1);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("checkBoxOption1")).click();
	    driver.findElement(By.name("checkBoxOption3")).click();
	    
	    
	    
	    
	    
	    

}
	}
