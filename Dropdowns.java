package com.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		System.out.println("The title of website is "+driver.getTitle());
		
		System.out.println("The url of the website is "+driver.getCurrentUrl());
		
		Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//select by index
  
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("5");
		
		Thread.sleep(2000);
		
		//select by visible text
		sel.selectByVisibleText("Magenta");
		
		List<WebElement> options =  sel.getOptions();
		
		for(WebElement eachOption: options)
		{
			System.out.println("The Option is "+eachOption.getText());
		}



		
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	

}
