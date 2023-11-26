import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics {

	@Test
	public void javabasic() {
	
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle());
			System.out.println("Hello");
			System.out.println("My name is Ajith");
			
			System.out.println("My name is amal");
			System.out.println("My name is rahul");
			System.out.println("My name is sandeep");
			System.out.println("My name is hari");
	}
	
	@Test
	public void application() {
		
		System.out.println("amazon.in");
			
	}
	@Test
	public void deleteapplication() {
		
		System.out.println("apple.in");
	}
			
	
		
		
		

	}


