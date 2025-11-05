import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
        driver.switchTo().frame("left");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("right");
        System.out.println(driver.findElement(By.tagName("body")).getText());*/
        driver.get("https://www.rediff.com/");
        WebElement iframe=driver.findElement(By.name("moneyiframe"));
        driver.switchTo().frame(iframe);
       String bseindex= driver.findElement(By.id("bseindex")).getText();
        System.out.println(bseindex);

    }
}
