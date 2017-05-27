package com.io.excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelClient {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ExcelOperator excelOperator = new ExcelOperatorImpl();
		System.out.println("================Read Student Info XLS===============");
		String read_excel2003_2007_path = "lib/student_info.xls";
		// read the 2003-2007 excel
		List<?> list = excelOperator.readExcel(read_excel2003_2007_path,"com.io.excel.StudentBean");
		if (list != null) {
			for (Object st : list) {
				StudentBean student = (StudentBean)st;
				System.out.println(student.getNumber() + ",\t" + student.getName() + ",\t" + student.getGender());
			}
		}
		
		System.out.println("================Write Student Info XLS===============");
		String write_student2003_path = "lib/student_info_2003.xls";
		List<StudentBean> studentList = new ArrayList<StudentBean>();
		studentList.add(new StudentBean("201501", "LiuHuancai", "male"));
		studentList.add(new StudentBean("201502", "LinSiwei", "female"));
		excelOperator.writeExcel(studentList, write_student2003_path, "com.io.excel.StudentBean");
		
		System.out.println("================Read Teacher Info XLS===============");
		String read_teacher_xls = "lib/teacher_info.xls";
		// read the 2003-2007 excel
		List<?> tlist = excelOperator.readExcel(read_teacher_xls,"com.io.excel.TeacherBean");
		if (tlist != null) {
			for (Object te : tlist) {
				TeacherBean teacher = (TeacherBean)te;
				System.out.println( teacher.getNumber() + ",\t" + teacher.getName() + ",\t" + teacher.getGender()+",\t"+teacher.getCourse());
			}
		}
		
		System.out.println("================Write Teacher Info XLS===============");
		String write_teacher2003_path = "lib/teacher_info_2003.xls";
		List<TeacherBean> teacherList = new ArrayList<TeacherBean>();
		teacherList.add(new TeacherBean("201620","Anthony","male","English"));
		teacherList.add(new TeacherBean("201621","Brittony","female","English"));
		excelOperator.writeExcel(teacherList, write_teacher2003_path, "com.io.excel.TeacherBean");
		
		
		System.out.println("================Read Student Info XLSX===============");
		String read_excel2010_path = "lib/student_info.xlsx";
		List<?> xlist = excelOperator.readExcel(read_excel2010_path,"com.io.excel.StudentBean");
		if (xlist != null) {
			for (Object st : xlist) {
				StudentBean stu= (StudentBean)st;
				System.out.println(stu.getNumber() + ",\t" + stu.getName() + ",\t" + stu.getGender());
			}
		}
		
		System.out.println("================Write Student Info XLSX===============");
		String write_student2010_path = "lib/student_info_2010.xlsx";
		List<StudentBean> studentList10 = new ArrayList<StudentBean>();
		studentList10.add(new StudentBean("201501", "QinShihuang", "male"));
		studentList10.add(new StudentBean("201502", "WuZetian", "female"));
		excelOperator.writeExcel(studentList10, write_student2010_path, "com.io.excel.StudentBean");
		
		
		System.out.println("================Read Teacher Info XLSX===============");
		String read_teacher2010_xls = "lib/teacher_info.xlsx";
		List<?> txlist = excelOperator.readExcel(read_teacher2010_xls,"com.io.excel.TeacherBean");
		if (txlist != null) {
			for (Object te : txlist) {
				TeacherBean tea = (TeacherBean)te;
				System.out.println(tea.getNumber() + ",\t" + tea.getName() + ",\t" + tea.getGender()+",\t"+tea.getCourse());
			}
		}
		
		System.out.println("================Write Teacher Info XLSX===============");
		String write_teacher2010_path = "lib/teacher_info_2010.xlsx";
		List<TeacherBean> teacherList10 = new ArrayList<TeacherBean>();
		teacherList10.add(new TeacherBean("201620","XianYang","male","English"));
		teacherList10.add(new TeacherBean("201621","WenShu","female","Chinese"));
		excelOperator.writeExcel(teacherList, write_teacher2010_path, "com.io.excel.TeacherBean");
		
		
	}

}
