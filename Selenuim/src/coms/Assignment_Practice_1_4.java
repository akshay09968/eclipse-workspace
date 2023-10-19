package coms;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Practice_1_4 {

	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://cosmocode.io/automation-practice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Akshay");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[2]")).sendKeys("Deshpande");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/input[6]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/select/option[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/select/option[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"submit_htmlform\"]")).click();
		//*[@id="submit_htmlform"]
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='inside-navigation'] li[id='mega-menu-item-5318'] span[class='mega-indicator']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='inside-navigation'] li[id='mega-menu-item-5322'] a[class='mega-menu-link']")).click();
		Thread.sleep(2000);
		
		//no. of columns
		 @SuppressWarnings("rawtypes")
		List col = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
	    System.out.println("No of cols are : " + col.size()); 
	    Thread.sleep(5000);
		    
	    //No.of rows 
	    @SuppressWarnings("rawtypes")
		List  rows = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr")); 
	    System.out.println("No of rows are : " + rows.size());
	    
	    driver.findElement(By.cssSelector("div[class='inside-navigation'] li[id='mega-menu-item-5318'] span[class='mega-indicator']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='inside-navigation']//a[@class='mega-menu-link'][normalize-space()='Automation Practice | Beginner']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-433\"]/div/div/a[2]")).click();
		
		Alert act=driver.switchTo().alert();
		
		//print the alert message
		System.out.println(act.getText());
		//validating the alert message
//		String msg=act.getText(); 
		Thread.sleep(2000);
		act.accept();
		// Click on the link to trigger the alert
//        driver.findElement(By.linkText("")).click();
		driver.close();
        
	}
}
