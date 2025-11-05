package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginPage(WebDriver d)
   {
      driver=d;
    }
    By username=By.id("user-name");
    By password=By.id("password");
    By loginbtn=By.id("login-button");

    public void setUsername(String unmae) {
       driver.findElement(username).sendKeys(unmae);
    }

    public void setPassword(String pwd) {
       driver.findElement(password).sendKeys(pwd);
    }
    public void setLogin() {
        driver.findElement(loginbtn).click();
    }
}
