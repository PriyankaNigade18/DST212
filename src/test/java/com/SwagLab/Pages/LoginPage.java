package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private By un=By.name("user-name");
	private By psw=By.name("password");
	private By btn=By.name("login-button");
	public String getLoginPTitle()
	{
		return driver.getTitle();
	}
	
	public String getLoginCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	public void doLogin(String usern,String passw)
	{
		driver.findElement(un).sendKeys(usern);
		driver.findElement(psw).sendKeys(passw);
		driver.findElement(btn).click();
	}


}
