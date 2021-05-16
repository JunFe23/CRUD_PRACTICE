<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script type="text/javascript">
    $(function(){
    	//$("div#row").hide();
    	$("p#clickID").click(function(){
    		//$("div#row").show(1000);
    		$.getJSON("http://flickr.com/services/feeds/photos_public.gne?tags=book&tagmode=any&format=json&jsoncallback=?",function(data){
    			
    			var temp="";
    			var tag="";
    			console.log(data['title']);
    			console.log(data.link);
    			$.each(data.items,function(i,tem){    				
    				tag+="<div class=\"col-md-4\">";
    				tag+="<div class=\"thumbnail\">";
    				tag+="<a href="+tem.link+" target=\"_blank\">";
    				tag+="<img src="+tem.media.m+" alt=\"Lights\" style=\"width:100%\">";
    				tag+="<div class=\"caption\">";
    				tag+=" <p>"+tem.title+"</p>";
    				tag+="</div>";    			          
    				tag+="</a>";
    				tag+="</div>";
    				tag+="</div>";
    				
    			});  //each  
    			$("div#row").html(tag);
    		 });
    		
    	});
    	
    });
  </script>
</head>
<body>

<div class="container">
  <h2>Image Gallery</h2>
  <p>The .thumbnail class can be used to display an image gallery.</p>
  <p>The .caption class adds proper padding and a dark grey color to text inside thumbnails.</p>
  <p id="clickID">Click on the images to enlarge them.</p>
  <div class="row" id="row">
    
    
    <!-- 1-연산자와 명령문활용 부터  16page-->
  </div> 
</div>
</body>
</html>


