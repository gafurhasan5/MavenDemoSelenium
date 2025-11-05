import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']")).click();
//        //driver.findElement(By.xpath("//input[@type='radio' and @value='rd1']")).click();
//        driver.findElement(By.xpath("//td[contains(text(),'Checkbox Items:')][2]")).click();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
        //Thread.sleep(2000);
       // driver.switchTo().alert().accept();
       //driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
       //Thread.sleep(2000);
        //driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//input[@id='promptexample']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("gafur");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.quit();

    }
}
