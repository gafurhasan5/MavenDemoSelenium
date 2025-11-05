package Cookie;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CookiesDemo {
    public  static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.amazon.com/");
        driver.get("https://www.rediff.com/");
        Set<Cookie>allcookie=driver.manage().getCookies();
        System.out.println("size of cookie in this website "+allcookie.size());
        System.out.println("all cookies");
        for(Cookie cookie:allcookie) {
            System.out.println(cookie.getName()+","+cookie.getValue());
        }
        System.out.println(driver.manage().getCookieNamed("_ga_8J9SC9WB3T,GS2.1.s1761392917$o1$g1$t1761392972$j5$l0$h0"));
    }
}
