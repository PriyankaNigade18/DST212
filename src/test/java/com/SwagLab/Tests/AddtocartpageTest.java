package com.SwagLab.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Pages.AddtocartPage;

public class AddtocartpageTest extends BaseClass
{
	@BeforeClass
	public void addToCartPageSetup()
	{
		lpage.doLogin("standard_user","secret_sauce");
	}
  @Test(priority=1)
  public void cartTest() 
  {
	  cart.clickOnProduct();
	  cart.goToCart();
	  //return new AddtocartPage(driver);
	  
  }
  
  @Test(priority=2)
  public void checkout()
  {
	  cart.doCheckout();
	  
  }
}
