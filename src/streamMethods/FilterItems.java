package streamMethods;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");

		List<WebElement> itemlist = driver.findElements(By.xpath("//tr/td[1]"));

		List<WebElement> Actualitem = itemlist.stream().filter(item -> item.getText().contains("Rice"))
				.collect(Collectors.toList());
		
		Assert.assertEquals(itemlist.size(), Actualitem.size());

	}

}
