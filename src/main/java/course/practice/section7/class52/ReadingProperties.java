package course.practice.section7.class52;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args)throws IOException{
        String path="src/main/resources/test.properties";
        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);
        prop.load(fs);

        //System.out.println(prop.getProperty("name"));
        //System.out.println(prop.getProperty("pass"));

        for (int i=1; i<=10; i++){
            System.out.println("Soy el "+prop.getProperty("data"+i)+" del archivo de propiedades");
        }

    }
}
