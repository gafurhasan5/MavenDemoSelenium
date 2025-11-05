package TestNGBatchTestingDemo;

import org.testng.annotations.Test;

public class HomeScreenTest {
    @Test
    public  void LaunchApllication()
    {
        System.out.println("Launch Apllication");
    }
    @Test
    public  void VerifyTitle()
    {
        System.out.println("Title Verify Successfully");
    }
    @Test
    public  void VerifyLogo()
    {
        System.out.println("Logo Verify Successfully");
    }
}
