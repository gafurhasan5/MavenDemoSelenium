package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
    WebDriver driver;
    public LoginPageWithPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //identify WebElement
    //identify username
   @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement loginbtn;
    public void setUsername(String unmae) {
        username.sendKeys(unmae);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void setLogin() {
        loginbtn.click();
    }
}
