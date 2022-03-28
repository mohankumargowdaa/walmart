package com.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.1.0");
		WebElement ele = driver.findElement(By.xpath("//a[@href='http://www.apache.org/licenses/LICENSE-2.0.txt']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

}
