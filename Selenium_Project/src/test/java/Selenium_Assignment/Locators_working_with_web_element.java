package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_working_with_web_element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();             
		driver.get("https://demo.guru99.com/test/radio.html"); 
		String Act_title = driver.getTitle();	
		String expt_title = "Radio Button & Check Box Demo";
		
		if(Act_title.equals(expt_title))
		{
			System.out.println("Page title is verified");
		}
		else
		{
			System.out.println("Page title is not verified");
		}
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php"); // Second browser
		WebElement dropcountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select drop = new Select(dropcountry);
		drop.selectByValue("KUWAIT");
		Thread.sleep(5000);
        driver.quit();
				
	


	}

}
