package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectD_Down {
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
		driver.get("https://theautomationzone.blogspot.com/2020/07/");
		driver.manage().window().maximize();
		
		//Drop Down Automation 
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select var = new Select(dropdown);
		
		var.selectByValue("audi");
		var.selectByIndex(0);
		var.selectByVisibleText("Opel");
		
		List<WebElement> listOfOptions = var.getAllSelectedOptions();
		
		for ( WebElement obj : listOfOptions ) {
			System.out.println(obj.getText());
		}	 
		
		Thread.sleep(4000);	
	    driver.quit();
	}
}
