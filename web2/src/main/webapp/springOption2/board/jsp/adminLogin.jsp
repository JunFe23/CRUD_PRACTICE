<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="copyright" content="Copyright 2009 @ high1 all rights reserved" />
<link href="/web/springOption2/board/css/contents.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
   /*  function idCheck(){
      var obj=document.login;     
      obj.submit();
   }  */
   window.onload = function(){
	   console.log(${checker});
	   if('${pop}'=='null'){
		   popup();
	   } else {
		   console.log(${pop});
	   }
   }
   
   function popup(){
       var url = "/web/springOption2/board/jsp/popup.jsp";
       var name = "popup test";
       var option = "width = 500, height = 500, top = 100, left = 200, location = no"
       window.open(url, name, option);
   }
   
   $(function(){
	   $("input#id").val('${id}'=='empty'?'':'${id}');
	   $("input[name='checker']").attr("checked",'${id}'!='empty');      
	  $("img#btnSubmit").click(function(){
		 $("form[name='login']").submit(); 
	  }); 
   }); 
</script>
</head>
<body>
${pop}
<form name="login" method="post" action="/web/cookieLogin.do">
 <div id="loginWrapper">
  <div class="loginForm">
   <fieldset>
    <legend>관리자 시스템 로그인</legend>
    <dl>
     <dt><img src="/web/springOption2/board/img/common/th_id.gif" alt="아이디" /></dt>
     <dd><input type="text" name="id" class="text" id="id" /></dd>

     <dt><img src="/web/springOption2/board/img/common/th_pw.gif" alt="비밀번호" /></dt>
     <dd><input type="password" name="pw" class="text" id="user_passwd" /></dd>
    </dl>
    <div class="btn">
     <img id="btnSubmit" src="/web/springOption2/board/img/button/btn_login.gif" alt="LOGIN" title="LOGIN"  onclick="idCheck()" />
    </div>
    
    <div class="saveId">
    <input type="checkbox" id="checker" name="checker" /> 
     <img src="/web/springOption2/board/img/common/save_id.gif" alt="아이디 저장" />
    </div>
   </fieldset>
   
   
  </div>
 </div>
</form>
</body>
</html>