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
	
	var fun=function(){
		$($("span")[0]).html("<font color='blue'>Span1</font>");		
	}
	/* $("input#b1").click(function(){
		//console.log(fun);
	}); */
	//$("span#b1").click(fun);
	$("img").click(function(){
	     /* this.width+=50;
	     this.height+=50; */
	     //$(this).attr({width:300,height:500});
	     //$(this).attr({width:$(this).attr("width")+50,height:$(this).attr("height")+50});
	     var w=$(this).attr("width");
	     var h=$(this).attr("height");
	     $(this).attr({width:(w-1),height:(h-1)});
	});
	function funId1(){
		//doucument.getElementsByTagName("span");
		//$("span").hide();
		$("span").each(function(index,dom){
			//alert(index+" "+dom.id);
			switch (index) {
			case 0:
				$(this).html("<font color='red'>"+$(this).html()+"</font>");
				break;
			case 1:
				$(dom).html("<font color='blue'>"+$(dom).html()+"</font>");
				break;
			case 2:
				$(dom).html("<font color='yellow'>"+$(dom).html()+"</font>");
				break;
			default:
				break;
			}
			
		});
	}
	function funId2(){
		alert('funID2');
	}
	function funId3(){
		alert('funID3');
	}	
	$("input[type='button']").click(function(){
		//$(this).val($(this).val().concat('Event'));
		//this.value=this.value.concat('Event');
		if($(this).attr("id")=='b1'){
			funId1();
		}
		else if($(this).attr("id")=='b2'){
			funId2();
		}
        if($(this).attr("id")=='b3'){
        	funId3();
		}
	});
});
</script>
</head>
<body>
   <img alt="" src="/web/img/1.jpg" width="100" height="100">
   <img alt="" src="/web/img/2.jpg" width="100" height="100">
   <br>
   <input type="button" value="Click1" id="b1">
   <input type="button" value="Click2" id="b2">
   <input type="button" value="Click3" id="b3">
   <div></div>
   <span id="s1">      
        <b>Java</b>
   </span>
   <span id="s2">      
        <b>Oracle</b>
   </span>
   <span id="s3">      
        <b>JSp</b>
   </span>
</body>
</html>




