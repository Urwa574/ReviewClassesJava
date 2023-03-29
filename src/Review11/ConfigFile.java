package Review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args)  {
        //location of the file
        String path="Files/Config.properties";
        //whenever we have to read the data from
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            //this properties class will assist us to read and write data to. properties file
            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("userName"));
        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong ");
        }catch(NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        } catch (IOException e) {
            System.out.println("IO exception occurred");
        }
    }
}
