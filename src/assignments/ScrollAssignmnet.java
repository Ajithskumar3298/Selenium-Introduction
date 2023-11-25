package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAssignmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		List<WebElement> price = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		
		int sum = 0;
		for(int i=0;i<price.size();i++) {
			
			int value =  Integer.parseInt(price.get(i).getText());
			
			sum = sum + value;
		}
		
		System.out.println(sum);
			
		}

	}


