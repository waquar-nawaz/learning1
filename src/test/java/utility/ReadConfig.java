package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL() {

		return prop.getProperty("nopComm_app_qa");
	}
	


	public String get_useremail() {

		return prop.getProperty("admin_email");
	}

	public String get_pass() {

		return prop.getProperty("admin_pass");
	}

}
