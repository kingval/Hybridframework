package CommonPages;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty{
    static Properties prop;
    static FileInputStream input;
    static String filelocation ="C:\\Users\\cheta\\IdeaProjects\\FrameWorkHyBrid\\src\\test\\resources\\TestData\\Config.Properties";

    public String getProperty(String keyName){
        prop = new Properties();
        try {
            input = new FileInputStream(filelocation);
            prop.load(input);
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }
}
