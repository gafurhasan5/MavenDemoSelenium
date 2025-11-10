import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
        String LabelText=driver.findElement(By.xpath("//div[@id='example_info']")).getText();
        System.out.println(LabelText);
        for(int i=1;i<=4;i++)
        {
            if(driver.findElement(By.xpath("//td[@class='sorting_1']")).getText().equals("Alice Johnson"))
            {
                String text=driver.findElement(By.xpath("//td[contains(text(),'Texas')]")).getText();
                System.out.println(text);
                break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//li[@class='paginate_button page-item active']/following::li")).click();
        }

    }
}
