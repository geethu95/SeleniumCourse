package SeleniumCourse.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;      //declared globally as driver is used globally
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver=new ChromeDriver();           
		driver.get("https://www.amazon.in/");
		return driver;	
	}

public static void main(String[] args) {
		Base obj=new Base();
		obj.initializeBrowser();
			
	}
}
