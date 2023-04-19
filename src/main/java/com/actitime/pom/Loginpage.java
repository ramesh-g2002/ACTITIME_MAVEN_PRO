package com.actitime.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id="username")
WebElement untbx;
@FindBy (name="pwd")
WebElement pwdtbx;
@FindBy(xpath="//div[text()='Login ']")
WebElement lgbtn;
public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void login(String un,String pwd) 
{
	untbx.sendKeys(un);
	pwdtbx.sendKeys(pwd);
	lgbtn.click();
		
}
}
