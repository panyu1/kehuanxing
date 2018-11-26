package com.librarysystem.servlet.books;

import java.awt.print.Book;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.dao.BookDao;
import com.librarysystem.entity.Books;
import com.librarysystem.entity.BorrowBook;
import com.librarysystem.service.BbService;

/**
 * Servlet implementation class DoSetBook
 */
@WebServlet("/doset")
public class DoSetBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoSetBook() {
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
	    int bid=Integer.parseInt(request.getParameter("bid"));
	    String borrowtime=request.getParameter("borrowtime");
	    int borrowdaynum=Integer.parseInt(request.getParameter("borrowdaynum"));
	   
	    BbService b=new BbService();
	    BorrowBook bb=new BorrowBook();
	    bb.setBid(bid);
	    bb.setBorrowtime(borrowtime);
	    bb.setBorrowdaynum(borrowdaynum);
	   
	    b.addBorrowBook(bb);
	    System.out.println("6666");
	    
	    BookDao bd=new BookDao();
	  
	    bd.updateStock(bid);
	  request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	
	
	
	
	
	}

}
