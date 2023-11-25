package basicProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.click();
		List<WebElement> From = driver.findElements(By.cssSelector("div[class='css-1dbjc4n r-18u37iz']"));

		for (WebElement value : From) {
			if (value.getText().equalsIgnoreCase("Bengaluru")) {
				value.click();
				break;
			}
		}

		List<WebElement> To = driver
				.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		for (WebElement destination : To) {
			if (destination.getText().equalsIgnoreCase("Coimbatore")) {
				destination.click();
				break;
			}
		}
//		Date Picker
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();

	}

}
