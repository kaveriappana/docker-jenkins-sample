package config;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
   public static String path;
   public static String url;
   static Properties prop=new Properties();
    public static void readPropertiesFile(){

        try {
            InputStream input= new FileInputStream("C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\src\\main\\java\\config\\config.properties");
            prop.load(input);
            System.out.println(prop.getProperty("browser"));
           path = prop.getProperty("driverpath");
           url= prop.getProperty("url");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            OutputStream output= new FileOutputStream("C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\src\\main\\java\\config\\config.properties");
            prop.setProperty("driverpath","C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\resources\\chromedriver.exe");
            prop.setProperty("url","www.amazon.com/");
            prop.store(output,null);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static void main(String args[]){

        PropertiesFile p1 = new PropertiesFile();
        p1.readPropertiesFile();
        p1.writeFile();
        p1.readPropertiesFile();
    }

}
