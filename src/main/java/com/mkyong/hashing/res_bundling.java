package com.mkyong.hashing;

import java.util.ResourceBundle;

public class res_bundling {
	
	public static String getBundle(String key) {
		final String s1="Global";
		ResourceBundle rs=ResourceBundle.getBundle(s1);
		return rs.getString(key);
			
	}

}
