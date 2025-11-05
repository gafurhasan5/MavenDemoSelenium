package TestNGTestURLDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class URlTestNGDemo {
    @Test
    public void CheckUrl()
    {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String Expectedtitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,Expectedtitle);
    }
}
