package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class assign1 {

		public static void main(String[] args) throws InterruptedException {
			

			System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pen drives");
			Thread.sleep(4000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(6000);
			driver.findElement(By.linkText("16 GB")).click();
			Thread.sleep(6000);
			
			driver.findElement(By.partialLinkText("Strontium USB 16 GB USB Pollex Flash Drive - Pack of 3")).click();
			Thread.sleep(6000);
			driver.navigate().back();  // it will move back to the immediate parent window
			
			Thread.sleep(6000);
			driver.navigate().to("https://www.gmail.com/");
			Thread.sleep(5000);
			driver.findElement(By.id("identifierId")).sendKeys("akshaydesh360@gmail.com"); 	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
			
			Thread.sleep(2000);
			driver.quit();
			}
	}

