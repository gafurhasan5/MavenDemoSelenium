package TestNGDataProvider;

import org.testng.annotations.DataProvider;

public class DataProvidermethod {
    @DataProvider(name="SearchDataSet")
    public Object[][] SearchData()
    {
        Object[][] datakeyword=new Object[3][2];
        datakeyword[0][0]="India";
        datakeyword[0][1]="Qutub Minar";
        datakeyword[1][0]="Agra";
        datakeyword[2][1]="TajMahal";
        datakeyword[2][0]="Agra";
        datakeyword[2][1]="TajMahal";
        return datakeyword;

    }

}
