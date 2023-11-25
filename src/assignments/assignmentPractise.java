package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignmentPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

		String checkboxvalue = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"))
				.getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

		Select drop = new Select(dropdown);
		drop.selectByVisibleText(checkboxvalue);

		driver.findElement(By.id("name")).sendKeys(checkboxvalue);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(checkboxvalue)) {
			Assert.assertTrue(true);
			System.out.println("Value present");

		} else {

			Assert.assertTrue(false);
			System.out.println("value not present");
			
			

		}

	}

}
