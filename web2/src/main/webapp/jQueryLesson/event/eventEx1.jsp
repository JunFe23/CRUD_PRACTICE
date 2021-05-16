<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<style type="text/css">
   .question{
     background:pink;
     color: white;
     font-weight: bold;
   }
</style>
<script type="text/javascript">
$(function(){
	$(".answer").hide();
	$(".question").each(function(index){
		$(this).click(function(){
			$(".answer").eq(index).show(1000);
		});
		 $(this).dblclick(function(){
			$(".answer").eq(index).hide(1000);			
		}); 		
	});	
});
</script>
</head>
<body>
   <table align="center" cellpadding="30" cellspacing="0" border="1" width="70%">
     <tr align="center">
       <td colspan="2">Show Data Hide</td>
     </tr>
     <tr class="question">
       <td>좋아하는 색?</td>
     </tr>
     <tr class="answer">
       <td>BLUE</td>
     </tr>
     
     <tr class="question">
       <td>좋아하는 자동차?</td>
     </tr>
     <tr class="answer">
       <td>BMW</td>
     </tr>
     
     <tr class="question">
       <td>좋아하는 취미</td>
     </tr>
     <tr class="answer">
       <td>여행</td>
     </tr>
     
     <tr class="question">
       <td>좋아하는 음식</td>
     </tr>
     <tr class="answer">
       <td>김치</td>
     </tr>
   </table>  
   
</body>
</html>












