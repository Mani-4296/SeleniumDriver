package com.selenium.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Initiating chromeDriver

		driver.get("https://www.google.co.in/"); // opening the website on chromedriver
		System.out.println("URL of the current page is: " + driver.getCurrentUrl()); // printing the url of the current
																						// page
		WebElement searchBox = driver.findElement(By.name("q")); // creating webelement for search box
		searchBox.sendKeys("Selenium Browser Driver"); // entering the search query
		searchBox.submit(); // submitting search query
		driver.manage().window().maximize(); //maximizing the browser window
		System.out.println("Search results URL is: " + driver.getCurrentUrl()); //print the navigated url for search query
		//driver.close(); // closing this driver

	}

}
