package com.bw.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bw.bean.Student;
import com.bw.service.IStudentService;

@Controller
@RequestMapping("stu")
public class StuControl {

	@Autowired
	private IStudentService studentServiceImpl;
	
	@RequestMapping(value="index.html")
	public ModelAndView getList(){
		List<Student> list=studentServiceImpl.getList();
		Map map=new HashMap();
		map.put("list", list);
		return new ModelAndView("/list",map);
	}
	
	
}
