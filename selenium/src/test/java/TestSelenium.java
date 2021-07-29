import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium {
    @Test
    public void baseTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rozetka.com.ua");
        var element = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/a/picture/img"));
        element.click();
        //webDriver.quit();



    }

}
