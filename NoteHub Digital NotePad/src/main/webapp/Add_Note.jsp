<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Note</title>
<%@include file="All_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Fill the Notes</h1>


		<form action="NoteServlet" method="post">

			<div class="form-group ">
				<label for="title">Note Title</label> <input name="title"
					type="text" class="form-control" id="title" required
					aria-describedby="emailHelp" placeholder="Enter Title" style=" background:#bbfff9"/>
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea name="content" id="content" required
					placeholder="Enter Content Here..." class="form-control"
					style="height: 280px;
				    background : #bbfff9"></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>

	</div>

</body>
</html>