package com.learning.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowExample {
	
	static WebDriver driver = null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
        Set<String> allWindows=driver.getWindowHandles();
        
        for(String eachWindow:allWindows)
        {
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
        }
		
        String childwindow = driver.findElement(By.id("info@qaclickacademy.com")).getText();
		System.out.println("Child window text-->"+childwindow);
		Thread.sleep(2000);


	}
}
