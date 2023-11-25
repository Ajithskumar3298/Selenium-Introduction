package basicProject;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		1.getting links are available in the window
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		storing foot driver elements
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
//		2.getting foot driver link counts
		int footlinks = footerdriver.findElements(By.tagName("a")).size();
		System.out.println(footlinks);
		
//		storing column driver elements
		WebElement columndriver =footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
//	    4.getting the column driver link count
		int count = columndriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
//		iterating and clicking all the links
		for(int i=1; i<count;i++)
		{
			
			String linkclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
		    
		}
		
//		Fetching the title of the opened windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	
	}

}
