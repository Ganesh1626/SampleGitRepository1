import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatebytagname4 {
	
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com/");
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		//Thread.sleep(3000);
		
		driver.manage().window().maximize();
		//driver.findElement(By.tagName("input")).sendKeys("Ganesh");
		WebElement Elmtagname =  driver.findElement(By.tagName("input"));
		System.out.println(Elmtagname);
		//driver.close();
		
	}

}
