package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartDiscount {
	
	static WebDriver driver =null;

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
		
          List<WebElement> totalPrice=driver.findElements(By.xpath("//tbody/tr/td[2]"));
          
          int totPrice=0;
  		
  		for(WebElement eachValue:totalPrice)
  		{
  			String toalPrice=eachValue.getText();
  			int price= Integer.parseInt(toalPrice); 
  			totPrice=totPrice+price; 
  			
  		}
  		
  		System.out.println("TotalPrice after calculation-->"+totPrice);
	
	}

}
	
}
