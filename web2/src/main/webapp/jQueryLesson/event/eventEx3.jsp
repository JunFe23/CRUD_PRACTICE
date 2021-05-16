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
	  var cnt=0;
	  $("span#sp").text(cnt);
	  
	  $("textarea").keyup(function(){
		  //console.log();
		  cnt=$(this).val().length;
		 if(cnt>20){
			 /* alert('글자수 초과');
			 $(this).val(''); */
			 $("span#sp").html("<font color=red size=5>"+(20-$(this).val().length)+"</font>");
		 }else 
		  $("span#sp").html(cnt>20?"<fot color=red>"+cnt+"</font>":"<font color=blue>"+cnt+"</font>");
		  
	  });
  });
</script>
</head>
<body>
  <textarea rows="20" cols="50" id="tx" name="tx"></textarea>
  <span><span id="sp"></span>/20</span>

</body>
</html>


