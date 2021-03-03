import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleInteractionMsehvrkeybrd17 {
	
	public static void main(String[] args) {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement lnkImages = driver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi&ogbl']"));
		actions.moveToElement(lnkImages).perform();
		System.out.println("Done Mouse Hover on Images link");
		lnkImages.click();
		WebElement srhGoogle = driver.findElement(By.xpath("//input[@type='text']"));
		srhGoogle.sendKeys("selenium");
		System.out.println("Done Keayboard action on Search box");
						
		//driver.close();
		
	}

}
