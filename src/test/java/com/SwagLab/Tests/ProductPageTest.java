package com.SwagLab.Tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseClass
{
	@BeforeClass
	public void ProductPageSetup()
	{
		 lpage.doLogin("standard_user","secret_sauce");
		
	}
	
	
  @Test
  public void ppgae()
  {
	  List<WebElement> list=ppage.NumberOfProducts();
	  System.out.println(list.size());
  }
}
