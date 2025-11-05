package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelctordemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.get("https://www.saucedemo.com/");
        //locateByIdWithCSS(driver);
        //locateByClassWithCSS(driver);
        //locateByWIthOtherDifferentAttibute(driver);
        locateByCombinations(driver);
        locateBySubStringText(driver);
        Thread.sleep(2000);
        //driver.quit();

    }

    private static void locateBySubStringText(WebDriver driver) {
        //driver.findElement(By.cssSelector("button[id^='add-to-cart-test']")).click();
        //driver.findElement(By.className("btn btn_primary btn_small btn_inventory ")).click();
       // driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        //driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    private static void locateByCombinations(WebDriver driver) throws InterruptedException {

        //driver.findElement(By.cssSelector("input.input_error form_input[placeholder='UserName']")).sendKeys("standard_user");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
    }

    private static void locateByWIthOtherDifferentAttibute(WebDriver driver) {
        //driver.findElement(By.cssSelector("button[name='button1']")).click();
       // driver.findElement(By.name("button1")).click();
        //driver.findElement(new By.ByName("button1")).click();
    }

    private static void locateByClassWithCSS(WebDriver driver) {
        //driver.findElement(By.cssSelector("button[class='buttonClass']")).click();
        //driver.findElement(By.cssSelector("button.buttonClass")).click();
        //driver.findElement(By.cssSelector(".buttonClass")).click();
        //driver.findElement(By.className("buttonClass")).click();
        //driver.findElement(By.cssSelector("button[class^='but']")).click();  // ^ ->start with means
        //driver.findElement(By.cssSelector("button[class$='ass']")).click(); // $ is ends with
        //driver.findElement(By.cssSelector("button[class*='uttonC']")).click();  // * contain means in bw ,start with and end
    }

    private static void locateByIdWithCSS(WebDriver driver) {
        //driver.findElement(By.cssSelector("a[id='idExample']")).click();
       // driver.findElement(By.cssSelector("a#idExample")).click();
        //driver.findElement(By.cssSelector("#idExample")).click();
        //driver.findElement(By.cssSelector("a[id^='idE']")).click(); //^->start-with


    }
}
