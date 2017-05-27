package com.lifecycle;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

public class MyClassLoader extends ClassLoader {

	private String name;
	private String path = "d:\\";
	private final String fileType = ".class";
	
	public MyClassLoader(String name) {
		super();
		this.name = name;
	}
	
	public MyClassLoader(ClassLoader parent, String name) {
		super(parent);
		this.name = name;
	
	}
	
	public String toString() {return name; }
	
	public void setPath(String path) {this.path = path;}
	public String getPath() { return this.path;}
	
	protected Class findClass(String name) throws ClassNotFoundException {
		byte [] data = loadClassData(name);
		return defineClass(name,data,0,data.length);
	}
	
	private byte[] loadClassData(String name) throws ClassNotFoundException {
		FileInputStream fis = null;
		byte [] data = null;
		ByteArrayOutputStream baos = null;
		try {
			name = name.replaceAll("\\.", "\\\\");
			fis = new FileInputStream(new File(path+name+fileType));
			baos = new ByteArrayOutputStream();
			int ch = 0;
			while ((ch = fis.read()) != -1) {
				baos.write(ch);
			}
			data = baos.toByteArray();
		} catch (IOException e) {
			throw new ClassNotFoundException("Class is not found:"+name, e);
		} finally {
			try {
				fis.close();
				baos.close();
			} catch (IOException e) {e.printStackTrace();}
		}
		return data;
	}
	
	public static void main(String [] args ) throws Exception {
		MyClassLoader loader1 = new MyClassLoader("loader1");
		loader1.setPath("D:\\myapp");
		
	}
}
