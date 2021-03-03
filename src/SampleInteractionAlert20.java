import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleInteractionAlert20 {
	
	public static void main(String[] args) throws InterruptedException {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();
	}

}
