package basicProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_to_Siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Traverse from Parent- child to sibling
//		String login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
//		System.out.println(login);

//		Traverse from child- parent to sibling
		String login1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(login1);
		;
	}

}
