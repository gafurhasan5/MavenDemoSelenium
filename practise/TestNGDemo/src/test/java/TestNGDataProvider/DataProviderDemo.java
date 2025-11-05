package TestNGDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderDemo {
@Test(dataProvider = "SearchDataSet",dataProviderClass = DataProvidermethod.class)
public void TestCaseGooglesearch(String country,String monument)
{
    WebDriver driver = new ChromeDriver();
    {
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(country+" "+monument);
        driver.findElement(By.name("btnK")).submit();
    }
}}