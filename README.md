This project to convert XML documents to JSON to read any attribute value then compare this value with expected result 
This project contains the following classes:
•	 Configuration: to read the xml file path, the name for attribute and expected value 
•	 CovertXMLToJson : to receive the XML path and convert it to JSON object
•	 FindTagOnJson : to search for the value for any attribute and return it
•	 TestJSONData :  to assert if the attribute value is equal to expected result

Note : After clone this code , you can follow the following steps:
•	.Change the Configuration text file path at the Configuration class at the variable "filePath" at method "ReadConfigurationFile"
•	 At the Configuration text file write the XML path on first line then the attribute name and expected result
