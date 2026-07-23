package projectName.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {




    //1 Create the Properties object (create object)
    //make it private so it's now accesible outside the class and static so it belongs to class
    private static Properties properties = new Properties();

    static{

        try {
            //2 Open file using FileInputStream (open files)
            FileInputStream file = new FileInputStream("config.properties");

            //3 Load the "properties" object with "file" (load properties)
            properties.load(file);

            //close file in the memory
            file.close();
        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!");
            e.printStackTrace();
        }
    }

    //4 Use "properties" object to read from the file (read properties)
    //create utility method use the object to read

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }




}
