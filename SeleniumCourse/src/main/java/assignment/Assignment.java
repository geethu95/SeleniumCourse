package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public WebDriver driver;      
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geeth\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resourses\\chromedriver.exe");
		driver=new ChromeDriver();           
		driver.get("https://www.opesmount.in/grocerystore1/");
		return driver;	
	}
	public static void main(String[] args) {
		Assignment obj=new Assignment();
		obj.initializeBrowser();

	}

}
