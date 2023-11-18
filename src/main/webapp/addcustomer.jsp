<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
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
   box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
}
.main-container>.form>.A{
   display: flex;
   justify-content: space-around;
}
.main-container>.form>.A>.inp{
  height: 30px;
  margin:30px;
  width: 300px;
  box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
  border:none;
  outline:none;
  
}
.main-container>.form>.B{
  height: 30px;
  width: 700px;
  display: flex;
  justify-content: flex-end;
  
  
}
.main-container>.form>.B>.btn{
  height: 30px;
  width: 150px;
  box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
  color: white;
  background: blue;
  border: none;
  
}
</style>
</head>
<body>
<div class="main-container">
  <form action="./add" method="post" class="form">
   <h3 style="text-align: center;">Customer Details</h3>
   <div class="A">
      <input type="text" placeholder="First Name" name="fn" class="inp" required>
      <input type="text" placeholder="Last Name" name="ln" class="inp" required>
   </div>
   <div class="A">
      <input type="text" placeholder="Street" name="st" class="inp" required>
      <input type="text" placeholder="Address" name="ad" class="inp" required>
   </div>
   <div class="A">
      <input type="text" placeholder="City" name="ci" class="inp" required>
      <input type="text" placeholder="State" name="sta" class="inp" required>
   </div>
   <div class="A">
      <input type="email" placeholder="Email" name="em" class="inp" required>
      <input type="number" placeholder="Phone" name="ph" class="inp" required>
   </div>
   
  <div class="B">
    <button class="btn">Submit</button>
  </div>
  
  </form>

</div>
</body>
</html>