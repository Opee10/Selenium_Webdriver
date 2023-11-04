package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonandCheckBox {
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
		driver.get("https://theautomationzone.blogspot.com/search/label/webelements");
		driver.manage().window().maximize();
		
		//CheckBoxs
		System.out.println("Checkbox Before automation : "+driver.findElement(By.id("myCheck")).isSelected());
		driver.findElement(By.id("myCheck")).click(); //automated
		System.out.println("Checkbox after automation : "+driver.findElement(By.id("myCheck")).isSelected());
	
		System.out.println("....");
		
		//Radio Buttons
		System.out.println("Radio Button Before automation : "+driver.findElement(By.id("ff")).isSelected());
		driver.findElement(By.id("ff")).click(); //automated
		System.out.println("Radio Button after automation : "+driver.findElement(By.id("myCheck")).isSelected());
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}