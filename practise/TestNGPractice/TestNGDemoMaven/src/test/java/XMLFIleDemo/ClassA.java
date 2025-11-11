package XMLFIleDemo;

import org.testng.annotations.Test;

public class ClassA {
	
	@Test(priority=1)
	public void Amethod1()
	{
		System.out.println("A method1");
	}
	@Test(priority=2)
	public void Amethod2()
	{
		System.out.println("A method2");
	}
	@Test(priority=3)
	public void Amethod3()
	{
		System.out.println("A method3");
	}

}
