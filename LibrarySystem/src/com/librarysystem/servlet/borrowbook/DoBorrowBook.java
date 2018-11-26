package com.librarysystem.servlet.borrowbook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarysystem.dao.BookDao;
import com.librarysystem.entity.Books;

/**
 * Servlet implementation class DoBorrowBook
 */
@WebServlet("/dbb")
public class DoBorrowBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoBorrowBook() {
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
		String bookname=request.getParameter("bookname");
//		String author=request.getParameter("author");
		BookDao bd=new BookDao();
		Books b=new Books();
		List<Books> list=bd.findBook(bookname);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/jsp/borrowbook.jsp").forward(request, response);
		
	}

}
