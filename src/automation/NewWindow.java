package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

//		Switching Tab
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> windows = windowhandle.iterator();
		String parentwindow = windows.next();
		String childwindow = windows.next();

		driver.switchTo().window(childwindow);

		driver.get("https://rahulshettyacademy.com/");

		String coursename = driver.findElements(By.xpath("//div/h2/a"))
				.get(1).getText();
		
		System.out.println(coursename);
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys(coursename);

	}

}
