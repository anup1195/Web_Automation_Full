package com.fab_alley.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/**
 * 
 * @author ANUP KUMAR
 * @project FABALLEY_WEB
 * @DATE 18/09/2021
 * @program description- 
 *
 */


public class GetPropertiesValue {
static String filepath=".\\testdata\\config.properties";
	
	/**
	 * @description getValue() read the value from config.properties
	 * @param key
	 * @return
	 */
	
	public static String getValue(String key){
		Properties prop=new Properties();
		try{
			prop.load(new FileInputStream(new File(filepath)));
			
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
		
	}
}
//	
//	static Map<String, String> map = new HashMap<String, String>() {/**
//		 * 
//		 */
//		private static final long serialVersionUID = 1L;
//
//	{
//		put("fabstagingpsw","https://demo:Fab@Alley@18@staging.faballey.com/");
//		put("fabstaging","https://newuistaging.faballey.com/");
//		put("fabpreprodpsw","https://demo:Fab@Alley@18@preprod.faballey.com/");
//		put("fablive","https://faballey.com");
//		put("hoistagingpsw","https://demo:Fab@Alley@18@staging.houseofindya.com/");
//		put("hoipreprodpsw","https://demo:Fab@Alley@18@preprod.houseofindya.com/");
//		put("hoilive","https://houseofindya.com");
//		put("browser","Chrome");
//	}};
	
//	public static String getValue(String key){
//		if(map.containsKey(key)) {
//			return map.get(key).toString();
//		}
//		return "";
//	}
//
//}
