import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleInteractionDrpdwn14 {
	
	public static void main(String[] args) {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		Select drpTesting = new Select(driver.findElement(By.id("testingDropdown")));
		//drpTesting.selectByVisibleText("database");
		drpTesting.selectByIndex(1);
				
		//driver.close();
		
	}

}
