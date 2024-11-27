<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.Helper.FactoryProvider"%>
<%@page import="org.hibernate.*"%>
<%@page import="com.Notes.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All notes</title>
<%@include file="All_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class="text-uppercase">All Notes</h1>

		<div class="row">
			<div class="col-12">
		<%
					Session s = FactoryProvider.getfactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				for (Note note : list) {
				%>

				<div class="card mt-3" style="background-color: #bbfff9" >
					<img class="card-img-top m-4 " style="max-width:40px;" src="images/notepad.png" alt="Card image cap">
					<div class="card-body px-5">
						<h5 class="card-title"><%= note.getTitle() %></h5>
						<p class="card-text">
						<%= note.getContent() %>
						</p>
						<p ><b class="text-primary"><%= note.getDate()  %></b></p>
						<div class="container text-right mt-2">
						<a href="Edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">edit</a>
						<a href="DeleteServer?note_id=<%= note.getId() %>" class="btn btn-danger">Delete</a>
						</div>
					</div>
				</div>


				<%
					}

				s.close();
				%>

			</div>
		</div>
	</div>
</body>
</html>
