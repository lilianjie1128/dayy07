package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Classes;
import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;
@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentMapper smapper;
	public List<Student> selectAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return smapper.selectAll(map);
	}

	public List<Classes> selectClass() {
		// TODO Auto-generated method stub
		return smapper.selectClass();
	}

	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		smapper.insertStudent(student);
	}

	public void deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		smapper.deleteStudent(sid);
	}

	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		return smapper.findById(sid);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		smapper.updateStudent(student);
	}

}
