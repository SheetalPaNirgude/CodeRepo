package FirstAutomationFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot  {
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https:Google.com/");
			u1.captureScreenshot(driver);
		}

	}
