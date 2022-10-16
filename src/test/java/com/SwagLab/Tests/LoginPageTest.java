package com.SwagLab.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SwagLab.Pages.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends BaseClass {
  @Test
  public ProductPage lpage() 
  {
	  lpage.doLogin("standard_user","secret_sauce");
	  return new ProductPage(driver);
	  
  }
}
