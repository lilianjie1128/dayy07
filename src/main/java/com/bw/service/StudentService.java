package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Classes;
import com.bw.bean.Student;

public interface StudentService {
	//查询所有
	public List<Student> selectAll(Map<String,Object> map);
	//查询下拉框
	public List<Classes> selectClass();
	//添加
	public void insertStudent(Student student);
	//删除
	public void deleteStudent(Integer sid);
	//修改的回显
	public Student findById(Integer sid);
	//修改
	public void updateStudent(Student student);
	
}
