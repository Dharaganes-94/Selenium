package com.learning.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightTicket {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
       		
Select sel = new Select(driver.findElement(By.xpath("//option[contains(text(),'Departure City')]")));
		
		sel.selectByVisibleText("Chennai (MAA)");

	}

}
