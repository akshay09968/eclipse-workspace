package coms;

import org.openqa.selenium.chrome.ChromeDriver;	
	
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Assignment_Practice_1_3 {

	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#container > div > div._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(1) > div > div._1oHPGm > div > div > div._2hKRMr._2CfYpZ > div > div:nth-child(5) > div > a > div._10pg75 > div > img")).click();
		Thread.sleep(2000);	
//		button.click();
		driver.close();
		
	}

}
