package com.cg.service;
import com.cg.bean.Bean;
import java.util.ArrayList;

public interface Service {
	public ArrayList <Bean> getAll();

	public void enroll(int trainingId, int available);
}
