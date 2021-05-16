<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.open{
   font-family: "굴림";
   background: black;
   color: white;
   font-size: 25px;   
}
.over{
    font-family: "휴먼매직체";
    background: blue;
    color: red;
    font-size: 30px;    
}
.out{
    font-family: "휴먼매직체";
    background: red;
    color: blue;
    font-size: 25px;    
}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$("tr#htr").addClass("open");
	
	$("th").mouseover(function(){
		//$("tr#htr").removeClass();
		//alert('mouseover')
		$(this).addClass("over");
		$(this).mouseout(function(){
			//alert('mouseout');
			$(this).addClass("out");
		});
		$("tr").dblclick(function(){			
			//$("th").addClass("open");
			$("th").removeClass();
		});
		
	});
	
});
</script>
</head>
<body topmargin="50">
    <table cellpadding="0" cellspacing="0" width="80%" border="1" align="center">
      <thead>
        <tr id="htr">
          <th>LOGIN</th><th>QNA</th><th>CEMOMESSAGE</th><th>FREEBOARD</th>
        </tr>
      </thead>    
    </table>   
</body>
</html>