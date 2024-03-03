<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	
	$("#st").change(function(){
		 alert("ok");
		$.ajax({
		    url : "dist?stCode="+$("#st").val(),
		    type: "GET",
		    success: function(data)
		    {
		        console.log(data);
		        $("#dCode").empty();
		        
		        for(var i=0; i<data.length; i++ ){
		        	$("#dCode").append("<option value="+data[i].distCode+">"+data[i].distName+"</option>");
		        }
		    },
		    error: function (errorThrown)
		    {
		    	console.log(errorThrown);
		 
		    }
		   });
		 
	});
	
});



$(document).ready(function(){
	
	
	$("#dCode").change(function(){
		 alert("ok");
		$.ajax({
		    url : "block?distCode="+$("#dCode").val(),
		    type: "GET",
		    success: function(data)
		    {
		        console.log(data);
		        $("#bCode").empty();
		        
		        for(var i=0; i<data.length; i++ ){
		        	$("#bCode").append("<option value="+data[i].blockCode+">"+data[i].blockName+"</option>");
		        }
		    },
		    error: function (errorThrown)
		    {
		    	console.log(errorThrown);
		 
		    }
		   });
		 
	});
	
});





</script>

</head>
<body>
<f:form action="RegSave" modelAttribute="k" method="get">
<table border="4" bgcolor="cyan">

<tr><td>State Name</td>

<td>


<f:select path="stCode" id="st">
<f:option value="0">--Select--</f:option>
<f:options items="${modiList}" itemValue="stCode" itemLabel="stName"></f:options>
</f:select></td>

<td>Dist Name</td><td>

<f:select path="distCode" id="dCode">
</f:select>
</td>

<td>Block Name</td><td>

<f:select path="blockCode" id="bCode">
</f:select>
</td>


</tr>



<tr><td>Name</td><td><f:input path="name"/></td>
<td>Phone</td><td><f:input path="phone"/></td></tr>
<tr><td><input type="submit"></td></tr>




</table>


</f:form>


</body>
</html>