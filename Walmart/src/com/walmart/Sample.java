package com.walmart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import genericLibrary.WebDriverUtility;

public class Sample {
	public static void main(String[] args) throws IOException {

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
		// now you can use now existing Browser
		driver.get("https://walmart.com");
		
		String homepageTitle = driver.getTitle();
		Assert.assertEquals(homepageTitle, "Walmart.com | Save Money. Live Better");
		WebDriverUtility.getScreenShot(driver, "homePage");
		
		
		driver.findElement(By.name("q")).sendKeys("electronics");
		driver.findElement(By.xpath("//a[@aria-label='electronics in All Departments']")).click();
		
	}

}
