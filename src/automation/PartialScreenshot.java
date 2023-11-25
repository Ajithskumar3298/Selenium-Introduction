package automation;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

//		Switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
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
		
		WebElement name = driver.findElement(By.xpath("//div/input[@name='name']"));
		name.sendKeys(coursename);
		
//		Taking screenshot for specific module
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("namebox.png"));
		
//		get height of the element
		int height = name.getRect().getDimension().getHeight();
		System.out.println(height);
		
//		get width of the element
		int width = name.getRect().getDimension().getWidth();
		System.out.println(width);


	}

}
