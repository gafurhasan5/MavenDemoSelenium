import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleExceptionhandleDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        try{
              WebElement messsage=driver.findElement(By.xpath("//div[@class='large-10 columns large-centered']/div[3]/div[2]"));
               System.out.println("Message print: "+messsage.getText());
               driver.findElement(By.xpath("//a[text()='click here']")).click();
               try {
                   System.out.println("Trying to print again: ");
                   System.out.println(messsage.getText());
               }catch (StaleElementReferenceException e)
               {
                   System.out.println("Caught the stale Element exception,trying to relocate: ");
                   WebElement content=driver.findElement(By.xpath("//div[@class='large-10 columns large-centered']/div[3]/div[2]"));
                   System.out.println(content.getText());
               }

        }
        catch (Exception e)
        {
            System.out.println("Exception found; "+e.getMessage());
        }
        finally {
            driver.quit();
        }

    }
}
