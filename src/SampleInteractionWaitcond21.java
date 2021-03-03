import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleInteractionWaitcond21 {
	
	public static void main(String[] args) throws InterruptedException {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
		WebElement textWebdriver = driver.findElement(By.xpath("//p[@id='demo']"));
				
		if(textWebdriver.isDisplayed())
		{
			System.out.println("Web Driver Element is displayed");
		}
		else
		{
			System.out.println("Web Driver Element is not displayed");
			
		}
		
		//
	/*	driver.findElement(By.xpath("//a[contains(text(),'Selenium online training')]")).click();
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);*/
		
		//WebElement closeIconelement = driver.findElement(By.xpath("//span[@class ='close-sidebar']"));
	}

}
