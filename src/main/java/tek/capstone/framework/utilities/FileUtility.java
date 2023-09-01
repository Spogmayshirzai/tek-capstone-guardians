package tek.capstone.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility  {
	
	
	//Retrieves a FileInputStream for the specified file path.
    //@param filePath the path of the file to retrieve the input stream for
    // @return a FileInputStream for the specified file
    // @throws FileNotFoundException if the file specified by the filePath does not exist
	
	//FileInputStream class helps to read sequential data from sources.
    // file input stream is used to get data from the file
	
	public static FileInputStream getFileInPutStream(String filepath) throws FileNotFoundException {
		
	return new FileInputStream(new File(filepath));
	
}
	

}
  