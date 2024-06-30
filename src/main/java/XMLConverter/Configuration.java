package XMLConverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Configuration {

    public static ArrayList<String> ReadConfigurationFile()  {
     /*
        Path to the file -Please change it to your path which contain the following:
        First Line is XML Path
        Second one for any attribute Name
        Third line is Expected Value
     */
        String filePath = "C:/Users/Delta Store/Desktop/ConfigureData.txt";
        // Create an ArrayList to hold the data
        ArrayList<String> configurationdata = new ArrayList<>();

        // Use BufferedReader to read the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Add each line to the ArrayList
                configurationdata.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configurationdata;
    }
}
