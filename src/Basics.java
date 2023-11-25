import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
