package org.sdet38_vije;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//step 1:use File Input Stream to load the property file
		FileInputStream fis = new FileInputStream(".\\data\\commonData.properties");
		//step 2:create object of properties and load the file
		Properties prop = new Properties();
		prop.load(fis);
		//step 3:provide the key to read the value
		String URL = prop.getProperty("url");
		System.out.println(URL);
		String USERNAME = prop.getProperty("username");
		System.out.println(USERNAME);
		String PASSWORD = prop.getProperty("password");
		System.out.println(PASSWORD);
		
		

	}

}
