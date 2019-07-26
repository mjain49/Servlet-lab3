package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Bean;
import com.cg.dao.DaoImpl;

public class ServiceImpl implements Service{

	DaoImpl dao=new DaoImpl();
	@Override
	public ArrayList<Bean> getAll() {
		return dao.getAll();
	}
	
	@Override
	public void enroll(int trainingId, int available) {
		// TODO Auto-generated method stub
		if(available>0)
			dao.enroll(trainingId, available-1);
	}
}
