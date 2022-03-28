package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class WebDriverUtility {
	
	public static void getScreenShot(WebDriver driver,String pageName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenShot/"+pageName+".png");
		FileUtils.copyFile(src, dst);
	}
	public static String getDate() {
		Date date=new Date();
		String dateData = date.toString().replaceAll(" ","_").replaceAll(":", "_");
		return dateData;
	}

public static void handleCaptha(WebDriver driver) {
	for(int i=0;;i++) {
		try {
	String popupHeader = driver.findElement(By.xpath("//h2[@class='w_Gx']")).getText();
	if(popupHeader.equals("Robot or human?"))
	{
		Actions act=new Actions(driver);
	WebElement pressAndHold = driver.findElement(By.xpath("//div[@aria-label='Press & Hold']//p[.='Press & Hold']"));
	act.moveToElement(pressAndHold).perform();
	act.clickAndHold(pressAndHold).perform();
	act.pause(Duration.ofSeconds(30)).perform();
	act.release(pressAndHold).perform();
		
		
		
	
	
	}
	else {
		break;
		}
	}
		catch (Exception e) {
			break;
		}
	}
}

}
