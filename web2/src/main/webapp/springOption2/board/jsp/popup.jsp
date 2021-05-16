<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$("button#close").click(function(){
		$("form[name='notice']").submit();
	});
		
});
</script>
</head>
<body>
	<form name="notice" method="post" action="/web/noticeCheck.do">
		<h1>공지사항</h1>
		오늘 하루 이 창을 열지 않음<input type="checkbox" id="pop" name="pop" /> 
		<button id="close" name="close">닫기</button>
	</form>
</body>
</html>