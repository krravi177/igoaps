<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   SuccesssFul
   
   <table border="3" bgcolor="yellow">
   <tr><td>RID</td><td>St Code</td><td>Dist Code</td><td>Name</td><td>Phone</td><td>Block Code</td></tr>
   <tr>
   <td>${h.rid}</td>
    <td>${h.stCode}</td>
     <td>${h.distCode}</td>
      <td>${h.name}</td>
       <td>${h.phone}</td>
       <td>${h.blockCode}</td>
   
   </tr>
   
   </table>
</body>
</html>