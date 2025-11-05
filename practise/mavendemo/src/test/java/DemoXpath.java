import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Xpath=//tagname[@Attribute='value']
         //tagname->like input,div,img,button
        //attribute==attribute name
        //value=value of attribute
        ///for Xpath in console use $x("//textarea(tag name)[@class='name']")
        //driver.get("https://www.google.com");
        //driver.get("https://www.saucedemo.com/");
        //locateEleBYeXpathId(driver);
        //locateEleBYeXpathclass(driver);
        //locateEleBYeXpathPositionMethod();
        driver.get("https://omayo.blogspot.com/");
//        String pageTitle=driver.getTitle();
//        System.out.println("Page Title:"+pageTitle);
//        String pageUrl=driver.getCurrentUrl();
//        System.out.println("Page Url link 1:"+pageUrl);
//        driver.findElement(By.id("selenium143")).click();
//        String pageUrl2=driver.getCurrentUrl();
//        System.out.println("Page Url link 2:"+pageUrl2);
//        Thread.sleep(3000);
//        driver.quit();
//       WebElement searchbutton=driver.findElement(By.cssSelector("input[title='search'][value='Search']"));
//       String searchValue = searchbutton.getAttribute("value");
//        System.out.println(searchValue);
//        String searchclass = searchbutton.getAttribute("class");
//        System.out.println(searchclass);
//        boolean temp=driver.findElement(By.id("checkbox2")).isSelected();
//
//        System.out.println(temp);

//         driver.navigate().to("https://selenium143.blogspot.com/");
//         Thread.sleep(2000);
//         driver.navigate().back();
//         Thread.sleep(2000);
//         driver.navigate().forward();
//         Thread.sleep(2000);
//         driver.navigate().refresh();
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//        driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.id("input-password")).sendKeys("12344");
//        Thread.sleep(2000);
//        //driver.findElement(By.cssSelector("input[value='Login']")).click();
//        driver.findElement(By.id("input-password")).submit();
        Dimension d=new Dimension(200,300);
                driver.manage().window().setSize(d);

       // driver.quit();
    }

    private static void locateEleBYeXpathPositionMethod(WebDriver driver) {
        driver.findElement(By.xpath("//"));
    }

    private static void locateEleBYeXpathclass(WebDriver driver) {
        driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("standard_user");
        //driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
    }

    private static void locateEleBYeXpathId(WebDriver driver) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }
}
