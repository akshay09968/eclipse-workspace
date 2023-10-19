package coms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
	                 
        //Navigate to the demo site
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
		
        
        driver.findElement(By.linkText("Iframe with in an If")).click();
        WebElement frame1 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
        driver.switchTo().frame("frame1");
        
        driver.findElement(By.linkText("Iframe with in an Iframe")).click();
        WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
        driver.switchTo().frame("frame2");
        
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
        Thread.sleep(2000);
        
        driver.close();
	}
}

//driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
//Thread.sleep(2000);
//
//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
//Thread.sleep(2000);
//
//driver.close();