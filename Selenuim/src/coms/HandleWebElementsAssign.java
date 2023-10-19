package coms;

import org.openqa.selenium.chrome.ChromeDriver;	
	
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class HandleWebElementsAssign {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"p_89/Samsung\"]/span/a/div/label/i"));
		check1.click();
		Thread.sleep(2000);
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"p_89/LG\"]/span/a/span"));
		check2.click();
		Thread.sleep(2000);
		
		WebElement check3 = driver.findElement(By.xpath("//*[@id=\"p_n_feature_fifteen_browse-bin/28239872031\"]/span/a/div/label/i"));
		check3.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(2000);
		
		WebElement radio1 = driver.findElement(By.className("#buyBackAccordionRow > div > div.a-accordion-row-a11y.a-accordion-row.a-declarative.accordion-header.mobb-header-css > i"));
		radio1.click();
		Thread.sleep(2000);
		
		driver.close();
	}

}

//WebElement check1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[6]/ul/span[1]/li/span/a/div/label/i"));
//Thread.sleep(2000);
//check1.click();
//WebElement check2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[6]/ul/span[2]/li/span/a/div/label/i"));
//check2.click();
//Thread.sleep(2000);
//WebElement check3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[8]/ul[15]/span[1]/li/span/a/div/label/i"));
//Thread.sleep(2000);
//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//Thread.sleep(2000);
//WebElement radio1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[1]/div/div[1]/i"));
//radio1.click();