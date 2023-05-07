package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFileData {
public void getData(String key) throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
	
	p.load(fis);
	p.getProperty(key);
	
	
}
}
