package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtocartPage
{

	private WebDriver driver;
	
	public AddtocartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
private By addbtn=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By cartlink=By.xpath("//a[@class='shopping_cart_link']");
	private By checkoutbtn=By.xpath("//button[text()='Checkout']");
	public void clickOnProduct()
	{
		driver.findElement(addbtn).click();
	}
	
	public void goToCart()
	{
		driver.findElement(cartlink).click();
		
	
	}
	
	public void doCheckout()
	{
		driver.findElement(checkoutbtn).click();
		//return new CheckoutPage(driver);
	}
}
