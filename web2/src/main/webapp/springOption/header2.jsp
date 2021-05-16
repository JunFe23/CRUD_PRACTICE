<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Table</h2>
  <p>The .active class applies the hover color to a particular row or cell:</p>                                        
  <table class="table">    
    <tbody>
       <tr class="active">
        <td>key</td>
        <td>ValueData</td>
      </tr>
        <c:forEach var="i" items="${injectMap}" >
      <tr>
        <td>${i.key}</td>
        <td>${i.value}</td>
      </tr>      
       </c:forEach>
    </tbody>  
  </table>
</div>

</body>
</html>
















