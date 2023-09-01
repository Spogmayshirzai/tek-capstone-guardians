package tek.capstone.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles  {
	
 // create private static variable
	
	private static ReadYamlFiles readYamlFiles;
	// create a pritve static variable
	//hashmap to store data and retrieve base on key
	
	private HashMap propertyMap;
	//private constructor to retrieve it to the class itself 
	
	private ReadYamlFiles(String filePath) throws FileNotFoundException {
		FileInputStream fileInPutStream = FileUtility.getFileInPutStream(filePath);
		Yaml yaml = new Yaml(); // first we created the instance in order to call it 
		this.propertyMap= yaml.load(fileInPutStream);
	}
	// created instance of the class 
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		if(readYamlFiles== null)
			return new ReadYamlFiles(filePath);
			return readYamlFiles;
}
// public method to get yaml properties
		public HashMap getYamlProperty(String Key) {
			return(HashMap)
					this.propertyMap.get(Key);
			
					
			
			
			
	}
	
	
	
}
