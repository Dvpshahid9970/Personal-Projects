<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page</title>
<link rel = "stylesheet" href = "style.css">
</head>
<body>

    <div class="container">
        <h1>Register</h1>
        <form action="RegisterServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" required><br>   
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Register</button>
        </form>
    
        <p><a href="index.jsp">Back to Home</a></p>
    
        <%-- Display error message if registration fails --%>
        <% String error = request.getParameter("error");
           if (error != null && error.equals("1")) { %>
            <p style="color: red;">invalidEmail.</p>
        <% } else if(error != null && error.equals("2")){ %>
            <p style="color: red;">invalidUsername.</p>
        <%  } else if(error != null && error.equals("3")){ %>
            <p style="color: red;">invalidPassword.</p>
            <p style="color: red;">password must be greater than 6 digits.</p>
          <%  }else if(error != null && error.equals("4")){   %>
        	  <p style="color: red;">invalidPassword.</p>
        <%  }
           
          %>
      </div>
      
</body>
</html>