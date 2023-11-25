package basicProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
//		setting the proxy in chrome
//		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
//		Block pop-up windows
//		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
	    Arrays.asList("disable-popup-blocking"));
		
//		Set download directory
//		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
//		Start Chrome maximized
//		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
//		Using a Chrome executable in a non-standard location
//		ChromeOptions options = new ChromeOptions();
		options.setBinary("/path/to/other/chrome/binary");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
