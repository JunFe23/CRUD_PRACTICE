<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
  $(function(){
	  /* $("th").mouseover(function(){
		  $(this).css({color:'white',background:'black'});
		  $("th").click(function(){
			  $(this).css({color:'red',background:'pink',width:'50%'});
			  $("th").dblclick(function(){
				  $(this).css({color:'blue',background:'black',width:'20%'});
			  });
		  });
	  });
	  
	  $("th").mouseout(function(){
		  $(this).css({color:'black',background:'white'});
	  }); */
	  
	  $(document).keypress(function(e){
		  
		/*  $("div").append("Press<font size=3 color=blue>["+e.keyCode+"]</font><br>"); 
		 $("div").append("Press<font size=3 color=red>["+String.fromCharCode(e.keyCode)+"]</font><br>"); */
		 if(e.keyCode==97){
		 $("img").animate({"marginLeft":"-=50px"},0);
		 }
		 
		 if(e.keyCode==98){
			 $("img").animate({"marginLeft":"+=50px"},0);			 
		 } 
		 if(e.keyCode==99){
			 $("img").animate({"marginTop":"+=50px"},0);			 
		 } 
		 if(e.keyCode==100){
			 $("img").animate({"marginTop":"-=50px"},0);			 
		 } 
		 
		 
		 
		 
	  });
	  //$(document).keydown(function(e){
			/*  $("div").append("KEYDOWN<font size=5 color=pink>["+e.keyCode+"]</font><br>"); 
			 $("div").append("KEYDOWN<font size=5 color=pink>["+String.fromCharCode(e.keyCode)+"]</font><br>");
	  }); */
	  
	  //$(document).keyup(function(e){
			// $("div").append("KEYUP<font size=5 color=YELLOW>["+e.keyCode+"]</font><br>"); 
			 //$("div").append("KEYUP<font size=5 color=YELLOW>["+String.fromCharCode(e.keyCode)+"]</font><br>");
	  //});
	  
	  
  });
</script>
</head>
<body>
  
  <div></div>
  
  <img alt="" src="/web/imgBook/01TCSC2005.jpg" width="100" height="100">
  <!-- <table cellpadding="10" cellspacing="0" border="1" width="70%" align="center">
    <thead>
        <tr>
          <th id="th1">LOGIN</th>
          <th id="th2">MESSAGE</th>
          <th id="th3">FREEBOARD</th>
          <th id="th4">MEMBER</th>
        </tr>
    </thead>
  </table> -->
</body>
</html>



