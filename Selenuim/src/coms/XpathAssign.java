package coms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssign{
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@title='APPLE']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[@data-id='MOBFWQ6BVWVEH3XE']")).click();
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		driver.quit();
		}
}
