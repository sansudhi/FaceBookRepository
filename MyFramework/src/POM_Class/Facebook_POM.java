package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Facebook_POM extends Base_Page {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	public Facebook_POM(WebDriver driver)
	{
	 super(driver);
	}
	
	public void set_userName(String user)
	{
	 username.sendKeys(user);
	}
	
	public void set_Password(String pwd)
	{
	 password.sendKeys(pwd);
	}
	
	public void click_LoginBtn()
	{
	 loginBtn.click();	
	}
	
}
