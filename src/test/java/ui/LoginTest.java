package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static String browser = "chrome"; // External configuration - XLS , CSV
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equals("Edge"))
		{
			//System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
			//WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
		}

		else if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		}
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sause");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/form/input[3]")).click();
		driver.close();
	}

}
