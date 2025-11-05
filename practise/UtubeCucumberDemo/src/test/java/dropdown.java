import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("input-country"));
       Select dropdown=new Select(element);
       dropdown.selectByVisibleText("American Samoa");
    }
}
