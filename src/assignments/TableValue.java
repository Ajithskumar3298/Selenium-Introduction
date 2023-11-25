package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

//		fetching rows
		int rowcount = driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println(rowcount);

//		fetching columns
		int columnsize = driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println(columnsize);

		String rowvalue = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).getText();
		System.out.println(rowvalue);

	}

}
