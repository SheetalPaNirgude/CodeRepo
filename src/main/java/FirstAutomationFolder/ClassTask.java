package FirstAutomationFolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask 
	{
	
@SuppressWarnings("unused")
public static void main(String[] args) throws InterruptedException
{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		WebElement username=driver.findElement(By.id("email1"));
		username.sendKeys("sheetal@test.com");
		
		WebElement password=driver.findElement(By.id("password1"));
		password.sendKeys("123456");
		
		WebElement button=driver.findElement(By.className("submit-btn"));
		button.click();
		Thread.sleep(4000);
		
		WebElement n =driver.findElement(By.className("errorMessage"));
		String ErrorMessage = n.getText();
		System.out.println("Error Message is: " + ErrorMessage);
	}
}
