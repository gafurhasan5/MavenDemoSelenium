package XMLFIleDemo;

import org.testng.annotations.Test;

public class ClassC {
	@Test(priority=1)
	public void Cmethod1()
	{
		System.out.println("C method1");
	}
	@Test(priority=3)
	public void Cmethod2()
	{
		System.out.println("C method2");
	}
	@Test(priority=2)
	public void Cmethod3()
	{
		System.out.println("C method3");
	}

}
