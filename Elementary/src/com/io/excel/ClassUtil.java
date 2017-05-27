package com.io.excel;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ClassUtil {
	private Class beanClass;
	private Field[] fields;
	private Method[] methods;
	private Map<Field, Method> setMap;
	private Map<Field, Method> getMap;
	
	public ClassUtil(String className) throws Exception{
		this.beanClass = Class.forName(className);
		this.fields = beanClass.getDeclaredFields();
		this.methods = beanClass.getDeclaredMethods();
		this.setMap = new HashMap<Field,Method>();
		this.getMap = new HashMap<Field,Method>();
		
		for(int i = 0; i <this.fields.length; i++){
			for(int j = 0; j < methods.length; j++) {
				String fName = fields[i].getName().toLowerCase();
				String mName = methods[j].getName().toLowerCase();
				if(mName.endsWith(fName)) {
					if(mName.startsWith(Constants.SET)){
						setMap.put(fields[i], methods[j]);
					} else if (mName.startsWith(Constants.GET)){
						getMap.put(fields[i], methods[j]);
					}
				}
			}
		}
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public Field[] getFields() {
		return fields;
	}

	public Method[] getMethods() {
		return methods;
	}

	public Map<Field, Method> getSetMap() {
		return setMap;
	}

	public Map<Field, Method> getGetMap() {
		return getMap;
	}
	
	
	
	
}
