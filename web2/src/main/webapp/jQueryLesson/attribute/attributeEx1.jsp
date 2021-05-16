<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	jQuery("input[type='button']").click(function(){
		switch (this.id) {
		case "b1":
			$("img").attr({
				src:'/web/imgBook/01TCSC2005.jpg',
				title:'book',
				width:100,
				height:100
			});
			break;
		case "b2":
			$("img").attr("src",function(index){
				if(index%2==0)
				return "/web/imgBook/01TCSC2005.jpg";
				else
				return "/web/imgBook/23OBOO2009.jpg";	
			});

		default:
			break;
		}//switch
		$("img").click(function(){
			$(this).attr({src:'/web/imgBook/28CNGS2019.jpg',width:300,height:300});
		});
		
	});
});
</script>
</head>
<body>
    <input type="button" value="Click1" id="b1">
    <input type="button" value="Click2" id="b2">
    <input type="button" value="Click3" id="b3"><br>
    
    <img  id="b1">
    <img  id="b2">
    <img  id="b3">
    <img  id="b4">  

