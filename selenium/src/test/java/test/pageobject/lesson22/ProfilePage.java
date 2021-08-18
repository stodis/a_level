package test.pageobject.lesson22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    public WebDriver webDriver;
    public ProfilePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy (xpath = "//ul/li[3]/rz-user/a")
    // определение локатора меню пользователя
    private WebElement userMenu;
    @FindBy (xpath = "//div/rz-app-cabinet/div/aside/nav/div/a")
    // определение локатора имени пользователя
    private WebElement userName;

    // определение локатора кнопки выхода из аккаунта
    @FindBy(xpath = "//button[contains(text(),'Выход')]")
    private WebElement logoutBtn;


    public void  entryMenu() {
        userMenu.click();
    }

    public void clickUserName(){
        userName.click();
    }


    public String getUserName(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li[3]/rz-user/a")));
        String userName = userMenu.getText();
        return userName;
    }


    public void userLogout(){
        logoutBtn.click();
    }

}