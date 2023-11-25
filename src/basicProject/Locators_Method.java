package basicProject;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Locators_Method pass = new Locators_Method();
		String name = "Ajith";
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = pass.getpassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();

	}

	public String getpassword(WebDriver driver) throws InterruptedException

	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(1000);
		String passwordtext = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] passwordsplit = passwordtext.split("'");
		String[] passwordarray = passwordsplit[1].split("'");
		String password = passwordarray[0];
		return password;

//		Please use temporary password 'rahulshettyacademy' to Login.
//		0 index- Please use temporary password 
//		1 index- rahulshettyacademy' to Login.

//	    0 index- rahulshettyacademy
//	    1 index-  to Login

	}

}
