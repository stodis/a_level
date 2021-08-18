import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class TestSelenium_18_21 {
    @Test

 public void searchNotebook(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        webDriver.get("https://www.rozetka.com.ua");

        //var searchString = webDriver.findElement(By.xpath("//input[contains(@class, 'search')]"));
      WebElement searchString = webDriver.findElement(By.cssSelector("input[name=search]"));
        searchString.sendKeys("Пропись в клетку. Печатные цифры.", Keys.ENTER);
        webDriver.quit();
    }


   public void navigateTolaptops(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.rozetka.com.ua");

        WebElement catalog = webDriver.findElement(By.xpath("//button[contains(text(),'Каталог')]"));

        catalog.click();
        WebElement subMenu = webDriver.findElement(By.xpath("//a[contains(@class, 'menu-categories__link js-menu-categories__link menu-categories__link_state_hovered')]"));
        subMenu.click();
        WebElement laptops = webDriver.findElement(By.xpath("//a[@title='Ноутбуки'][2]"));
        laptops.click();
        webDriver.quit();
    }


    public void selectAserlaptop() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.rozetka.com.ua");

        WebElement catalog = webDriver.findElement(By.xpath("//button[contains(text(),'Каталог')]"));
        catalog.click();

        //WebElement subMenu = webDriver.findElement(By.xpath("//a[contains(@class, 'menu-categories__link js-menu-categories__link menu-categories__link_state_hovered')]"));
        WebElement subMenu = webDriver.findElement(By.linkText("Ноутбуки и компьютеры"));
        subMenu.click();
        WebElement laptops = webDriver.findElement(By.xpath("//a[@title='Ноутбуки'][2]"));
        laptops.click();

       WebElement acer = webDriver.findElement(By.xpath("//a//label[contains(text(), 'Acer')]"));
        WebElement wait = (new WebDriverWait(webDriver, 10))
               .until(ExpectedConditions.elementToBeClickable(By.id("Acer")));
        acer.click();
       webDriver.quit();

    }



    public void selectProductMainPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rozetka.com.ua");
        // webDriver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.MILLISECONDS);
        WebElement saleFrog = webDriver.findElement(By.xpath("//a[contains(text(), 'мытья')]"));
        saleFrog.click();
        webDriver.quit();
    }


    public void navigateToCart() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rozetka.com.ua");
        //WebElement verifyCart = webDriver.findElement(By.xpath("//div/ul/li[7]/rz-cart/button"));
        WebElement verifyCart = webDriver.findElement(By.tagName("rz-cart"));
        verifyCart.click();
        webDriver.quit();
    }




}



