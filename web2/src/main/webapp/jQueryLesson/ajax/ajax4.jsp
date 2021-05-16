<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
/* {
	"title": "R5__5724-Edit-05-08",
	"link": "https:\/\/www.flickr.com\/photos\/jaylt4\/51168608782\/",
	"media": {"m":"https:\/\/live.staticflickr.com\/65535\/51168608782_8f0fb7b9f4_m.jpg"},
	"date_taken": "2021-05-08T07:49:11-08:00",
	"description": " <p><a href=\"https:\/\/www.flickr.com\/people\/jaylt4\/\">jaylt466<\/a> posted a photo:<\/p> <p><a href=\"https:\/\/www.flickr.com\/photos\/jaylt4\/51168608782\/\" title=\"R5__5724-Edit-05-08\"><img src=\"https:\/\/live.staticflickr.com\/65535\/51168608782_8f0fb7b9f4_m.jpg\" width=\"240\" height=\"160\" alt=\"R5__5724-Edit-05-08\" \/><\/a><\/p> ",
	"published": "2021-05-10T05:08:28Z",
	"author": "nobody@flickr.com (\"jaylt466\")",
	"author_id": "29678313@N05",
	"tags": "canon canonr5 canoneosr5 eosr5 r5 rf100500 100500 outofafricawildlifepark tiger"
} */



  $(function(){
	  $("button").click(function(){
		 $.getJSON("http://flickr.com/services/feeds/photos_public.gne?tags="+$("input[name='data']").val()+"&tagmode=any&format=json&jsoncallback=?",function(data){
			console.log(data);
			var temp="";
			console.log(data['title']);
			console.log(data.link);
			$.each(data.items,function(i,tem){
				$("span#sp").append("<a href='"+tem.link+"'>Click</a>");
				console.log(tem.link);
			});
			
			/* $.each(data.items,function(index,item){
				//console.log(item.title);
				//console.log(item.media['m']);
				console.log(item.media.m);
				temp+="<img src="+item.media['m']+" width=200 height=200>";
				
			});
			$("span").html(temp); */
		 });
	  });
  });
</script>
</head>
<body>
    <input type="text" name="data" id="data"><button>검색</button><br>
    <span id="sp"></span>
</body>
</html>
















