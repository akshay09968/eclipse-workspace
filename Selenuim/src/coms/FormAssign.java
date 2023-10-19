package coms;

import org.openqa.selenium.chrome.ChromeDriver;
		
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class FormAssign {

	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
        String baseUrl = "https://demo.automationtesting.in/Register.html";					
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        
        WebElement fname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
        fname.sendKeys("aks");		
        Thread.sleep(2000);
        
        WebElement lname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
        fname.sendKeys("des");		
        Thread.sleep(2000);
        
        WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
        address.sendKeys("asgwcw");		
        Thread.sleep(2000);
        
        fname.clear();
        Thread.sleep(2000);
        
        lname.clear();
        Thread.sleep(2000);
        
        address.clear();
        Thread.sleep(2000);
        
        fname.sendKeys("Akshay");
        Thread.sleep(2000);
        lname.sendKeys("Deshpande");
        Thread.sleep(2000);
        address.sendKeys("Belagavi");
        Thread.sleep(2000);
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
        email.sendKeys("akshaydesh360@gmail.com");		
        Thread.sleep(5000);
        
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
        phone.sendKeys("82932823");		
        Thread.sleep(5000);
       
        
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
        Thread.sleep(2000);
        radio.click();
        
        WebElement check = driver.findElement(By.id("checkbox1"));
        Thread.sleep(2000);
        check.click();
        
        driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='container center']//div[contains(@class,'row')]")).click();
		
		driver.findElement(By.id("Skills")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[@value='C++']")).click();
		
		driver.findElement(By.id("countries")).click();
		driver.findElement(By.xpath("//option[normalize-space()='Select Country']")).click();
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		
		driver.findElement(By.xpath("//li[normalize-space()='India']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("yearbox")).click();
		
		driver.findElement(By.xpath("//option[@value='2001']")).click();
		
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		
		driver.findElement(By.xpath("//option[@value='April']")).click();
		
		driver.findElement(By.id("daybox")).click();
		
		driver.findElement(By.xpath("//option[@value='26']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Akshay123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("secondpassword")).sendKeys("akshayad123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		Thread.sleep(2000);
		
		driver.quit();
        
		//
        
	}

}
