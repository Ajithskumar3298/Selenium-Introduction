package basicProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

		Thread.sleep(5000);
		driver.close();

	}

}
