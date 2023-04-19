package com.actitme.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class CustomerModule extends Baseclass {
@Test
public void createCustomer()
{
	String text = driver.getTitle();
	System.out.println("title:"+text);
	
}
}
