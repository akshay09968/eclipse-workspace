package coms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	/*	driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar"); //xpath for search box
		WebElement searchIcon = driver.findElement(By.xpath("//input[@id='gh-btn']"));//xpath for search button
		searchIcon.click();
		
		//driver.navigate().back();
	*/	
		//---------------Example -2----------------
		        driver.get("https://accounts.lambdatest.com/register");
		        //Relative xpath for organization field
		        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("999999999");
		        //Relative xpath for full name field
		        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sadhvi Singh");
		        Thread.sleep(7000);
		        driver.close();
		      
	}
}