package FirstAutomationFolder;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	
	

	public static boolean waitForLoaderToDisappear(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'loader')]")));

	}
	
	

	public static void clickElement(WebDriver driver, By ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

		//System.out.println("LOG:INFO - Element is ready to click");

		try {
			element.click();

		} catch (Exception e) {
			System.out.println("LOG:INFO - WebElement Click Failed --- Trying With JS Click");

			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].click()", driver.findElement(ele));
			} catch (Exception e1) {
				System.out.println("LOG:INFO - JS Click Failed --- Trying With Actions Class Click");

				new Actions(driver).moveToElement(driver.findElement(ele)).click().build().perform();

			}

		}
	}

	

	public static void clickElement(WebDriver driver, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));

		//System.out.println("LOG:INFO - Element is ready to click");

		try {
			element.click();

		} catch (Exception e) {
			System.out.println("LOG:INFO - WebElement Click Failed --- Trying With JS Click");

			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].click()", element);
			} catch (Exception e1) {
				System.out.println("LOG:INFO - JS Click Failed --- Trying With Actions Class Click");

				new Actions(driver).moveToElement(element).click().build().perform();

			}

		}
	}


	}

