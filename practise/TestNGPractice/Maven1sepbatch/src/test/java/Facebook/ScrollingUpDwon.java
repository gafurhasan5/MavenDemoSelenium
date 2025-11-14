package Facebook;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUpDwon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,330)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-230)");
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//img[@class=\"banner-image\"]"));
		js.executeScript("arguments[0].scrollIntoView()",a);
		js.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
		driver.manage().deleteAllCookies();
		driver.close();*/
		Thread.sleep(2000);
		Actions actions=new Actions(driver);

         actions.sendKeys(Keys.PAGE_DOWN);
		//actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		//actions.sendKeys(keys)
		//actions.sendKeys(PAGE_DOWN).perform();
		

	}
}