package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
       /* Object of login page for without page factory
        LoginPage loginPg=new LoginPage(driver);
            loginPg.setUsername("standard_user");
        loginPg.setPassword("secret_sauce");
        loginPg.setLogin();*/


        //Object of login page for with page factory

        LoginPageWithPageFactory loginPf=new LoginPageWithPageFactory(driver);
        loginPf.setUsername("standard_user");
       // driver.sleep(2000);
        loginPf.setPassword("secret_sauce");
        loginPf.setLogin();
        //driver.quit();
    }
}
