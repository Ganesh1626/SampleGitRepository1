import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleInteractionRdobtn12 {
	
	public static void main(String[] args) {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		//driver.close();
		
       
    }

}
