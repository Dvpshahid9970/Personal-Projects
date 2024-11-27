package com.MyServlet;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Helper.FactoryProvider;
import com.Users.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	    
			  String username = request.getParameter("username");
		      String password = request.getParameter("password"); 
		      
		            
                    Session session = FactoryProvider.getfactory().openSession();

            try {
                         session.beginTransaction();
 

                  Query<User> query = session.createQuery("from User where username = :username and password = :password", User.class);
                  query.setParameter("username", username);
                  query.setParameter("password", password);
 

                  User user = query.uniqueResult();
 
                  if (user != null) {
    
                      response.sendRedirect("Noteindex.jsp");
                  } else {
                      
                      response.sendRedirect("login.jsp?error=1");
                  }
 

                  session.getTransaction().commit();
                 } catch (Exception e) {
                  e.printStackTrace();
                 } finally {
                  session.close();
                 }
                 }
                 }         
			  
		

