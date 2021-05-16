<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
var ajaxFunctionProcess=function(data){
	/* alert(data.url+' '+data['dataType']+' '+data['id']); */
	/* private String connectUrl;
	private int maxConnect;
	private int minConnect;
	private String servletMessage; */	
	
	
	$.ajax({url:data.url,
		    dataType:data.dataType,
		    type:data.method,
		   // data:"job="+data.param.job+"&count="+data.param.count+"&since="+data.param.since,
		   data:data.param,
		   //data:{job:'aa',count:50}
		    success:function(v){
		    	console.log(v);
		    	/* if(data.id!='c3'){
		    	$("span#"+data.id).html(v);
		    	}
		    	else{
		    	//console.log(v.connectUrl+' '+v.maxConnect+' '+v.minConnect+' '+v.servletMessage);
		    	console.log(v);
		    	} */
		    }
		    });
	
	
}
$(function(){
	$("input[type='button']").click(function(){
		switch ($(this).attr("id")) {
		case "c1":	
			ajaxFunctionProcess({url:'/web/restData1.do',dataType:'text',id:this.id});
			break;
		case "c2":
			ajaxFunctionProcess({url:'/web/restData2.do',dataType:'text',id:this.id});
			break;
		case "c3":
			ajaxFunctionProcess({url:'/web/restData3.do',dataType:'json',id:this.id});
			break;
		case "c4":
			ajaxFunctionProcess({url:'/web/restData4.do',dataType:'json',id:this.id});
			break;
		case "c5":
			ajaxFunctionProcess({url:'/web/restData5.do',dataType:'text',id:this.id});
			break;
		case "c6":
			ajaxFunctionProcess({url:'/web/restData6.do',dataType:'script',
				id:this.id,method:'POST',param:{job:'factory',count:50,since:1970}});
			break;
		case "c7":
			ajaxFunctionProcess({url:'/web/restData6.do',dataType:'script',
				id:this.id,method:'POST',param:{job:'action',count:500,since:1980}});
			break;
		default:
			break;
		}
		//$("span#"+this.id).html("HelloSpring"+this.id);
	});	
});
</script>
</head>
<body>
  <input type="button" value="Click1" id="c1">
  <input type="button" value="Click2" id="c2">
  <input type="button" value="Click3" id="c3">
  <input type="button" value="Click4" id="c4">
  <input type="button" value="Click5" id="c5">
  <input type="button" value="Click6" id="c6">
  <input type="button" value="Click7" id="c7">
  <br>
  <span id="c1"></span>
  <span id="c2"></span>
  <span id="c3"></span>
  <span id="c4"></span>
  <span id="c5"></span>
</body>
</html>


