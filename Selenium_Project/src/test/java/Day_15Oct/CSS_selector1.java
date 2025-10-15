package Day_15Oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSS_selector1 {

	public static void main(String[] args) {
		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement elmt = driver.findElement(By.cssSelector("input[value='Log in']"));
		Actions act = new Actions(driver);
		act.moveToElement(elmt).perform();

	}

}
