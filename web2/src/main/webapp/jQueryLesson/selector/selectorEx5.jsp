<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
  div{
     width: 100px;
     height: 100px;
     margin: 5px;
     border: 2px red solid;
     float:left; 
  }
  .select{
    background: green;
    border: 1px white solid;
  }
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	/* $("button").eq(0).click(function(){
		
	}); */
   /* $("button#b1").click(function(){
		
	});
 */
   function changeColorFun(){
	   //$("div").css("background-color","red");
	     $("div").each(function(i,dv){
	    	  $(dv).css("background-color",'red');
	    	  if($(this).is("#stop")){
	    		  $("span").text("StopSpan");
	    		  return false;
	    	  }
	    	 
	     });
   }
   function multiColorFun(){
	   var color=["blue","red","cyan","yellow","green","black","pink"];
	   //alert(Math.ceil(Math.random()*7));
	   $("div").each(function(index,dom){
		   $(this).css("background-color",color[Math.ceil(Math.random()*7)]);
	   });
   }
   function clearFun(){
	   $("div").css("background-color","white");
   }
 
   $("button").click(function(){
	    /* if($(this).attr("id")=='b1'){
	    	changeColorFun();
	    } */ 
	    switch ($(this).attr("id")) {
		case "b1":
			changeColorFun();
			break;
		case "b2":
			multiColorFun();
			break;
		case "b3":
			clearFun();
			break;

		default:
			break;
		}
	    
   });
   $("div").click(function(){
 	   $(this).addClass("select");
 	   //$(this).hide();
    });
   $("div").dblclick(function(){
 	   $(this).removeClass();
 	   //$(this).hide();
    });
});
</script>
</head>
<body>
<button id="b1">ChangeColor</button>
<button id="b2">MultiColor</button>
<button id="b3">Clear</button><br>
<div></div>
<div></div>
<div></div>
<div></div>
<div></div>
<div id="stop">StopHere</div>
<div></div>
<span></span>
</body>
</html>



