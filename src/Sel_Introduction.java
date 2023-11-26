import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Sel_Introduction {

	@Test
	public void browserdetails() throws InterruptedException {

//		Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AJITH\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		FireFox Browser
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AJITH\\Selenium\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/

//		Edge browser
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AJITH\\Selenium\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();*/

		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("my office in trivandrum");
		System.out.println("iam working as qa");

		Thread.sleep(5000);
		driver.close();

	}
	@Test
	public void deletebrowser() {
		
		System.out.println("delete browser");
	}
	@Test
	public void changebrowser() {
		
		System.out.println("delete browser");
	}

}
