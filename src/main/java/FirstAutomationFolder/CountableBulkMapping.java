package FirstAutomationFolder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountableBulkMapping  {

	public static void main(String[] args) throws InterruptedException 
	{
	//application link	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email1")).sendKeys("admin@email.com");
	driver.findElement(By.id("password1")).sendKeys("admin@123");
	Thread.sleep(2000);
	
	driver.findElement(By.className("submit-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='nav-menu-item-manage']/span[text()='Manage']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='nav-menu-item-hover-div']//a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:/Users/Admin/Downloads/5636 Retest.mp4");
	Thread.sleep(2000);
	Alert alt=driver.switchTo().alert();
	String alt1=alt.getText();
	System.out.println(alt1);
	Thread.sleep(2000);
	alt.accept();
	
	driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:/Users/Admin/Downloads/pre wedding/PAN00001.jpg");
	Thread.sleep(2000);
	Alert altt=driver.switchTo().alert();
	String alt2=altt.getText();
	System.out.println(alt2);
	Thread.sleep(2000);
	alt.accept();
	
	driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:/Users/Admin/Downloads/final.jpg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h3[text()='Course Name']")).sendKeys("Test 01");
	
	

	}

}