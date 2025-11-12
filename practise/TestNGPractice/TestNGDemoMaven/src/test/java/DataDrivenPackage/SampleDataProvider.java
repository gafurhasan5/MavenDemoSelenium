package DataDrivenPackage;

import org.testng.annotations.DataProvider;

public class SampleDataProvider {
	@DataProvider(name="dataGet1")
	public Object[][] dataGet()
	{
		Object[][] data = {{"angelatucker13287@suffermail.com","password"},{"Rehankhan56390@gmail.com","Password"},{"Rehankhan56391@gmail.com","Password"}};
	       return data;
	}

}
