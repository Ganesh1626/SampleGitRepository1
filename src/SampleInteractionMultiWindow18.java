import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleInteractionMultiWindow18 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String parent = driver.getWindowHandle();
        System.out.println("Parent window Id is"+parent);
        driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total Windows"+count);
        for(String child:allWindows)
        {
        	if(!parent.equalsIgnoreCase(child))
        	{
        		driver.switchTo().window(child);
        		driver.findElement(By.xpath("//input[@Title='Search']")).sendKeys("Selenium");
        		Thread.sleep(5000);
        		driver.close();
        		
        	}
        	
        	
        }
	}

}
