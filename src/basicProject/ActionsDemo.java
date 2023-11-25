package basicProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));

		Actions action = new Actions(driver);

		action.moveToElement(move).build().perform();
		action.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		action.moveToElement(move).contextClick().build().perform();

	}

}
