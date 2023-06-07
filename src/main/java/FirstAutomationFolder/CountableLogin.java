package FirstAutomationFolder;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountableLogin  {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException
	{

		
		ChromeOptions options = new ChromeOptions();
		//Download file into the folder
		Map<String, Object> downloadMap = new HashMap<String, Object>();
		
		downloadMap.put("download.defaut_directory",System.getProperty("user.dir")+"/Downloads/");
		options.setExperimentalOption("prefs",downloadMap);
		
		
		WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://platform.countable.co/login");
	//Zoom
  // ((JavascriptExecutor)driver).executeScript("document.body.style.zoom=.9");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Window maximize 
	driver.manage().window().maximize();
	
	//User-name and password input
	WebElement username=driver.findElement(By.id("mat-input-0"));
	username.sendKeys("canadaqaretesting@yopmail.com");
	WebElement password=driver.findElement(By.id("mat-input-1"));
	password.sendKeys("Count@123");
	
	
	
    //Login Button
	WebElement button=driver.findElements(By.xpath("//span[contains(text(),'Login')]")).get(0);
	button.click();
	Thread.sleep(7000);
	
	//Loader wait from utility class and click on Create Engagement
	if(Utility.waitForLoaderToDisappear(driver))
	{
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'library_books')]"))).click();

	}
	
	/*
	//Click Create Engagement button
	Thread.sleep(2000);
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
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@formcontrolname='budget']")).sendKeys("1000");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Go to Step 2']")).click();
	Thread.sleep(7000);
	
	
	//*Step 2* Assigned Team
	driver.findElement(By.xpath("//ng-select[@bindvalue='useraccountid']//input[@type='text']")).click();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Canada QA Retesting')]")).click();	
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input[@formcontrolname='timeallocation']")).sendKeys("100");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[normalize-space()='Create Engagement']")).click();
	Thread.sleep(7000);
	*/
	//Explore Engagement
	driver.findElement(By.xpath("(//a[@title='COM-BAN-Apr282023'][normalize-space()='COM-BAN-Apr282023'])[1]")).click();
	Thread.sleep(5000);
	
	//TB link click
	driver.findElement(By.xpath("//span[contains(text(),'Trial Balance & Adj. Entries')]")).click();
	Thread.sleep(5000);
	
	
	//Import button click
	driver.findElement(By.xpath("//span[@class='tbh-act-ico imp-hovr']")).click();
	Thread.sleep(7000);
	//use contains
	
	
	//WebDriver driver1 = new ChromeDriver(options);
	driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger import-client-button mat-flat-button mat-button-base mat-primary']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='Standard Blank Template']")).click();
	File destination=new File(System.getProperty("user.dir")+"/Downloads/");
	
	
	/*boolean status=false;
	
	for(int i=0;i<15;i++)
	{
		
			System.out.println("Current count is "+destination.listFiles().length);
		
			if(destination.listFiles().length==3)
			{
				status=true;
				break;
			}
			else 
			{
				System.out.println("Waiting for file download");
				Thread.sleep(5000);
				
			}
		
	}
	
	if(status)
	{
		System.out.println("File downloaded");
	}
	else
	{
		System.out.println("File not downloaded");
	}*/
	
	System.out.println("ASA");

}}
		
	/*WebElement downloadButton = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger import-client-button mat-flat-button mat-button-base mat-primary']"));
	downloadButton.click();
	Thread.sleep(5000);
	
	File downloadFolder=new File(downloadDir);
	
	File[] arrayFiles=downloadFolder.listFiles();
	
	if(arrayFiles.length>0)
	{
		System.out.println("FIle Downloaded Successfully");
	
	}
	else
	{
		System.out.println("No File Downloaded");
	
	}
	
	for(File f:arrayFiles)
	{
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		


	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//
		
	
	/*
	//Browse link click
	driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:/Users/Admin/Downloads/Standard1.xlsx");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Import')]")).click();
	Thread.sleep(14000);
	
	
	//Auto-mapping
	driver.findElement(By.xpath("//span[@class='tbh-act-ico automap-hovr']")).click();
	System.out.println("1");
	Thread.sleep(7000);
	*/
	
	//Un-Mapping
/*	WebElement checkbox= driver.findElements(By.xpath("//table[contains(@class,'trialBalTable')]//input//parent::span[1]")).get(3);
	
	Utility.clickElement(driver, checkbox);*/
	
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
	
	/*Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@title='Unmap']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
	System.out.println("AMBADNYA finally reach");*/
	
	

