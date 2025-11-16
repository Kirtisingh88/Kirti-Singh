package Selenium_Assignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag_ByActions_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();                       
		driver.manage().window().maximize(); 
		driver.get("https://jqueryui.com/draggable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));	
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(drag)
		.moveByOffset(100,100)
		.release()
		.perform();
		TakesScreenshot ass = (TakesScreenshot)driver;
		File sourcefile = ass.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("/Users/ravisikariwal/git/repository/Selenium_Project/screenshot/asshot.jpeg");
		sourcefile.renameTo(targetfile);
		Thread.sleep(5000);
		driver.quit();

	}

}
