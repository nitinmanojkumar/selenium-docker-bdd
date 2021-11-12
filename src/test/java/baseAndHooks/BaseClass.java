package baseAndHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class BaseClass {

	public WebDriver driver;
	//private WebDriver driver;
	
	/*public BaseClass createDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		if(this.driver==null)
			this.driver=new ChromeDriver();
        return this;
	}*/

	/*public WebDriver getDriver() {
		return this.driver;
	}*/

	
}
