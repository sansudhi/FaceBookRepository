package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_Test implements FrameWork_Constants 


{

public WebDriver driver;	
@BeforeMethod
public void open_Application()
{
 System.setProperty(Gecko_Key,Gecko_Value);
 driver=new FirefoxDriver();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.get("https://www.facebook.com/");
}

@AfterMethod
public void close_Application(ITestResult res) throws IOException
{
	if(ITestResult.SUCCESS==res.getStatus())
	{
	Generic_ScreenShot.getPhoto(driver);	
	}
	driver.quit();
}
	

}
