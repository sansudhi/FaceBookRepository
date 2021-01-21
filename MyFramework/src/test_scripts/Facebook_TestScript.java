package test_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Class.Facebook_POM;
import generic.Base_Test;
import generic.FrameWork_Constants;
import generic.generic_read_Excel;

public class Facebook_TestScript extends Base_Test implements FrameWork_Constants {
	
	
	@Test
	public void facebookLogin() throws InterruptedException
	{
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Thread.sleep(5000);
	String user=generic_read_Excel.getData("Sheet1", 0, 0);
	String password=generic_read_Excel.getData("Sheet1", 0, 1);
		
	Facebook_POM face=new Facebook_POM(driver);
	face.set_userName(user);
	face.set_Password(password);
	face.click_LoginBtn();
		
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains("Facebook"));
		
	String str=driver.getTitle();
	System.out.println(str);
	Assert.assertEquals(str.contains("Facebook"),true );
		
	}
	

}
