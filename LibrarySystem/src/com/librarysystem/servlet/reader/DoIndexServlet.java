package com.librarysystem.servlet.reader;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.dao.BookDao;
import com.librarysystem.entity.Books;
import com.librarysystem.service.BookService;

/**
 * Servlet implementation class DoIndexServlet
 */
@WebServlet("/doindex")
public class DoIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoIndexServlet() {
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
	    String bookname=request.getParameter("bookname");
	    String author=request.getParameter("author");
	    Books b=new Books();
	    BookService bd=new BookService();
	    
	    b.setBookname(bookname);
	    b.setAuthor(author);
	    
	    bd.addStock(b);
//	    System.out.println("666");
	    request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	
	
	
	
	
	}

}
