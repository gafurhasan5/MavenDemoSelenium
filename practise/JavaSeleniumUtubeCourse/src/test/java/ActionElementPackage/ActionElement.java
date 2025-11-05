package ActionElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Actions actions = new Actions(driver);

       Action seriesofAction= actions.moveToElement(driver.findElement(By.xpath("//input[@id='user-name']")))
               .click().sendKeys("standard_user", Keys.TAB)
               .sendKeys("secret_sauce",Keys.ENTER).build();
                seriesofAction.perform();
    }
}
