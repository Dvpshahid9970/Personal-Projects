package com.MyServlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Session;

import com.Helper.FactoryProvider;
import com.Users.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String Email_Regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

    
        if (!isValidEmail(email)) {
            response.sendRedirect("register.jsp?error=1");
            
            return; 
        }

        if (username == null || username.length() < 3) {
            response.sendRedirect("register.jsp?error=2");
            return;
        }

        if (password == null || password.length() < 6) {
            response.sendRedirect("register.jsp?error=3");
            return;
        }

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);

        Session session = FactoryProvider.getfactory().openSession();

        try {
            session.beginTransaction();

            session.save(newUser);

            session.getTransaction().commit();

            response.sendRedirect("login.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=4");
        } finally {
            session.close(); 
        }
    }

    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(Email_Regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
