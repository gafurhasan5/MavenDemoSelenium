import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsHandlePopUp {
    static WebDriver driver = null;
    static Set<String> windowHandles;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        String parentWindows = driver.getWindowHandle();
        driver.findElement(By.id("ta1")).sendKeys("gafur Hassan");
        driver.findElement(By.xpath("//a[contains(text(),\"Open a popup window\")]")).click();//child1 window
        driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();//child2 windows
        windowHandles = driver.getWindowHandles(); //  all windows ids
        //switch to first windows
        RequirdWindowSwitch("New Window");
        String Text = driver.findElement(By.xpath("//div[@class='example']")).getText();
        System.out.println("Text of child windows is :" + Text);
        //switch second window
        RequirdWindowSwitch("Blogger.com - Create a unique and beautiful blog easily.");
        driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
        //back to parent windows
        driver.switchTo().window(parentWindows);
        driver.findElement(By.name("q")).sendKeys("Insha Ansari");
        driver.quit();
    }

    public static void RequirdWindowSwitch(String tile) {
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String win1 = iterator.next();
            driver.switchTo().window(win1);
            if (driver.getTitle().equals(tile)) {
                break;
            }
        }
    }
}
    /*
    //other type use of  Arralist
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        String parentWindows = driver.getWindowHandle();
        driver.findElement(By.id("ta1")).sendKeys("gafur Hassan");
        driver.findElement(By.xpath("//a[contains(text(),\"Open a popup window\")]")).click();//child1 window
        driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();//child2 windows
         //Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        //covert set to list
        ArrayList<String> WindowList = new ArrayList<>(windowHandles);
        driver.switchTo().window(WindowList.get(0));
        System.out.println(driver.getTitle());
        String Text=driver.findElement(By.xpath("//div[@class='example']")).getText();
        System.out.println("Text of child windows is :"+Text);
        //Thread.sleep(2000);
       // driver.close();
        //switch to second child
        driver.switchTo().window(WindowList.get(1));
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
        Thread.sleep(2000);
        driver.close();
        //driver.switchTo().window(parentWindows);
       driver.switchTo().window(WindowList.get(0));
        driver.findElement(By.name("q")).sendKeys("Insha Ansari");
        Thread.sleep(2000);
    }
}*/




 /* WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
          String parentWindows= driver.getWindowHandle();
          driver.findElement(By.id("ta1")).sendKeys("gafur Hassan");
          //Thread.sleep(2000);
        //System.out.println("debug for child1 windows click");


        //System.out.println(" debug for  before child2 windows click");
        driver.findElement(By.xpath("//a[contains(text(),\"Open a popup window\")]")).click();//child1 window
        //driver.findElement(By.linkText("Blogger")).click();//child2 windows
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Blogger']")).click();
       // System.out.println(" debug for  after child2 windows click");
        //Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();//get Set of  unique Windows  Id
        Iterator<String> iterator1 = windowHandles.iterator();
        //System.out.println("debug1 for child1 windows");
        while (iterator1.hasNext())
        {
            String win = iterator1.next();
              driver.switchTo().window(win);  //switch parent to child1 windows
            if(driver.getTitle().equals("New Window"))
            {
                //System.out.println("Title of driver is :"+driver.getTitle());
                   String Text=driver.findElement(By.xpath("//div[@class='example']")).getText();
                   //driver.findElement(By.className("example")).getText();
                    System.out.println("Text of child windows is :"+Text);
                 //System.out.println("Gafur debug");
                 break;
            }
        }
        //Thread.sleep(2000);


        Iterator<String> iterator2 = windowHandles.iterator();
        while (iterator2.hasNext()) {
            String win1 = iterator2.next();
           // System.out.println(" Hassan1 debug");
            driver.switchTo().window(win1);
            //System.out.println(" Hassan2 debug");
            if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily."))
            {
                //System.out.println(" Hassan3 debug");
                driver.findElement(By.xpath("//span[text()=\"Sign in\"]")).click();
                Thread.sleep(2000);
                break;
            }

        }
        //System.out.println("debug3 for child again parent windows");
      //Thread.sleep(2000);
        driver.switchTo().window(parentWindows); //back to parent Windows
        //driver.switchTo().defaultContent();
        driver.findElement(By.name("q")).sendKeys("Insha Ansari");
       Thread.sleep(2000);
        //driver.quit();

       //driver.close();*/