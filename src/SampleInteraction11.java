import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleInteraction11 {
	
	public static void main(String[] args) throws Exception {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("http://a.testaddressbook.com/sign_in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Using ID Entering the data
		//Actions actions = new Actions(driver);
		//WebElement txtUsername =  driver.findElement(By.id("divUsername"));
		//actions.moveToElement(txtUsername).perform();
		//txtUsername.sendKeys("Admin");
		driver.findElement(By.name("session[email]")).sendKeys("tganesh666@gmail.com");
		driver.findElement(By.name("session[password]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		WebElement navbarIcon = driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		
		if(navbarIcon.isDisplayed())
			{
		System.out.println("Icon Displayed");
		//}
		
		//driver.close();
	}
}
}
