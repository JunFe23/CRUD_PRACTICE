<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>    
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
	$("button").click(function(){
		if($("input#id").val().length==0||$("input#name").val().length==0||
				   $("input#email").val().length==0||
				                  $("input#password").val().length==0){
			alert('DataCheck!');
			$("input.form-control").each(function(index,dom){
				
               $(this).val(this.type=='password'?'':' ');
				
			});
			$("input#id").focus();
			return false;
		}
		$("form[name='mForm']").submit();		
	});
  });
</script>
</head>
<body>

<div class="container">
  <h2>Member Data form</h2>
  <form action="/web/memberCheckData.do" method="POST" name="mForm">
    <div class="form-group">
      <label for="id">ID:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter id" name="id">
    </div>
    <div class="form-group">
      <label for="name">NAME:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="button" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>
    