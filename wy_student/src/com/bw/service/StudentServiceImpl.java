package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Student;
import com.bw.dao.StudentDao;

@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return studentDao.getList();
	}
	
}
