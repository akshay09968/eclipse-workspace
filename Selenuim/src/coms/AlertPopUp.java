package coms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		// System Property for gecko Driver   
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		//maximize the browser 
		driver.manage().window().maximize(); 
		
		//navigate to the url
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//handling alert with OK and CANCEL button
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.id("CancelTab")).click(); 
		Thread.sleep(5000);
		
		//creating the alert object
		Alert act=driver.switchTo().alert();
		
		//print the alert message
		System.out.println(act.getText());
		//validating the alert message
		String msg=act.getText(); 
			if(msg.equals("Press a Button !"))
			{
				System.out.println("actual alert message");
			}
			else{
				System.out.println("in-correct alert message");
			}
		act= driver.switchTo().alert(); 
		
		//click on OK button
		act.accept(); 
		msg=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("click on the OK button:" + msg);
		Thread.sleep(5000); 
		
		//again move to main button to press cancel button
		driver.findElement(By.cssSelector("#CancelTab")).click();
		act= driver.switchTo().alert();
		Thread.sleep(5000);  
		
		//click on CANCEL Button
		act.dismiss(); 
		msg=driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println("click on the CANCEL button:" + msg);
		Thread.sleep(3000);
		
		
		//-------------Handling the Prompt box-------------//
		//handling alert with OK and CANCEL button
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.id("Textbox")).click(); 
		Thread.sleep(2000);  
		
		WebDriverWait wait = new WebDriverWait(driver, 10);  // creating a wait buffer for 10secs
		Alert t =  wait.until(ExpectedConditions.alertIsPresent());  // or driver.switchTo().alert();
		Thread.sleep(2000);  
		t.sendKeys("Hello This side Viren");
		Thread.sleep(5000); 
		String msg1=t.getText(); 
		Thread.sleep(3000);  
		if(msg1.equals(" hgf This side Viren"))
		{
			System.out.println("true messsage");
		}
		else{
			System.out.println("in-correct alert message");
		}
		t.accept();
		//closing the browser window                     
		driver.close();
	}
}
