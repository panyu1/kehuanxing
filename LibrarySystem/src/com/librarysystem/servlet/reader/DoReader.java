package com.librarysystem.servlet.reader;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.dao.ManagerDao;
import com.librarysystem.entity.Manager;
import com.librarysystem.entity.Reader;
import com.librarysystem.service.ReaderService;

/**
 * Servlet implementation class DoReader
 */
@WebServlet("/dr")
public class DoReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
	    Reader r=new Reader();
	    ReaderService rs=new ReaderService();
	    List<Reader> list=rs.findAllReader(name);
	    request.setAttribute("list", list);
//	    System.out.println("6666");
		request.getRequestDispatcher("/WEB-INF/jsp/readerxx.jsp").forward(request, response);
	
	
	}

}
