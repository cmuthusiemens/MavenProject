package framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethodsAndAssertions extends Driver {

	protected void open(String url) throws Exception {
		try {
			driver.get(url);

		} catch (Exception e) {
			Logger.error("Exception in open()");
			Logger.error(e.toString());
			throw new Exception(e);
		}
	}
	
	
	protected void type(String testdata, By by) throws Exception {
		try {

			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(testdata);
		} catch (Exception e) {
			Logger.error("Exception in type()");
			Logger.error(e.toString());
			throw new Exception(e);

		}

	}

	protected void click(By by) throws Exception {
		try {
			// takeScreenshot();
			driver.findElement(by).click();
		} catch (Exception e) {
			Logger.error("Exception in click()");
			Logger.error(e.toString());
			throw new Exception(e);

		}

	}

	protected String takeScreenshot(String string) throws IOException {
		String directoryName = System.getProperty("user.dir") + "//Screenshots"+"_"+string+"//";
		File directory = new File(directoryName);
	    if (! directory.exists()){
	        directory.mkdir();
	    }
	    
	   	    
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "//Screenshots"+"_"+string+"//"+ GetTimeStampValue()+ ".png");
		String dest = System.getProperty("user.dir") + "//Screenshots"+"_"+string+"//"+ GetTimeStampValue()+ ".png";
		FileHandler.copy(srcFile, destFile);
		return dest;

	}
	
	
	

	public String GetTimeStampValue() throws IOException {
		Date d = new Date();
		String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
		return TimeStamp;
	}

	/************************* Assertions ************************************/

	protected void verifyPageTitleAssertion(String title) {
		Assert.assertEquals(driver.getTitle(), title, "Title is not matching");
	}
}
