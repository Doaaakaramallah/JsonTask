package XMLConverter;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class FindTagOnJson {

    public static List<Object> findAllKeys(JSONObject jsonObject, String key) {
        List<Object> results = new ArrayList<>();
        findAllKeysHelper(jsonObject, key, results);
        return results;
    }

    private static void findAllKeysHelper(Object obj, String key, List<Object> results) {
        if (obj instanceof JSONObject jsonObject) {
            if (jsonObject.has(key)) {
                results.add(jsonObject.get(key));
            }
            for (String k : jsonObject.keySet()) {
                Object value = jsonObject.get(k);
                findAllKeysHelper(value, key, results);
            }
        } else if (obj instanceof JSONArray jsonArray) {
            for (int i = 0; i < jsonArray.length(); i++) {
                findAllKeysHelper(jsonArray.get(i), key, results);
            }
        }
    }
}
