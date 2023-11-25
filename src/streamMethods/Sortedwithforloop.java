package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sortedwithforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		click on sort
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
//		capture all webelement into list
		List<WebElement> itemlist = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		for(int i=0;i<itemlist.size();i++) {
			
			String items = itemlist.get(i).getText();
			List<String> originallist = Arrays.asList(items);
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}
