This project to convert XML documents to JSON to read any attrbuite value then compare this value with expected result 
This project contains the following classes:
. Configuration : to read the xml file path , the name for attrbuite and expected value 
. CovertXMLToJson : to recieve the XML path and convert it to JSON object
. FindTagOnJson : to seach for the value for anyy attrbuite and return it
. TestJSONData :  to assert if the attrbuite value is equal to expected result

Note : After clone this code , you follow this step:
. Change the Configuration text file path at the Configuration class at the variable "filePath" at method "ReadConfigurationFile"
. At the Configuration text file write the XML path on first line then the attrbuite name and expected result 
