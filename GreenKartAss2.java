package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartAss2 {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ber");
		Thread.sleep(3000);
		
		List<WebElement> allCartButtons=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for(WebElement eachCartButton:allCartButtons)
		{
			Thread.sleep(1000);
			eachCartButton.click();
		}
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("promoCode")));
		
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		
		String code = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println("The promo code applied"+code);
		
		String totalDiscount =


	}

}
