package com.io.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelOperatorImpl implements ExcelOperator {

	@Override
	public List<?> readExcel(String path, String beanClassName) throws Exception {
		if(path == null || Constants.EMPTY.equals(path)){
			return null;
		} else {
			String suffix = CommonUtils.getSuffix(path);
			if(Constants.SUFFIX2003.equals(suffix)){
				return readXls(path, beanClassName);
			} else if(Constants.SUFFIX2010.equals(suffix)){
				return readXlsx(path, beanClassName);
			} else {
				System.out.println(path+" is not Exel file");
			}
			
		}
		return null;
	}

	@Override
	public void writeExcel(List<?> list, String path, String beanClassName) throws Exception{
		if(path == null || Constants.EMPTY.equals(path)){
			return ;
		} else if (list == null || list.size() <= 0) {
			return;
		} else {
			String suffix = CommonUtils.getSuffix(path);
			if(Constants.SUFFIX2003.equals(suffix)){
				 writeXls(list, path, beanClassName);
			} else if(Constants.SUFFIX2010.equals(suffix)){
				 writeXlsx(list, path, beanClassName);
			} else {
				System.out.println(path+" is not Exel file");
			}
			
		}
	}

	
	private void writeXls(List<?> list, String path, String beanClassName) throws Exception {
		int countRowNum = list.size();
		ClassUtil classUtil = new ClassUtil(beanClassName);
		HSSFWorkbook book = new HSSFWorkbook();
		HSSFSheet sheet = book.createSheet("studentSheet");
		// option at first row.
		HSSFRow firstRow = sheet.createRow(0);
		Field[] options = classUtil.getFields();
		HSSFCell[] firstCells = new HSSFCell[options.length];
		
		for (int j = 0; j < options.length; j++) {
			firstCells[j] = firstRow.createCell(j);
			firstCells[j].setCellValue(new HSSFRichTextString(options[j].getName()));
		}
		//
		for (int i = 0; i < countRowNum; i++) {
			HSSFRow row = sheet.createRow(i + 1);
			Object obj = list.get(i);
			for (int column = 0; column < options.length; column++) {			
				HSSFCell cell = row.createCell(column);
				String value = classUtil.getGetMap().get(options[column]).invoke(obj, null).toString();
				cell.setCellValue(value);
			}
		}
		File file = new File(path);
		if(file.exists()) {
			file.delete();
		}
		OutputStream os = new FileOutputStream(file);
		System.out.println("write data to file: " + path);
		book.write(os);
		os.close();
	}
	
	
	private void writeXlsx(List<?> list, String path, String beanClassName) throws Exception {
		int countRowNum = list.size();
		ClassUtil classUtil = new ClassUtil(beanClassName);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("studentSheet");
		// option at first row.
		XSSFRow firstRow = sheet.createRow(0);
		Field[] options = classUtil.getFields();
		XSSFCell[] firstCells = new XSSFCell[options.length];
		
		for (int j = 0; j < options.length; j++) {
			firstCells[j] = firstRow.createCell(j);
			firstCells[j].setCellValue(new XSSFRichTextString(options[j].getName()));
		}
		//
		for (int i = 0; i < countRowNum; i++) {
			XSSFRow row = sheet.createRow(i + 1);
			Object obj = list.get(i);
			for (int column = 0; column < options.length; column++) {			
				XSSFCell cell = row.createCell(column);
				//cell.setcellva
				//Class type = options[column].getType();
				//type.
				String value = classUtil.getGetMap().get(options[column]).invoke(obj, null).toString();
				cell.setCellValue(value);
			}
		}
		File file = new File(path);
		if(file.exists()) {
			file.delete();
		}
		OutputStream os = new FileOutputStream(file);
		System.out.println("write data to file: " + path);
		book.write(os);
		os.close();
	}

	private List<?> readXls(String path,String beanClassName) throws Exception {
		
		ClassUtil classUtil = new ClassUtil(beanClassName);
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);	
		List beanList = new ArrayList();		
		for (int sheetNo=0; sheetNo < hssfWorkbook.getNumberOfSheets(); sheetNo ++) {
			HSSFSheet sheet = hssfWorkbook.getSheetAt(sheetNo);		
			if(sheet == null ){
				continue;
			}			
			for (int rowNum=0; rowNum <= sheet.getLastRowNum(); rowNum ++){
				HSSFRow hssfRow = sheet.getRow(rowNum);
				if (hssfRow != null) {
					Object obj = classUtil.getBeanClass().newInstance();
					for(int colIndex=0; colIndex < classUtil.getFields().length; colIndex++) {
						String cellValue = getValue(hssfRow.getCell(colIndex));
						classUtil.getSetMap().get(classUtil.getFields()[colIndex]).invoke(obj, cellValue);
					}
					beanList.add(obj);
				}			
			}			
		}
		return beanList;
	}
	
	private List<?> readXlsx(String path, String beanClassName) throws Exception {
		
		ClassUtil classUtil = new ClassUtil(beanClassName);
		InputStream is = new FileInputStream(path);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);	
		List beanList = new ArrayList();		
		for (int sheetNo=0; sheetNo < xssfWorkbook.getNumberOfSheets(); sheetNo ++) {
			XSSFSheet sheet = xssfWorkbook.getSheetAt(sheetNo);		
			if(sheet == null ){
				continue;
			}			
			for (int rowNum=0; rowNum <= sheet.getLastRowNum(); rowNum ++){
				XSSFRow hssfRow = sheet.getRow(rowNum);
				if (hssfRow != null) {
					Object obj = classUtil.getBeanClass().newInstance();
					for(int colIndex=0; colIndex < classUtil.getFields().length; colIndex++) {
						String cellValue = getValue(hssfRow.getCell(colIndex));
						classUtil.getSetMap().get(classUtil.getFields()[colIndex]).invoke(obj, cellValue);
					}
					beanList.add(obj);
				}			
			}			
		}
		return beanList;	
	}
	
	
	
	
	
	
	@SuppressWarnings("static-access")
	private String getValue(XSSFCell xssfRow) {
		if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
			return String.valueOf(xssfRow.getBooleanCellValue());
		} else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
			return String.valueOf(xssfRow.getNumericCellValue());
		} else {
			return String.valueOf(xssfRow.getStringCellValue());
		}
	}

	@SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
		if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
			return String.valueOf(hssfCell.getBooleanCellValue());
		} else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
			return String.valueOf(hssfCell.getNumericCellValue());
		} else {
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
	
}
