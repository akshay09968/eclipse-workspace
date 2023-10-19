package coms;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	

public class BrowserChildAssign {
	
	public static void main(String[] args) throws InterruptedException {
		
		//setting the driver executable
    	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
        //Launching the site.				
        driver.get("https://www.amazon.in/");			
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href, 'amazon.in')]")).click();

	
        Thread.sleep(3000);
        
        String MainWindow=driver.getWindowHandle();		
        System.out.println("current window handler:  "+ MainWindow);
        
        Thread.sleep(3000);
        //To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();  //---> it stores all the child windows opened
        Iterator<String> i1=s1.iterator();
        
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();	
            System.out.println("current child window handler:  "+ ChildWindow);
            Thread.sleep(2000); 
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		           
            	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
            	Thread.sleep(2000);
            	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
            	Thread.sleep(2000);
            	
            	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
            	Thread.sleep(2000);
			// Closing the Child Window.
            driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            Thread.sleep(4000);            
            driver.switchTo().window(MainWindow);	
            driver.close();	
	}
}

//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//Thread.sleep(2000);
//
//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//Thread.sleep(2000);
//driver.close();