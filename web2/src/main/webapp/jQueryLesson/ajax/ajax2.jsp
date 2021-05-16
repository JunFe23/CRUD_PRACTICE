<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
function ajaxAction(url,type,dataType,state){
	$.ajax({
		url:url,
		type:type,
		dataType:dataType,
		data:{state:state},
		success:function(v){
			console.log(v);
		},error:function(){
			alert('error');
		}
	});
}
$(function(){
	$("button#dept").click(function(){
		ajaxAction('/web/deptList.do','GET','text',$(this).attr("lang"));
	});	
});
</script>
</head>
<body>
<button id="dept" lang="big">DEPT 20이상</button>
<button id="dept" lang="small">DEPT 20이하</button>
</body>
</html>










