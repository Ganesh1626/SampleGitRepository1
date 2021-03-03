import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleInteractionUploadfile19 {
	
	public static void main(String[] args) throws InterruptedException {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement chooseFile = driver.findElement(By.className("browse-text"));
		actions.moveToElement(chooseFile).perform();
		Thread.sleep(5000);
		//chooseFile.click();
		//Thread.sleep(5000);
		chooseFile.sendKeys("C:\\Users\\Ganesh\\Documents\\New Microsoft Office Word Document.doc");
		
	}

}
