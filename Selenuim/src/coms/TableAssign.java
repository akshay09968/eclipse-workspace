package coms;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class TableAssign {

	public static void main(String[] args) throws ParseException, InterruptedException  {
		
		// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
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
		
	   // WebDriver driver = new ChromeDriver(); // Assuming you are using ChromeDriver

	 // Navigate to the webpage containing the table
	 driver.get("https://www.example.com");

	 // Find the table element
	 WebElement table = driver.findElement(By.xpath("//table[@id='//*[@id=\\\"countries\\\"]/tbody/tr[1]/td']"));

	 // Find all rows within the table
	 List<WebElement> rowss = table.findElements(By.xpath(".//tr"));

	 // Iterate through the rows and print rows 5 to 8
	 for (int i = 4; i <= 7; i++) { // Rows are zero-based, so row 5 is at index 4, row 8 at index 7
	     WebElement row = rowss.get(i);
	     System.out.println(row.getText());
	 }

	 // Close the driver
	 driver.quit();

        
        driver.close();
	}
}

////----------------------------Dynamic Table-------------------------------//
////----------Fetch cell value of a particular row and column--------------//
//
// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// WebElement baseTable = driver.findElement(By.tagName("table"));
//  
// //To find third row of table
// WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[5]/tr[8]"));
// String rowtext = tableRow.getText();
// System.out.println("Third row of table : "+rowtext);
// Thread.sleep(5000);
// 
// //to get 3rd row's 2nd column data
// WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
// String valueIneed = cellIneed.getText();
// System.out.println("Cell value is : " + valueIneed);
 
 
 