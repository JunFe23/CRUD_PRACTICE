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
	$("button").eq(0).click(function(){
		$($("img")[0]).attr("src",$($("img")[1]).attr("src"));
		
	});
	$("button").eq(1).click(function(){
		$($("img")[1]).attr("src",$($("img")[2]).attr("src"));
		
	});
	$("button").eq(2).click(function(){
		$($("img")[2]).attr("src",$($("img")[0]).attr("src"));
		
	});
	
	$("button#c4").click(function(){
		$("img").attr("src",function(){
			return "/web/imgBook/21LSMT2015.jpg";
		});
	});
	
	$("button#c5").click(function(){
		 $("div").attr("id",function(index){
			 alert("index="+index);
			return "div-id-"+index;	 
		 }).each(function(j,node){
			 alert("j="+j);
			 $("span",this).html("(ID=<B>"+this.id+"</B>)");
		 });
	});	
});
</script>
</head>
<body>
<button>CLICK1</button>
<button>CLICK2</button>
<button>CLICK3</button>
<button id="c4">CLICK4</button>
<button id="c5">CLICK5</button>

<br>
<img alt="" src="/web/imgBook/01TCSC2005.jpg" width="100" height="100">
<img alt="" src="/web/imgBook/03HYSC2004.jpg" width="100" height="100">
<img alt="" src="/web/imgBook/04SAED1907.jpg" width="100" height="100">
<div id="d1">ZERO-TH<span></span></div>
<div id="d2">FIRST-TH<span></span></div>
<div id="d3">SECOND-TH<span></span></div>
</body>
</html>


