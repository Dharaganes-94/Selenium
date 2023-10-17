package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssign {
	
	static WebDriver driver =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("APjFqb")).sendKeys("selenium download");
		 Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//h3[text()='Downloads']")).click();
		 Thread.sleep(2000);

		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
