package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Bean;

public interface Dao {
	public ArrayList<Bean> getAll();

	public void enroll(int trainingId, int available);

}
