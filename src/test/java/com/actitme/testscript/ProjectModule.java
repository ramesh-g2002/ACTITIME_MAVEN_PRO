package com.actitme.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectModule  {
@Test
public void CreateProject()
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String text=driver.getTitle();
driver.close();
}
}
