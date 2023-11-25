package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		String parent = iter.next();
		String child = iter.next();
		
		driver.switchTo().window(child);
		String childvalue = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(childvalue);
		
		driver.switchTo().window(parent);
		String parentvalue = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(parentvalue);

	}

}
