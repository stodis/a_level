import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg {

    @Test
    public void baseTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        var searchString = webDriver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));

        searchString.sendKeys("dou", Keys.ENTER);
       WebElement webElement = webDriver.findElement(By.xpath("//cite[@class= 'iUh30 Zu0yb tjvcx']"));
       webElement.click();
    }
}
