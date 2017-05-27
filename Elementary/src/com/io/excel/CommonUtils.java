package com.io.excel;

public class CommonUtils {

	public static String getSuffix(String path) {
		if(path==null || Constants.EMPTY.equals(path)) {
			return Constants.EMPTY;
		}
		if(path.contains(Constants.POINT)) {
		 String suffix = path.substring(path.lastIndexOf(Constants.POINT)+1, path.length());
		 return suffix;
		}
		return Constants.EMPTY;
	}
}
