package com.SwagLab.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo 

{	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	@BeforeClass
	public  void startTest()
	{
	spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//testReport.html");
	report = new ExtentReports();
	report.attachReporter(spark);
	 test= report.createTest("ExtentDemo");
	}
	
  @Test
  public void testcase()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  test.pass("Pass TestCase");
	  test.info("Test case is executed!");
	  test.fail("Test Fail",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Ganes\\OneDrive\\Desktop\\BeizzDTT Tech\\BeizzTech Data\\PNG\\Beizz_Asset 61.png").build());
	  
  }
  
  @AfterClass
  public void endtest()
  {
	  report.flush();
  }
}
