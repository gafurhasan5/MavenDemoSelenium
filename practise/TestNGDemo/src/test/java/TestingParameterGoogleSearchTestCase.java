import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingParameterGoogleSearchTestCase {
    @Parameters({"keyword"})
    @Test
    public void GoogleSearchTest(String searchText){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchdata=driver.findElement(By.name("q"));
        searchdata.sendKeys(searchText);

    }
}
