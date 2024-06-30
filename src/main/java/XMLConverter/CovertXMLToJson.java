package XMLConverter;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class CovertXMLToJson {

    public static JsonNode convertXMLFileToJsonNode(String filePath) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.readTree(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
