package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String readDataFromProperty(String absPath,String data)   {
		File file= new File(absPath);
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(file);
		} catch (Exception e) {
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
		}
		String value=prop.getProperty(data);
		return value;
	}

}
//in notepade store data in key value pair
