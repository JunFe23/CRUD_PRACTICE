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
	
	  $("button#b1").click(function(){
		  $.ajax({
			  url:$(this).text(),
			  type:$(this).attr("lang"),
			  dataType:'json',
			  data:{job:$(this).attr("name"),no:$(this).attr("class")},
			  success:function(v){
				 $(v).each(function(index,dom){
					 console.log(this.name+' '+this.id+" "+this.email);
					 console.log(this['name']+' '+this['id']+" "+this['email']);
					 console.log(dom.name+' '+dom.id+" "+dom.email);
					 console.log(dom['name']+' '+dom['id']+" "+dom['email']);
				 });
			  },
			  error:function(){
				  alert('error');
			  }			  
		  });
		  
		  
	  });
	  $("button").eq(1).click(function(){		  
		  $.ajax({
			  url:$(this).text(),
			  type:$(this).attr("lang"),
			  dataType:'json',
			  //data:{job:$(this).attr("name"),no:$(this).attr("class")},
			  success:function(v){
				  console.log(v);
			  },
			  error:function(){
				  alert('error');
			  }			  
		  });
		  
	  });
	  
	  
	  $("button").eq(2).click(function(){		  
		  $.ajax({
			  url:$(this).text(),
			  type:$(this).attr("lang"),
			  dataType:'json',
			  //data:{job:$(this).attr("name"),no:$(this).attr("class")},
			  success:function(v){
				  console.log(v);
			  },
			  error:function(){
				  alert('error');
			  }			  
		  });
		  
	  });
	  
	   $("button").eq(3).click(function(){		  
		  $.ajax({
			  url:$(this).text(),
			  type:$(this).attr("lang"),
			  dataType:'json',
			  //data:{job:$(this).attr("name"),no:$(this).attr("class")},
			  success:function(v){
				  console.log(v);
			  },
			  error:function(){
				  alert('error');
			  }			  
		  });
		  
	  }); 
	  
	  
	  /* $("*").click(function(){
		 console.log($(this).text()); 
	  }); */
	
});
</script>
</head>
<body>
     <button id="b1" lang="GET" name="modify" class="50">/web/dataAjax1</button>
     <button id="b2" lang="POST">/web/dataAjax2</button>
     <button id="b3" lang="GET">/web/dataAjax3</button>
     <button id="b4" lang="GET">/web/dataAjax4</button>
</body>
</html>



