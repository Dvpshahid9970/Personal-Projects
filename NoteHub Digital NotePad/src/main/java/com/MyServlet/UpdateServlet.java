package com.MyServlet;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Helper.FactoryProvider;
import com.Notes.Note;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
	    	
	    	String title = request.getParameter("title");
	    	String content = request.getParameter("content");
	    	
	    	int noteId = Integer.parseInt(request.getParameter("noteId"));
	    	
	    	Session s = FactoryProvider.getfactory().openSession();
	    	Transaction txn = s.beginTransaction();
	    	
	    	Note note = s.get(Note.class, noteId);
	    	
	    	note.setTitle(title);
	    	note.setContent(content);
	    	note.setDate(new Date());
	    	
	    	
	    	txn.commit();
	    	s.close();
	    	
	    	response.sendRedirect("All_Note.jsp");
	    }catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
	}

}
