package test.pageobject.lesson22;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
  public static LoginPage loginPage;
  public static ProfilePage profilePage;
  public static WebDriver webDriver;

  @BeforeClass
  public void baseTest(){
    System.setProperty("webdriver.chrome.driver" , "chromedriver.exe" );
    webDriver = new ChromeDriver();
    loginPage = new LoginPage(webDriver);
    profilePage = new ProfilePage(webDriver);
    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //получение ссылки на страницу входа из файла настроек
    webDriver.get("https://rozetka.com.ua/");
    WebElement exit = webDriver.findElement(By.xpath("//li[3]/rz-user/button"));

  }

  @Test
  public void loginTest(){
    //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
    //значение email/password берутся из файла настроек по аналогии с chromedriver
    //и loginpage
    //вводим email
    loginPage.clickLoginBtn();
    loginPage.inputEmail(ConfProperties.getProperty("email"));
    loginPage.inputPassword(ConfProperties.getProperty("password"));
    loginPage.clickExitBtn();
    //получаем отображаемый логин
    String user = profilePage.getUserName();
    //и сравниваем его с логином из файла настроек
    Assert.assertEquals(ConfProperties.getProperty("email"), user);
  }

  @AfterClass
  public static void tearDown() {
    profilePage.entryMenu();
    profilePage.clickUserName();
    profilePage.userLogout();
    webDriver.quit();
  }


}



