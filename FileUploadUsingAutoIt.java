package com.learning.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class FileUploadUsingAutoIt {

	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='file-upload']")));
		 

		 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		 chooseFile.click();
		 
		 Runtime.getRuntime().exec("C:\\Users\\91971\\Documents.file-upload.exe");
		
		 driver.findElement(By.id("file-submit")).click();
		 
		 Thread.sleep(3000);

		 if(driver.getPageSource().contains("File Uploaded!"))
		 {
			 System.out.println("Successfully uploaded the file");
		 }
		 else
		 {
			 System.out.println("File upload failed");
		 }
		 
		
	}

}
