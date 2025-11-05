package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
       // driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
//        List<WebElement>options=driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
//        for (WebElement e:options) {
//            System.out.println(e.getText());
//        }
        List<WebElement>links=driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
          int n=links.size();
          String path="(//div[@id='LinkList1']//a)";
        for(int i=1;i<=n;i++)
        {
            String elePath=path+"["+i+"]";// like work as "(//div[@id='LinkList1']//a)[1]"
            System.out.println(elePath);
            driver.findElement(By.xpath(elePath)).click();
            //Thread.sleep(1000);
            driver.navigate().back();
        }
        //List<WebElement>allLinks=driver.findElement(By.xpath("//a"));
        List<WebElement>allLinks=driver.findElements(By.xpath("//a"));
        for(WebElement e:allLinks)
        {
            System.out.println(e.getAttribute("href"));
        }
    }
}
