package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssWindowHandling {
	
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
        Set<String> allWindows=driver.getWindowHandles();
        
        for(String eachWindow:allWindows)
		{
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
		}
        
        List<WebElement> table=driver.findElements(By.xpath("//tbody//tr"));
		System.out.println(table.size());
		
		for(int i=1;i<=table.size();i++)
			
		{
			List<WebElement> columns=driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
			
				
		for(WebElement eachColumn:columns)
		{
			System.out.println(eachColumn.getText());
		}
		
		
		Thread.sleep(2000);
	
        String ChildWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='2']")).click();
        
        List<WebElement> table1=driver.findElements(By.xpath("//tbody"));
		System.out.println(table.size());
		
		
		for(int j=1;i<=table.size();i++)
			
		{
			List<WebElement> columns1=driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
			
				
		for(WebElement eachColumn:columns1)
		{
			System.out.println(eachColumn.getText());
		}
        
        
		Thread.sleep(2000);

        String child =driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='3']")).click();
        
        List<WebElement> table2=driver.findElements(By.xpath("//tbody"));
		System.out.println(table.size());
		
		for(int k=1;i<=table.size();i++)
			
		{
			List<WebElement> columns2=driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
			
				
		for(WebElement eachColumn:columns2)
		{
			System.out.println(eachColumn.getText());
		}
	

        
        
	}
		}
		
		}
	}
}

        

		

	

	
		
	
		
	
	
	

