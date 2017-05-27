package com.exception;

import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception{

	protected Throwable cause=null;
	
	private List<Throwable> exceptions = new ArrayList<Throwable>();
	
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
	
	public MyException(Throwable cause) {
		this.cause=cause;
	}
	
	public List<Throwable> getExceptions(){
		return this.exceptions;
	}
	
	public void addException(Throwable cause) {
		this.exceptions.add(cause);
	}
}
