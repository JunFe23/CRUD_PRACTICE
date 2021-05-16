<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
  $(function(){
	$("h2").html("Select Event");
	//$("span").hide(1000).show(1000).slideUp(1000).slideDown(1000).fadeOut(1000).fadeIn(1000);
	
	/* $("button").mouseover(function(){
		$(this).hide(1000).show(3000);
	}); */
	
	/* $("button[class='btn']").click(function(){
		alert(this);
	}); */
	
	 /* $("button").eq(1).click(function(){
	      $(this).text($(this).text()+"선택");
	      
	      $("button").eq(2).click(function(){
		      $(this).text($(this).text()+"선택");
		     
	   });	     
    });
 */
 
	$("button").click(function(){
		   if($(this).text().indexOf("선택")<0)
	         $(this).text($(this).text()+"선택");	 
	     	   
		   
    });
     $("button").dblclick(function(){
    	 var index=$(this).text().indexOf("선택");
    	   if(index>0){
    		   $(this).text($(this).text().substring(0,index));
    	   }
     });
	
  });
</script>
</head>
<body>
  <div class="container">
  <h2>Button Styles</h2>
  <span>
  <button type="button" class="btn">Basic</button>
  <button type="button" class="btn btn-default">Default</button>
  <button type="button" class="btn btn-primary">Primary</button>
  <button type="button" class="btn btn-success">Success</button>
  <button type="button" class="btn btn-info">Info</button>
  <button type="button" class="btn btn-warning">Warning</button>
  <button type="button" class="btn btn-danger">Danger</button>
  <button type="button" class="btn btn-link">Link</button>
  </span>      
</div>
</body>
</html>
















