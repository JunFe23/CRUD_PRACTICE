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
	  $("button").click(function(){
		  if($(this).text()=='ELIST'){
			  document.location.href='/web/elist.do';
		  }
		  if($(this).text()=='DLIST'){
			  document.location.href='/web/dlist.do';
		  }
		  if($(this).text()=='SLIST'){
			  document.location.href='slist.do';
		  }
		  if(this.innerHTML=='ALIST'){
			  document.location.href='/web/alist.do?job='+$(this).attr("lang");
		  }
	  });
});
</script>
</head>
<body>
   <button>ELIST</button>
   <button>DLIST</button>
   <button>SLIST</button>
   <button lang="a1">ALIST</button>
   <button lang="a2">ALIST</button>
   <button lang="a3">ALIST</button>
</body>
</html>





