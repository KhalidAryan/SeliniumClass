package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathPractice {

	

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://tekschool.us/");
		 //driver.findElement(By name); 
		 String CurrentURL= driver.getCurrentUrl();
// this is practice for git pull
	}

}
