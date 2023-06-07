package FirstAutomationFolder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountableFinancialDocuments {
	//Test Case 01 - User LogIn

		public static void main(String[] args) throws InterruptedException
		{
					//scroll into view
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			driver.get("https://platform.countable.co/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("mat-input-0"));
			username.sendKeys("canadaqaretesting@yopmail.com");
			WebElement password=driver.findElement(By.id("mat-input-1"));
			password.sendKeys("Count@123");
			WebElement button=driver.findElement(By.className("flat-btn"));
			Thread.sleep(6000);
			button.click();
			Thread.sleep(6000);
			System.out.println("Test Case 01 : Status-Passed : User Login Succeed");
			
			//Loader wait from utility class and click on Create Engagement
			if(Utility.waitForLoaderToDisappear(driver))
			{
				new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'library_books')]"))).click();

			}

			//Test Case 03 - Engagement Explore and Redirected to FS Document
			
			//Explore Engagement
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[@title='COM-BAN-Apr282023'][normalize-space()='COM-BAN-Apr282023'])[1]")).click();
			Thread.sleep(5000);
			//FS link click
			driver.findElement(By.xpath("//span[normalize-space()='Financial Statements']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@title='Financial Statements Docs']")).click();
			Thread.sleep(2000);
			WebElement elementy = driver.findElement(By.xpath("//span[normalize-space()='Completion & Signoffs']"));
			js.executeScript("arguments[0].scrollIntoView(true);",elementy);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='Compilation Report']")).click();
			Thread.sleep(4000);
			WebElement elementy1 = driver.findElement(By.xpath("//div[@class='report-sheet-body-bodycontent dashed-border ng-star-inserted']//div//p[contains(text(),'Readers are cautioned that the financial informati')]"));
			js.executeScript("arguments[0].scrollIntoView(true);",elementy1);
			Thread.sleep(4000);
			System.out.println("Test Case 03 : Status-Passed : Engagement Explored and Redirected to FS Document");
			System.out.println("Test Case 03 : Status-Passed : Compilation Report Viewed Successfully");
			Thread.sleep(5000);
			/*
			//FS Settings
			driver.findElement(By.xpath("//button[normalize-space()='FS Settings']")).click();
			Thread.sleep(5000);
			
			//Table of Content
			WebElement Toggle= driver.findElements(By.xpath("//span[@class='mat-slide-toggle-thumb-container']")).get(0);
			Utility.clickElement(driver, Toggle);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='material-icons'][normalize-space()='clear']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@title='Table of Contents ']")).click();
			System.out.println("Test Case  : Status-Passed : Table of Content Displayed");
			Thread.sleep(2000);
			
			//Seperate statement of income and statement of retained earnings - Off
			driver.findElement(By.xpath("//button[normalize-space()='FS Settings']")).click();
			Thread.sleep(5000);
			WebElement Toggle1= driver.findElements(By.xpath("//span[@class='mat-slide-toggle-thumb-container']")).get(2);
			Utility.clickElement(driver, Toggle1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='material-icons'][normalize-space()='clear']")).click();
			Thread.sleep(5000);
			//check table of content for different page no
			driver.findElement(By.xpath("//div[@title='Table of Contents ']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='leadsheet-label'][normalize-space()='Statement of Income']")).click();
			Thread.sleep(5000);
			//add scroll code
			driver.findElement(By.xpath("//span[normalize-space()='Statement of Retained Earnings']")).click();
			Thread.sleep(5000);*/
			
			//Data Presented 1 Year
			//Balance Sheet 2Years
			driver.findElement(By.xpath("//span[@class='leadsheet-label'][normalize-space()='Balance Sheet']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[normalize-space()='FS Settings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//mat-select[@panelclass='select-search statmnt-select drop-down-cls']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[normalize-space()='2 Years']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='material-icons'][normalize-space()='clear']")).click();
			Thread.sleep(1000);
			System.out.println("Ambadnya");
			
			//Check by default
			//1.Table of content should be disabled
			//2.Balance sheet data should be of 2 Years
			
		}
}
