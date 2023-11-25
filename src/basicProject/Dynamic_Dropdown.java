package basicProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

//		Handle dynamic dropdown using index
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("(//a[@value='TRV'])[2]")).click();
		 */

//		Handle dynamic dropdown using parent to child
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"
		 * )).click(); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TRV']"
		 * )).click();
		 */
//		handling radio Button

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("IS ENABLED");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
	}

}
