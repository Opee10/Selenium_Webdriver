package Demo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreMethods {
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
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");        
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//let's find out how many item in a selected page
		List<WebElement> Welements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(Welements); //6 xpath supposed to shown in output as there is 6 item available in current page of this URL
		
		//Navigate the window and Get the window handle.
		driver.navigate().to("https://www.w3schools.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle); 
		
		driver.findElement(By.xpath("//*[@id=\"navbtn_certified\"]")).click();
		Set<String> windowhandle1 =driver.getWindowHandles(); // Cuz getWindowHandle(s) RETURN A OF STRING
		System.out.println(windowhandle1); 
		
		driver.quit();
	}
}