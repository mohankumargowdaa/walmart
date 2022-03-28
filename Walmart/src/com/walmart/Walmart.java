package com.walmart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.testng.Assert;

import genericLibrary.WebDriverUtility;

public class Walmart {
	public static void main(String[] args) throws IOException, InterruptedException, FindFailed {
		// Create object of ChromeOptions Class
		ChromeOptions opt=new ChromeOptions();
		 
		// pass the debuggerAddress and pass the port along with host. Since I am running test on local so using localhost
		opt.setExperimentalOption("debuggerAddress","localhost:9222");
		// pass ChromeOptions object to ChromeDriver constructor
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Random ran=new Random();
//		int randomNumX = ran.nextInt(1000);
//		int randomNumY = ran.nextInt(800);
//		System.out.println(randomNumX+" "+ randomNumY);
//		 Dimension dimension = new Dimension(randomNumX, randomNumY);
		
		//driver.manage().window().maximize();
		//java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //Dimension dimension = new Dimension((int)screenSize.getWidth(), (int)screenSize.getHeight());
//        //driver.manage().window().setSize(dimension);
//		try {
//			driver.manage().window().maximize();
//			
//		}
//		catch (Exception e) {
//			Dimension dimension = new Dimension(1000, 700);
//	        driver.manage().window().setSize(dimension);
//	        driver.manage().window().maximize();
//		}
		// now you can use now existing Browser
			driver.get("https://www.walmart.com");
			
			//WebDriverUtility.handleCaptha(driver);
//			Screen s=new Screen();
//			Pattern p=new Pattern("./sikuliImg/press&Hold.png");
//			s.wait(p, 10);
//			s.hover(p);
//			s.mouseDown(Button.LEFT);
//			Thread.sleep(30);
//			s.mouseUp(Button.LEFT);
		String homepageTitle = driver.getTitle();
		Assert.assertEquals(homepageTitle, "Walmart.com | Save Money. Live Better");
		WebDriverUtility.getScreenShot(driver, "homePage");
		
		//Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("electronics");
		//driver.findElement(By.xpath("//a[@aria-label='electronics in All Departments']")).click();
		//WebDriverUtility.handleCaptha(driver);
		driver.findElement(By.xpath("//i[@class='ld ld-Search absolute']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

