package com.SwagLab.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseClass
{
	
	@BeforeClass
	public void checkoutsetup()
	{
		lpage.doLogin("standard_user","secret_sauce");
		test.pass("Login Test Case Completed!");
		cart.clickOnProduct();
		test.pass("Clicked on Products");
		cart.goToCart();
		test.pass("Cart test");
		cart.doCheckout();
		test.pass("test process completed");
		report.flush();
	}
  @Test
  public void testcase() 
  {
	  check.fillDetails();
  }
}
