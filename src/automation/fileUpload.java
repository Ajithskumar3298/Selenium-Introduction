package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		
		driver.findElement(By.cssSelector("div[id='uploader'] span")).click();
		Thread.sleep(3000);
		
		//Auto it Script executing with runtime class
		Runtime.getRuntime().exec("C:\\Users\\AJITH\\Selenium\\Document\\AutoIT\\fileupload.exe");
		
	    Thread.sleep(3000);
		
		String Filetext = driver.findElement(By.cssSelector("div[class='file__info'] span")).getText();
		System.out.println(Filetext);
	}

}
