package SeleniumCourse.SeleniumCourse;

public class BrowserCommands extends Base {
	String actualTitle,actualURL,pagesource;
	public void basicCommands() {
		actualTitle=driver.getTitle();		//to get the page title
		System.out.println(actualTitle);
		actualURL=driver.getCurrentUrl();  // to get current page url
		System.out.println(actualURL);
		pagesource=driver.getPageSource();   //to gett page source
		System.out.println(pagesource);
	}
	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.initializeBrowser();
		obj.basicCommands();
		obj.browserClose();
	}
}
