<%@page import="com.Dao.*" %>
<%@ page import="com.DB.*" %>
<%@ page import="com.Entity.*" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer list </title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style type="text/css">
*{
   margin:0px;
   padding: 0px;
}
 .main-container{
   display: flex;
   width: 100%;
   height: 50px;
   align-items: center;
 }
 .main-container>.btn{
    padding: 8px;
    background: blue;
    color: white;
    margin-left: 30px;
    text-decoration: none;
    
 }
 h1{
    width: 100%;
    background: black;
    height: 2px;
 }
 table{
   height: auto;
   width: 100%;
   
 }
 table tr {
   
    box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
    height: 30px;
 }
 table tr th{
  text-align: center;
  background: blue;
  color:white;
 }
 table tr td{
 text-align: center;
 background: blue;
 color:white;
 }
 table tr td .btn1 i{
   color: red;
 }
 table tr td .btn2 i{
   color: white;
   margin-left: 20px;
 }
</style>
</head>
<body>
<div class="main-container">
<a href="addcustomer.jsp" class="btn">Add Customer</a>
<h2 style="margin-left: 500px;">Customer List</h2>
</div>
<h1></h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Address</th>
<th>City</th>
<th>State</th>
<th>Email</th>
<th>Phone</th>
<th>Action</th>
</tr>


<%AddDetails ad=new AddDetails(dbConnect.getcon());
  List<sunEntity>list=ad.getDetails();
  for(sunEntity s:list){%>
  <tr>
  <td><%=s.getFname() %></td>
  <td><%=s.getLname() %></td>
  <td><%=s.getAdd() %></td>
  <td><%=s.getCity() %></td>
  <td><%=s.getState() %></td>
  <td><%=s.getEmail() %></td>
  <td><%=s.getPhone() %></td>
  

<td>
 <a href="./delete?id=<%=s.getId() %>" class="btn1"><i class="fa-solid fa-square-minus"></i></a>
 <a href="edit.jsp?id=<%=s.getId() %>" class="btn2"><i class="fa-solid fa-pen"></i></a>
</td>
</tr>  
  <%}
%>



</table>
</body>
</html>