import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SampleInteractionMultiselect15 {
	
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
        Thread.sleep(1000);
        
        driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_B-1Img")).click();
          driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_I")).click();
          Thread.sleep(5000);
          
          // Perform Multiple Select
          Actions builder = new Actions(driver);
          WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
          List<WebElement> options = select.findElements(By.tagName("td"));
          
          System.out.println(options.size());
          Action multipleSelect = 
             builder.keyDown(Keys.CONTROL).click(options.get(1)).click(options.get(3)).click(options.get(5)).build();
          Thread.sleep(3000);
          multipleSelect.perform();
        //  driver.close();
    }

}
