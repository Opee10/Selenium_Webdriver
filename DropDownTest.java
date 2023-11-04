package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
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
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.manage().window().maximize();
		
		//Drop Down Automation 
		WebElement dropdown = driver.findElement(By.name("cars"));
		//BY XPATH - > WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"cars\"]"));
		Select var = new Select(dropdown);
		
		var.selectByValue("audi");
		var.selectByIndex(2);
		var.selectByVisibleText("Opel");
		
		Thread.sleep(4000);	
	    driver.quit();
	}
}
