<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
  $(function(){
	 /*  $("button#c1,button#c2").click(function(){
		  //document.location.href='/web/nullEx.do?job='+this.lang;
		  alert(this.lang);
	  }); */	  
	  $("button[class='a']").click(function(){
		  if($(this).attr("id")=='c1'||$(this).attr("id")=='c2')
		        document.location.href='/web/nullEx.do?job='+this.lang;
		  if($(this).attr("id")=='c3'||$(this).attr("id")=='c4')
				document.location.href='/web/numberformat.do?job='+this.lang;
		  if($(this).attr("id")=='c5'||$(this).attr("id")=='c6')
				document.location.href='/web/classCast.do?job='+this.lang;
		  if($(this).attr("id")=='c7'||$(this).attr("id")=='c8')
				document.location.href='/web/userEx.do?job='+this.lang;
	  });
  });
</script>
</head>
<body>
   <button id="c1" lang="error" class="a">NullEx1</button>
   <button id="c2" lang="success" class="a">NullEx2</button>
   <button id="c3" lang="error" class="a">NumberFormat1</button>
   <button id="c4" lang="success" class="a">NumberFormat2</button>
   <button id="c5" lang="error" class="a">ClassCast1</button>
   <button id="c6" lang="success" class="a">ClassCast2</button>
   
   <button id="c7" lang="error" class="a">UserEx1</button>
   <button id="c8" lang="success" class="a">UserEx2</button>

</body>
</html>






