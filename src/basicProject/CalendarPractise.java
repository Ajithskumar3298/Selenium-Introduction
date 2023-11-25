package basicProject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.path2usa.com/travel-companion/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div input[id='form-field-travel_comp_date']")));

		driver.findElement(By.cssSelector("div input[id='form-field-travel_comp_date']")).click();

		while (!driver.findElement(By.cssSelector("[class='flatpickr-current-month'] [class='cur-month']")).getText()
				.contains("December")) {

			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg")).click();

		}

//		pick the date
		List<WebElement> dates = driver
				.findElements(By.cssSelector("[class='dayContainer'] span[class='flatpickr-day ']"));

		int datecount = dates.size();

		for (int i = 0; i < datecount; i++) {
			String date = dates.get(i).getText();

			if (date.equalsIgnoreCase("25")) {

				dates.get(i).click();
				break;

			}

		}

	}

}
