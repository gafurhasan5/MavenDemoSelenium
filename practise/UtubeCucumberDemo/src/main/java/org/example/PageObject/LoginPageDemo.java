package org.example.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDemo {
       WebDriver driver;
   public LoginPageDemo(WebDriver driver)
    {
        this.driver=driver;
    }
    By user_name=By.id("user-name");
    By pass_word=By.id("password");
    By login_btn=By.id("login-button");
   // By ListProduct=By.xpath("//span[contains(text(),'Products')]");
    By ListProduct=By.xpath("//div[@class='app_logo']");
   public void enterUsername(String username)
    {
        driver.findElement(user_name).sendKeys(username);
    }
    public  void enterPassword(String password)
    {
        driver.findElement(pass_word).sendKeys(password);
    }
    public void clickLoginButton()
    {
        driver.findElement(login_btn).click();
    }
   public void ProductDisplay()
    {
        driver.findElement(ListProduct).isDisplayed();
    }
}
