package com.librarysystem.servlet.manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.entity.Manager;
import com.librarysystem.entity.Reader;
import com.librarysystem.service.ManagerService;
import com.librarysystem.service.ReaderService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doregister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
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
		
	
		request.setCharacterEncoding("utf-8");
	    String error="";
	    String name=request.getParameter("name");
	    //System.out.println(name);
	    String wordcardnum=request.getParameter("wordcardnum");
	    //System.out.println(wordcardnum);
	    String account=request.getParameter("account");
	    //System.out.println(account);
	    String password=request.getParameter("password");
	    System.out.println(password);
	    String password2=request.getParameter("password2");
	    System.out.println(password2);
	    
	    ManagerService ms=new ManagerService();
	    Manager m=new Manager();
	    m.setName(name);
	   // System.out.println(m.getName());
	    m.setWordcardnum(wordcardnum);
	    //System.out.println(m.getWordcardnum());
	    m.setAccount(account);
	    //System.out.println(m.getAccount());
	    m.setPassword(password);
	    //System.out.println(m.getPassword());
	    boolean b= ms.isExist(m);
	    if(b){
//	    	System.out.println("用户名已存在1");
	    	//error="用户名已存在";
	    	//request.setAttribute("error", error);
	    	request.getRequestDispatcher("toregister").forward(request, response);
	    }else if(!password.equals(password2)){
//	    	System.out.println("用户名已存在2");
	    	//error="密码输入不一致";
	    	//request.setAttribute("error",error);
	    	request.getRequestDispatcher("toregister").forward(request, response);
	    }else{
//	    	System.out.println("用户名已存在3");
	    	int i=ms.addManager(m);
	    	request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		}
	}

}
