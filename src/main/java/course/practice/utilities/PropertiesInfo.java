package course.practice.utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInfo implements AppInterface {
        public Properties getPropertiesData()throws IOException{
            Properties prop = new Properties();
            FileReader fileInput = new FileReader(propertiesFile);
            prop.load(fileInput);
            return prop;
        }

        public String getPropertyFile(String dataInFile)throws IOException{
            String propFile = getPropertiesData().getProperty(dataInFile);
            System.out.println("propiedad "+propFile);
            return propFile;
        }
}
