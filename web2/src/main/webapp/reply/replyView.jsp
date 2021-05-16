<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="rss.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
   function delFun(no){
	  
	   $.ajax({
			url:'/web/ajaxDelete.do',
			type:'POST',		
			contentType:'application/x-www-form-urlencoded;charset=UTF-8',
			data:{no:no},
			dataType:'json',
			success:function(result){
				console.log('load...'+result);
				selectAjax(result);				
			},
			error:function(){
				alert('Error');
			}			
		  }); 
	
  }
  function selectAjax(result){
	  var temp="";	  
	  $.each(result,function(index,dom){
		  temp+="<div class=\"list_cmt\">";
		  temp+="<div class=\"cmt_head\"></div>";
		  temp+="<div class=\"cmt_body\">";
		  temp+="<span class=\"info_append\">";
		  temp+="<span class=\"txt_name\">"+dom.id+"</span>";
		  temp+="<span class=\"txt_bar\">|</span>";
		  temp+="<span class=\"txt_time\">"+dom.regdate+"</span></span>";
		  temp+="<p class=\"txt_desc\">"+dom.contents+"";		  
		  temp+="</p></div><div class=\"cmt_foot\">";
		  temp+="<a href=\"#none\">답글</a><span class=\"txt_bar\">|</span><a href=\"#none\">수정</a><span class=\"txt_bar\">|</span><a href='javascript:delFun("+dom.no+")'>삭제</a><span class=\"txt_bar\">|</span><a href=\"#none\">신고</a>";
		  temp+="</div></div>";		  
	  });	
	  $("div#sList").html(temp);
  }
  function initList(){
	  $.ajax({
			url:'/web/ajaxList.do',
			type:'POST',		
			contentType:'application/x-www-form-urlencoded;charset=UTF-8',
			dataType:'json',
			success:function(result){
				 console.log(result);
				selectAjax(result);
			},
			error:function(){
				alert('Error');
			}			
		  });
  }
  
  $(function(){
	  initList();	  
	  $("textarea").click(function(){
		 $(this).val(''); 
		 $('textarea').keyup(function(){
			 var strlen=$(this).val().length;
			 if(strlen>100){
				 $("span#slen").html("<font size=3 color=red>"+(100-strlen)+"</font>");
			 }else
			 $("span#slen").html("<font size=3 color=blue>"+strlen+"</font>");
		 });
	  });
	  
	  $("input[id='send']").click(function(){
		  //alert($("input[name='id']").val()+' '+$("textarea").val());
		   var params=$("form#frm").serialize();
		  $.ajax({
			url:'/web/ajaxInsert.do',
			type:'POST',
			//data:{id:$("input[name='id']").val(),contents:$("textarea").val()},
			data:params,
			contentType:'application/x-www-form-urlencoded;charset=UTF-8',
			dataType:'json',
			success:function(result){
				selectAjax(result);
			},
			error:function(){
				alert('Error');
			}			
		  });
	  });
  });
</script>
</head>
<body>
<div class="cmt_comm">
	<form action="" enctype="application/x-www-form-urlencoded" id="frm">
		<fieldset class="fld_cmt">
			<legend class="screen_out">댓글 작성</legend>
			<textarea name="contents" class="tf_cmt" cols="90" rows="5" title="한줄 토크를 달아주세요">한줄 토크를 달아주세요! (100자)</textarea>
			<input type="hidden" name="id" value="BLUE">
			<input type="hidden" name="job" value="new">
			<input id="send" type="button" value="등록" style="position: absolute;top: 50px; width: 100px; height: 54px;">
			<p class="info_append">
				<span class="screen_out">입력된 바이트 수 : </span>
				<span class="txt_byte" id="slen">0</span> / 100자
				<span class="txt_bar">|</span>
				<a href="#none">댓글 운영원칙</a>
			</p>
		</fieldset>
	</form>	
	<strong class="screen_out">전체 댓글</strong>
	<div id="sList">
	
	</div>
	<!-- <div class="list_cmt"> -->
		 <!-- <div class="cmt_head"></div>
		<div class="cmt_body">
			<span class="info_append">
				<span class="txt_name">글쓴이</span>
				<span class="txt_bar">|</span>
				<span class="txt_time">2020.01.01 14:22</span>
			</span>
			<p class="txt_desc" id="p">
				댓글 내용이 나오는 곳...댓글댓글 내용이 나오는 곳...댓글 내용이 나오는 곳...댓글 내용이 나오는 곳...
			</p>
		</div>
		<div class="cmt_foot">
			<a href="#none" id="1" lang="replyA">답글</a><span class="txt_bar">|</span><a href="#none">수정</a><span class="txt_bar">|</span><a href="#none">삭제</a><span class="txt_bar">|</span><a href="#none">신고</a>
		</div>
		 -->		
	<!-- </div> -->
	
	
</div>

</body>
</html>