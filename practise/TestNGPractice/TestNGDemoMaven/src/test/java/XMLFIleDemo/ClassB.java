package XMLFIleDemo;

import org.testng.annotations.Test;

public class ClassB {
	@Test(priority=1)
	public void Bmethod1()
	{
		System.out.println("B method1");
	}
	@Test(priority=2)
	public void Bmethod2()
	{
		System.out.println("B method2");
	}
	@Test(priority=3)
	public void Bmethod3()
	{
		System.out.println("B method3");
	}

}
