package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Assignment {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		
	
		for(int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if ( cols.size() > (0))
			{
				String text = cols.get(0).getText();
				System.out.print(" "+ text);
				}
				System.out.println();
			}
		
			driver.quit();


	}

}
