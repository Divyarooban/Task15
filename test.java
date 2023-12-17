import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in/");
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium web browser", Keys.ENTER);Thread.sleep(2000);
        driver.quit();

    }

}
