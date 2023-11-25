package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));

		for (int i = 1; i < list.size(); i++) {

			while (!list.get(i).getText().contains("Kingdom")) {

				driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
				break;

			}
		}
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}
