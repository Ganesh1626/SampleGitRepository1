import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SampleInteractionMousehover16 {
	
	public static void main(String[] args) {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement btnSubmit = driver.findElement(By.id("idOfButton"));
		actions.moveToElement(btnSubmit).perform();
		System.out.println("Done Mouse Hover on Submit button");
		//btnSubmit.click();
		
		//driver.close();
		
	}

}
