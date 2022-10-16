package com.SwagLab.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.SwagLab.Pages.AddtocartPage;
import com.SwagLab.Pages.CheckoutPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Pages.ProductPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lpage;
	public ProductPage ppage;
	public AddtocartPage cart;
	public CheckoutPage check;
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@BeforeTest
	public void setup()
	{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//testReport1.html");
			report = new ExtentReports();
			report.attachReporter(spark);
			 test= report.createTest("testcase");
			lpage=new LoginPage(driver);
			ppage=new ProductPage(driver);
			cart=new AddtocartPage(driver);
			check=new CheckoutPage(driver);
			driver.get("https://www.saucedemo.com/");
	}

}
