package automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileDownload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String downlaodfilepath = System.getProperty("user.dir");
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", downlaodfilepath);
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://convertio.co/convert-pdf-to-jpg/");

		driver.findElement(By.cssSelector("label[class='action-label'] span")).click();
		Thread.sleep(3000);

		// Auto it Script executing with runtime class
		Runtime.getRuntime().exec("C:\\Users\\AJITH\\Selenium\\Document\\AutoIT\\fileupload.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='btn-primary']")));
		driver.findElement(By.cssSelector("button[class*='btn-primary']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		
		Thread.sleep(10000);

		File file = new File(downlaodfilepath+"/Amlreport.jpg");
		if (file.exists()) {

			Assert.assertTrue(file.exists());
		} else {

			System.out.println("File Not Found");
		}
		if (file.delete()) {
			
			System.out.println("File Deleted");
		}

	}

}
