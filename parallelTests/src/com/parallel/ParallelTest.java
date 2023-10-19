package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ParallelTest {
	
	 WebDriver driver;
	    @Test(groups="Chrome")
	    public void LaunchChrome() {
	        System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        try {
	            Thread.sleep(2000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
	    public void TryFacebook1() {
	        System.out.println(Thread.currentThread().getId());
	        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("12345");
	        driver.findElement(By.id("loginbutton")).click();
	    }
}
