package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		System.out.println("=============================");
				
		//Get Current URL
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : " +url);
		
		System.out.println("=============================");
		
		//Get the website Title
		String title = driver.getTitle();
		System.out.println("Website Title is : " +title);
		
		System.out.println("=============================");
		
		//retrieve the page source which is currently loaded 
		String resource = driver.getPageSource();
		System.out.println("Page resource is : "+ "\n" +resource);
		
		System.out.println("=============================");
		
		//Navigate to another website
		driver.navigate().to("https://meta.wikimedia.org/wiki/Main_Page");
		driver.close();

		

	}
}
