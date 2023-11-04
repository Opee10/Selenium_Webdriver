package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("fname")).sendKeys("standard_user");
		driver.findElement(By.name("fname")).clear();
		
		//Input(HTML tag), type=value, output = text is Attribute; 
		System.out.println("Attribute :" +driver.findElement(By.name("fname")).getAttribute("type"));
		System.out.println("Size :" +driver.findElement(By.name("fname")).getSize());
		System.out.println("Location :" +driver.findElement(By.name("fname")).getLocation());
		System.out.println("Text :" +driver.findElement(By.xpath("/html/body/div[3]/div[1]/h2")).getText());
		System.out.println("TagName :" +driver.findElement(By.name("fname")).getTagName());
		System.out.println("Displayed :" +driver.findElement(By.name("fname")).isDisplayed());
		System.out.println("isEnabled :" +driver.findElement(By.name("fname")).isEnabled());
				
		Thread.sleep(4000);
		
	    driver.quit();
	}
}
