import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicTableAndPagenationHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo3x.opencartreports.com/admin/");
        driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        // driver.findElement(By.id("menu-sale")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();
       // driver.findElement(By.xpath("//input[@value='39']")).click();
        String LabelText= driver.findElement(By.xpath("//div[contains(text(),'Showing 1 to 20 of 25 (2 Pages)')]")).getText();
        //System.out.println(LabelText);
        int indexstart=LabelText.indexOf("(")+1;
        int indexeend=LabelText.indexOf("Pages")-1;
        //System.out.println(indexstart);
        //System.out.println(indexeend);

        String pos=LabelText.substring(indexstart,indexeend);
        int pagecount=Integer.parseInt(pos);
        //System.out.println("pagecount:"+pagecount);
        String searchName="Dennis Hunt";
        for(int i=0;i<pagecount;i++)
        {
            String path="//form[@id='form-order']//div//table//tbody//tr//td[text()='"+searchName+"']";
            if(driver.findElement(By.xpath(path)).isDisplayed())
            {//String path="//form[@id='form-order']//tr//td[3]/preceding-sibling::td[2]";
            //driver.findElement(By.xpath(path)).click();
              //driver.findElement(By.xpath("//form[@id='form-order']//tr//td[3]/preceding-sibling::td[2]")).click();
                Thread.sleep(5000);
              driver.findElement(By.xpath("//input[@value='39']")).click();
                break;
            }
            Thread.sleep(5000);
            driver.findElement(By.xpath("//ul[@class='pagination']//li[@class='active']/span//following::a[1]")).click();

        }



        //driver.close();

    }
}

