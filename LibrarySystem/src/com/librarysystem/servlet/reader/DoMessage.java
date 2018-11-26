package com.librarysystem.servlet.reader;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.dao.ManagerDao;
import com.librarysystem.entity.Manager;

/**
 * Servlet implementation class DoMessage
 */
@WebServlet("/dm")
public class DoMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	   doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		sdoGet(request, response);
		request.setCharacterEncoding("utf-8");
	    String account=request.getParameter("account");
	    String password=request.getParameter("password");
	    String password1=request.getParameter("password1");
	    String name=request.getParameter("name");
	    ManagerDao md=new ManagerDao();
	    Manager m=new Manager();
	    
	    if(!password.equals(password1)){
	    	System.out.println("两场密码不一致");
	    	request.getRequestDispatcher("toms").forward(request, response);
	    }else{
	    	System.out.println("密码一致");
	    	m.setPassword(password);
	    	m.setAccount(account);
	    	m.setName(name);
	    	md.updatePassword(m);
	    	request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	    }
	}

}
