package com.librarysystem.servlet.reader;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class DoReaderServlet
 */
@WebServlet("/dologin")
public class DoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account =request.getParameter("account");
		String password = request.getParameter("password");
		String msg ="";
		
		Reader r = new Reader();
		r.setAccount(account);
		r.setPassword(password);
		
		ReaderService rs = new ReaderService();
		ManagerService ms=new ManagerService();
		Manager m=new Manager();
		m.setAccount(account);
		m.setPassword(password);
		if (rs.isExist(r)) {
			List<Reader> rlist = rs.findReader();
			request.setAttribute("rlist", rlist);
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		} else if(ms.isExist(m)){
		  List<Manager> mlist=ms.findManager();
		  request.setAttribute("mlist", mlist);	
			request.getRequestDispatcher("/WEB-INF/jsp/indexmanager.jsp").forward(request, response);
		}else{
			System.out.println("账号或密码错误");
			request.getRequestDispatcher("/toindex").forward(request, response);
		}
	}

}
