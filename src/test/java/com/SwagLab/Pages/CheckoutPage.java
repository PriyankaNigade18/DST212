package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;

public class CheckoutPage
{

	
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void fillDetails()
	{
		System.out.println("Details filled successfully");
	}
}
