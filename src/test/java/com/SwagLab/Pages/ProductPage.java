package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage
{
	
	private WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By list=By.xpath("//div[@id='inventory_container' and @class='inventory_container']//div//div[@class='inventory_item_label']");

		public List<WebElement> NumberOfProducts()
		{
			return driver.findElements(list);
		}
	

}
