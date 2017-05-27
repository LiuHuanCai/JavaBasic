package com.io.excel;

import java.util.List;

public interface ExcelOperator {
	public List<?> readExcel(String path, String beanClassName) throws Exception;
	public void writeExcel(List<?> list, String path, String beanClassName) throws Exception;
}