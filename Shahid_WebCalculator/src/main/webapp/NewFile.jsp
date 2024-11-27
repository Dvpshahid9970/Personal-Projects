<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp File</title>
<style type="text/css">


h1,h3{
 font-size:70px;
color: white;
margin:20px;
position : absolute;
 top : 300px;
 left : 520px;
}

h2{
 font-size:40px;
color: white;
margin:20px;
position : absolute;
 top : 460px;
 left : 480px;
}

input, button {
  font-size:35px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 1px solid white;
}

button{

     margin-top : 265px;
  left : 380px;
   

}
body{
text-align : center;
background : linear-gradient(to right,#3f5efb,#fc466b);

</style>

</head>
<body>
<div>
<img alt="" src="./images/2unv.gif" style="display : block;
margin-left : auto;
margin-right : auto;
width: 25%;
height:25%;
margin-top: 0px;">

</div>

<div>
<img alt="" src="./images/2r67.gif" style="width: 18%;
height:40%;
position : absolute;
 top : 50px;
 left : 15px;">

</div>
<div>
<img alt="" src="./images/2r67.gif" style="width: 18%;
height:40%;
position : absolute;
 top : 50px;
 left : 1080px;">

</div>
<h2>Thanks for Using App</h2>

<form action="MyServlet">

</form>

<h1>Ans = <%=request.getParameter("ans") %></h1>

<a href = "index.html">
<button>Home</button>
</a>

<a href = "about.html">
<button style="
position : absolute;
     margin-left : 40px;
     margin-top : 275px;
  left : 20px;">About!</button>
</a>
</body>
</html>