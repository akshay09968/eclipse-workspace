package coms;

import org.openqa.selenium.chrome.ChromeDriver;	
	
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Assignment_Practice_1_2 {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			
//		driver.findElement(By.id("twotabsearchtextbox"));
//		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive 16 gb");
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"p_89/SanDisk\"]/span/a/div/label/i"));
		check2.click();
		Thread.sleep(2000);
		
		WebElement drop =  driver.findElement(By.className("a-dropdown-label"));
		drop.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]"));
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"p_89/HP\"]/span/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Audio")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
