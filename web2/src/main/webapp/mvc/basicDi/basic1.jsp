<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="/web/loccation.do">Location1</a>
<a href="message.do">Message1</a>
<a href="/web/msgAction.do">Message2</a>
<a href="/web/msgdirect.do">Message3</a>
<a href="/web/method.do?job=info&no=5">Message4</a>
<a href="/web/method.do?job=moidfy">Message5</a>
<a href="/web/methodMsg.do?job=info&No=90">Message6</a>

<form action="/web/methodMsg.do" method="POST">
    <input name="job" type="text">
    <input name="No" type="text">
    <input type="submit" value="Send">    
</form>
</body>
</html>