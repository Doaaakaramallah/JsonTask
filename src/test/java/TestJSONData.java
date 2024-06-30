import XMLConverter.Configuration;
import XMLConverter.CovertXMLToJson;
import XMLConverter.FindTagOnJson;
import com.fasterxml.jackson.databind.JsonNode;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;

public class TestJSONData {
    static JsonNode jsonNode;
    static ArrayList<String> configurationdata;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        configurationdata   = Configuration.ReadConfigurationFile();
        //read xml Path
        String xmlFilePath = configurationdata.get(0);
        // Convert XML to JSON
         jsonNode = CovertXMLToJson.convertXMLFileToJsonNode(xmlFilePath);
        if (jsonNode != null) {
            System.out.println("Converted JSON: " + jsonNode.toPrettyString());
        }
    }
    @Test
    public void testJSONData(){
        JSONObject jsonObject = new JSONObject(jsonNode.toPrettyString());
        //The name of attribute to be found
        String keyToFind = configurationdata.get(1);
        Object result = FindTagOnJson.findAllKeys(jsonObject, keyToFind);
        System.out.println("Value for key '" + keyToFind + "': " + result);
        //The value  of expected output
        String ExpectedResult=configurationdata.get(2);
        Assert.assertTrue(result.toString().contains(ExpectedResult) ,"Json object doesn't contain specific data");
    }
}
