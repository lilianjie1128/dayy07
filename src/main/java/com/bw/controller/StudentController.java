package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.Classes;
import com.bw.bean.Student;
import com.bw.service.StudentService;
import com.bw.utils.FileUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
	@Resource
	private StudentService sservice;
	//查询分页模糊
	@RequestMapping("list")
	public String selectAll(Model model,@RequestParam(defaultValue="1")Integer pageNum,String sname){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("sname", sname);
		PageHelper.startPage(pageNum, 3);
		List<Student> list = sservice.selectAll(map);
		PageInfo<Student> page = new PageInfo<Student>(list);
		model.addAttribute("page", page);
		return "list";
		
	}
	//添加
	@RequestMapping("add")
	public String insert(Student student,MultipartFile file){
		try {
			String upload = FileUtils.upload(file);
			student.setPicurl(upload);
			
			sservice.insertStudent(student);
			return "redirect:list";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "add";
		
		}
		
	}
	//添加图片
	@RequestMapping("lookImg")
	public void lookImg(String path,
		HttpServletRequest request,
		HttpServletResponse response){
		
		FileUtils.lookImg(path, request, response);
	}
	//删除
	@RequestMapping("del")
	public String delete(Integer sid){
		sservice.deleteStudent(sid);
		
		return "redirect:list";
		
	}
	//下拉框的回显
	@RequestMapping("selectClass")
	@ResponseBody
	public List<Classes> find(){
		List<Classes> list = sservice.selectClass();
		return list;
		
	}
		//修改的回显
		@RequestMapping("findById")
		public String update(Integer sid,Model model){
			Student student = sservice.findById(sid);
			model.addAttribute("student", student);
			return "update";
			
		}
		//修改
		@RequestMapping("update")
		public String update(Student student,MultipartFile file){
			try {
				String upload = FileUtils.upload(file);
				student.setPicurl(upload);
				
				sservice.updateStudent(student);
				return "redirect:list";
				
			} catch (Exception e) {
				// TODO: handle exception
				return "update";
			
			}
			
		}
	
}
