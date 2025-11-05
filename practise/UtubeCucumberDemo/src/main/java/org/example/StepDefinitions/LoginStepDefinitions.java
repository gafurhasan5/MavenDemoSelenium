package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageObject.LoginPageDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginStepDefinitions {
    static WebDriver driver;
    LoginPageDemo loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");


    }
    //@When("user enter valid username and password")
    //public void user_enter_valid_username_and_password()
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password){
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_secret");
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        loginPage=new LoginPageDemo(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @And("click the login button")
    public void click_the_login_button() {
        //driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //driver.findElement(By.id("login-button")).click();
        loginPage.clickLoginButton();

    }
        @Then("user should be navigated to home page")
         public void user_should_be_navigated_to_home_page() {
        //System.out.println("user should be navigated to home page"+driver.findElement(By.xpath("//span[@class='title']")));
        //driver.findElement(By.xpath("//span[@class='title']"))
         loginPage.ProductDisplay();
    }
    @And("close the browser")
    public void close_the_browser() {

        driver.quit();
    }
}
