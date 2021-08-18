package test.pageobject.lesson22;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public WebDriver webDriver;
 public LoginPage(WebDriver webDriver){
  PageFactory.initElements(webDriver, this);
  this.webDriver = webDriver;
 }
 // определение локатора кнопки Вход
 @FindBy(xpath = "//li[3]/rz-user/button")
 private  WebElement loginBtn;
 // определение локатора поля Эмейл
 @FindBy(xpath = "//input[@id = 'auth_email']")
 private WebElement emailField;
 // определение локатора поля пароль
 @FindBy(xpath = "//input[@id = 'auth_pass']")
 private WebElement passwdField;
 // определение локатора кнопки вход
 @FindBy(xpath = "//button[contains(text(),'Войти')]")
 private WebElement ExitBtn;

 public void clickLoginBtn(){
  loginBtn.click();

 }

 public void inputEmail(String email) {
  emailField.sendKeys("stodisru@gmail.com");
 }

 public void inputPassword(String password){
  passwdField.sendKeys("Tverdunmi1986");
 }

 public void clickExitBtn(){
  ExitBtn.click();
 }

}


