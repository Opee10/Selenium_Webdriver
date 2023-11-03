package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
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
		
		
		
	/*	USING ALL BASIC LOCATORS
		driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//id locator
		driver.findElement(By.className("from_input")).sendKeys("standard_user");//className Locator
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");//CSS_Selector Locator
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");//Xpath Locator
		driver.findElement(By.tagName("input")).sendKeys("standard_user");//TagName Loocator 
		 driver.get("https://www.google.com");
		 driver.findElement(By.linkText("Images")).click(); */
		
		driver.get("https://www.wikipedia.org");
        driver.findElement(By.partialLinkText("Commun")).click();
		
	
	}
}
