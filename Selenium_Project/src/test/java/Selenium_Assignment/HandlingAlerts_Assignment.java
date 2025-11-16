package Selenium_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();                       
		driver.manage().window().maximize(); 
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("Kirti123");
		driver.findElement(By.name("submit")).click();
		Alert myalert1 = driver.switchTo().alert();
		Thread.sleep(5000);
		myalert1.accept();
		Alert myalert2 = driver.switchTo().alert();
		Thread.sleep(5000);
		myalert2.accept();
		driver.quit();

	}

}
