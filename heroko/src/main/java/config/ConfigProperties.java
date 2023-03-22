package config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
    static Properties prop = new Properties();
    public static String browser;
    public static String url;
    public static String username;
    public static  String password;
    public static String path;
    public static String text;
    public static String option;
    public static void main(String args[]){
        ConfigProperties cmp = new ConfigProperties();
        cmp.readConfigProperties();
    }

    public static void readConfigProperties(){
        try {
            InputStream input=new FileInputStream("C:\\Users\\kaveri.appana\\IdeaProjects\\heroko\\src\\main\\java\\config\\propertiesfile");
            prop.load(input);
            //System.out.println(prop.getProperty("url"));
            browser = prop.getProperty("browser");
            url =  prop.getProperty("url");
            username = prop.getProperty("username");
            password= prop.getProperty("password");
            text=prop.getProperty("text");
            path=prop.getProperty("path");
            option=prop.getProperty("option");
            //base.BaseTests.url = prop.getProperty("url");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
