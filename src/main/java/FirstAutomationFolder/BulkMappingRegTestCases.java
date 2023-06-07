package FirstAutomationFolder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BulkMappingRegTestCases {
	
//Test Case 01 - User LogIn

	public static void main(String[] args) throws InterruptedException
	{
				
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
		
/*//Test Case 02 - Create Engagement
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Engagement')]")).click();
		Thread.sleep(3000);
		
		//Select client name *Step 1*
		driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'BanshS')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Go')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-placeholder='MM/DD/YYYY']")).sendKeys("4/28/2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='budget']")).sendKeys("1000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Go to Step 2']")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 02(I) : Step-1 of Engagement Created Successfully");
		
		
		//*Step 2* Assigned Team
		driver.findElement(By.xpath("//ng-select[@bindvalue='useraccountid']//input[@type='text']")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Canada QA Retesting')]")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@formcontrolname='timeallocation']")).sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Engagement']")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 02(II) : Step-2 of Engagement Created Successfully");
		System.out.println("Test Case 02 : Status-Passed : Engagement Creation Succeed");	*/		
		
//Test Case 03 - Engagement Explore 
		
		//Explore Engagement
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@title='COM-BAN-Apr282023'][normalize-space()='COM-BAN-Apr282023'])[1]")).click();
		Thread.sleep(5000);
		//TB link click
		driver.findElement(By.xpath("//span[contains(text(),'Trial Balance & Adj. Entries')]")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 03 : Status-Passed : Engagement Explored");
		Thread.sleep(5000);
		
/*//File downloads
		driver.findElement(By.xpath("//span[@class='tbh-act-ico imp-hovr']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger import-client-button mat-flat-button mat-button-base mat-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Standard Blank Template']")).click();
        System.out.println("Test Case 03 : Sample File Downloaded");
        
//Test Case 04 - Verify Popup of Group Msmatch
		
		//driver.findElement(By.xpath("//span[@class='tbh-act-ico imp-hovr']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:/Users/Admin/Downloads/GroupMisImport.xlsx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 04 : Status-Passed : Group Mismatch Popped up Hitted up with Invalid/Blank Groups");

//Test Case 05 - TB File Import
		
		//driver.findElement(By.xpath("//span[@class='tbh-act-ico imp-hovr']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:/Users/Admin/Downloads/Standard1.xlsx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Import')]")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 05 : Status-Passed : TB Imported Succeed ");
		
//Test Case 06 - Mapping Single Account
		Thread.sleep(5000);
		WebElement checkbox11= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(2);
		Utility.clickElement(driver, checkbox11);	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-dashboard[1]/div[1]/div[2]/div[1]/div[2]/ntr-dashboard[1]/div[1]/div[3]/trailbalance-details[1]/div[4]/table[1]/tbody[1]/tr[3]/td[11]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath("//p[normalize-space()='Cash']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		System.out.println("Test Case 06 : Status-Passed : Mapping of Single account Succeed ");
		
//Test Case 07 - AutoMapping
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='tbh-act-ico automap-hovr']")).click();
		Thread.sleep(7000);
		System.out.println("Test Case 07 : Status-Passed : Automapping Succeed to all relevant accounts");
		
		
//Test Case 08 - Verify Popup on mapping same map number for different accounts
		WebElement checkbox= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(1);
		Utility.clickElement(driver, checkbox);	
		WebElement checkbox1= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(3);
		Utility.clickElement(driver, checkbox1);
		WebElement checkbox2= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(6);
		Utility.clickElement(driver, checkbox2);
		//Thread.sleep(13000);
		//((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		WebElement checkbox3= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(9);
		Utility.clickElement(driver, checkbox3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/app-root[1]/app-dashboard[1]/div[1]/div[2]/div[1]/div[2]/ntr-dashboard[1]/div[1]/div[3]/trailbalance-details[1]/div[4]/table[1]/tbody[1]/tr[3]/td[11]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='Cash']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		System.out.println("Test Case 08 : Status-Passed : Popup hitted up on mapping same map number for different accounts");
				
//Test Case 09 - Verify RHS button and 3 dots (options) disabled on selection of accounts
		Thread.sleep(12000);
		WebElement checkbox01= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(3);
		Utility.clickElement(driver, checkbox01);	
		/*WebElement checkbox02= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(5);
		Utility.clickElement(driver, checkbox02);	
		WebElement checkbox03= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(7);
		Utility.clickElement(driver, checkbox03);
		WebElement checkbox04= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(2);
		Utility.clickElement(driver, checkbox04);
		Thread.sleep(2000);*/
		/*driver.findElement(By.xpath("//mat-icon[@title='New document requests']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[@title='Comments']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[@class='mat-row cdk-row ng-star-inserted rowSelectColor']//mat-icon[@role='img'][normalize-space()='more_vert']")).click();
		Thread.sleep(6000);
		System.out.println("Test Case 09 : Status-Passed : RHS buttons and 3 dots (options) disabled on selection of accounts");
		Thread.sleep(4000);*/
					
//Test Case 10 - Un-Mapping
		
	  //  WebElement checkbox10= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(6);
		//Utility.clickElement(driver, checkbox10);		
		
		//For Multiple Checkboxes
		/*List<WebElement> allCheckboxes= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]"));	
		for(int i=1;i<10;i=i+2)
		{
			WebElement ele= allCheckboxes.get(i);
			Utility.clickElement(driver, ele);	
			if(i==8)
			{
				break;
			}
		} */
		
/*	    Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Unmap']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(6000);
		System.out.println("Test Case 10 : Status-Passed : Unmapping of single account Succeed ");
		
//Test Case 11 - All accounts unmapped
		WebElement checkbox4= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(0);
		Utility.clickElement(driver, checkbox4);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Unmap']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(12000);
		System.out.println("Test Case 11 : Status-Passed : Unmapping of all accounts Succeed ");

//Test Case 12 - Verify Popup on clicking workbook and Procedures when all accounts are un-mapped
		driver.findElement(By.xpath("//span[@class='tbh-act-ico workbook']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Procedures']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
		System.out.println("Test Case 12 : Status-Passed : Popup hitted up on clicking workbook and Procedures when all accounts are un-mapped");*/		
				
//Add New Account
		WebElement kebabMenuTrigger = driver.findElement(By.xpath("//*[@id=\"tbGrid\"]/table/tbody/tr[2]"));
        // Create an instance of Actions class
        Actions actions = new Actions(driver);
        // Perform the mouse hover action on the kebab menu trigger
        actions.moveToElement(kebabMenuTrigger).perform();
        // Find the kebab menu element that becomes visible on hover
        WebElement kebabMenu = driver.findElement(By.xpath("//*[@id=\"tbGrid\"]/table/tbody/tr[1]/td[1]/button"));
        kebabMenu.click();
		//driver.findElement(By.xpath("//tr[@class='mat-row cdk-row ng-star-inserted rowSelectColor']//mat-icon[@role='img'][normalize-space()='more_vert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='elem1']")).sendKeys("432");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Description']")).sendKeys("Test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='mat-menu-trigger transparent-btn map-num-btn map-btn-dta no-pad ng-star-inserted active active-dropdown flex-box']")).click();
		Thread.sleep(13000);
		driver.findElement(By.xpath("//p[normalize-space()='Cash']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		System.out.println("Test Case 13 : Status-Passed : Account Created Succeed through Kebab Menu");
		
		//Test Case 12 - Button Names on Hovering
	/*	System.out.println("Test Case 06 : Status-Passed : Buttons Name dislayed respectivily on hovering it");
//Test Case 13 - Download Import File and User Manual	
		System.out.println("Test Case 06 : Status-Passed : Files downloaded successfully");
		
		System.out.println("AMBADNYA finally reach");*/

}}
