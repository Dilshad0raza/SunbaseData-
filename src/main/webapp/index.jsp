<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login Screen</title>
<style type="text/css">
.main-container{
   width:100%;
   height: 100vh; 
   display: flex;
   align-items: center;
   justify-content: center;
}
.main-container>.form{
  height: auto;
  width: auto;
  padding:30px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  box-shadow: 0 0 20px 0 rgba(0,0,0,0.3);
}
.main-container>.form>.inp{
  height: 30px;
  margin-top: 30px;
  width: 300px;
  box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
  border:none;
  outline:none;
  
}
.main-container>.form>.btn{
  height: 30px;
  margin-top: 30px;
  width: 300px;
  box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
  color: white;
  background: blue;
  border: none;
  
}
</style>
</head>
<body>
<div class="main-container">
  <form action="./login" method="post" class="form">
   <h3>Login page</h3>
   <input type="email" placeholder="Login id" name="log" class="inp">
   <input type="password" placeholder="Password" name="pass" class="inp">
   <button class="btn">Submit</button>
  
  </form>

</div>
</body>
</html>