package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#visitUsTwo")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parentid = iterator.next();
		String childid = iterator.next();
		driver.switchTo().window(childid);
		System.out.println(
				driver.findElement(By.cssSelector("div[class='container-fluid'] h2 span:nth-child(1)")).getText());
		String value = driver.findElement(By.cssSelector("div[class='container-fluid'] h2 span:nth-child(1)")).getText()
				.split("An")[1].trim().split(" ")[0];

		driver.switchTo().window(parentid);
		driver.findElement(By.id("inputUsername")).sendKeys(value);

	}

}
