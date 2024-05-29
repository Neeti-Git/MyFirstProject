package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumFramework\\src\\test\\resources\\confifFiles\\config.properties");
		Properties p= new Properties();
		p.load(fr);
	}

}
