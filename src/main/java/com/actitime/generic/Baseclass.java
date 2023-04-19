package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.Homepage;
import com.actitime.pom.Loginpage;

public class Baseclass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	public WebDriver driver;
	private String url;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
		driver.close();

	}
@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login",true);
	FileInputStream fis=new FileInputStream("./src/test/resources/data/common.property");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("url");
	 String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	
	driver.get(url);
	Loginpage l=new Loginpage(driver);
	l.login(un, pwd);
	
	
	
	

}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	Homepage h=new Homepage(driver);
	h.Logout();

}
}