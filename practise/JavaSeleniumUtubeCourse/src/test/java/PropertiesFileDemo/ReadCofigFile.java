package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadCofigFile
{
    Properties prop;
    String path="";
    public ReadCofigFile()
    {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            try {
                prop.load(fis);
            } catch (IOException e) {
                //throw new RuntimeException(e);
                // e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    public String getUrl()
    {
        //return prop.getProperty("url");
        String url=prop.getProperty("url");
        if(url!=null)
        {
            return url;
        }
        else
        {
            throw new RuntimeException("url is null");
        }
    }
    public String getUsername()
    {
        String uname=prop.getProperty("username");
        if(uname!=null)
        {
            return uname;
        }
        else
        {
            throw new RuntimeException("uname is null");
        }
    }
    public String getPassword() {
        String pword = prop.getProperty("password");

        if (pword != null) {
            return pword;
        } else {
            throw new RuntimeException("pword is null");
        }
    }
}
