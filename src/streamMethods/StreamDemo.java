package streamMethods;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//		click on sort
		driver.findElement(By.xpath("//tr/th[1]")).click();

//		capture all webelement into list
		List<WebElement> itemlist = driver.findElements(By.xpath("//tr/td[1]"));

//		capture all webelement into original list
		List<String> orginallist = itemlist.stream().map(s -> s.getText()).collect(Collectors.toList());

//		sort on the original list with step 3
		List<String> sortedlist = orginallist.stream().sorted().collect(Collectors.toList());

//		compare original list with sorted list
		Assert.assertTrue(orginallist.equals(sortedlist));
		
		List<String> price;
		
		do {
        
		List<WebElement> Rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = Rows.stream().filter(s -> s.getText().contains("Rice")).map(s->getpriceveggie(s))
				.collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(price.size()<1);
			

}

	private static String getpriceveggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
