package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Bean;
import com.cg.service.ServiceImpl;

/**
 * Servlet implementation class trainingDetailsServlet
 */
@WebServlet("/trainingDetailsServlet")
public class trainingDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public trainingDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		ServiceImpl service=new ServiceImpl();
		ArrayList<Bean> details= service.getAll();
		response.setContentType("text/html");
		out.println("<tr>");
		out.println("<td>TrainingId</td>");
		out.println("<td>TrainingName</td>");
		out.println("<td>TrainingAvailability</td>");
		out.println("<td></td>");
		out.println("</tr><br/>");
		for(Bean data: details) {
			out.println("<tr>");
			out.println("<td>"+data.getTrainingId()+"</td>");
			out.println("<td>"+data.getTrainingName()+"</td>");
			out.println("<td>"+data.getAvailable()+"</td>");
			out.println("<td><a href=\"enrollServlet?id="+data.getTrainingId()+"&&seats="+data.getAvailable()+"\">Enroll</a></td>");
			out.println("</tr><br/>");
		}
		out.flush();
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
