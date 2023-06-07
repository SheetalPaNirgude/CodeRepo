package FirstAutomationFolder;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class u1 {
	//WebDriver driver = new ChromeDriver();
	
	public static void captureScreenshot(WebDriver driver) 
{
		try {
	    // for date and time
	    Date date = new Date();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	    String currentDateTime = dateFormat.format(date);
	    System.out.println(currentDateTime);
	    FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),
	    new File("./screenshots/selenium"+ currentDateTime + ".png"));
		}
	  catch(IOException e){
		   System.out.println("Not present");
	  }
	

}}
