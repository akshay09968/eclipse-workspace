package com.assertt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParallelTest {
	 SoftAssert soft = new SoftAssert();
	    WebDriver driver;
	    @Test
	    public void Launch() {
	        System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
	        driver = new ChromeDriver();
	        try {
	            Thread.sleep(3000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Test(dependsOnMethods = { "Launch" })
	    public void Facebook() {
	        driver.get("https://www.facebook.com");
	        soft.assertEquals("FB Title", driver.getTitle());   
	        try {
	            Thread.sleep(2000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
