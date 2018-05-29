$("#resetBtn").click(function(){
	alert(0)
	$("#logincode").val()="";
	$("#password").val()="";
});

$("#loginBtn").click(function(){
	var path=$("#path").val();
	var user = new Object();
	user.logincode = $.trim($("#logincode").val());
	user.password = $.trim($("#password").val());
	/*user.isStart = 1;*/
	
	if(user.logincode == "" || user.logincode == null){
		 $("#logincode").focus();
		 $("#formtip").css("color","red");
		 $("#formtip").html("对不起，登录账号不能为空。");
	}else if(user.password == "" || user.password == null){
		$("#password").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，登录密码不能为空。");
	}else{
		$("#formtip").html("");
		$.ajax({
			url:path+"/AuUserLogin",
			type: 'POST',
			data:{user:JSON.stringify(user)},
			dataType: "json",
			/*contentType: "application/json",*/
			success:function(result){
				if(result.success==true){//登录成功
					alert("登陆成功！！！正在为您跳转首页....");
					window.location.href='../pages/main.html';
				}else{
					alert(3);
					$("#formtip").css("color","red");
					$("#formtip").html("登陆失败！请重试。");
					$("#logincode").val('');
					$("#password").val('');
				}
				/*else if("nologincode" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("登录账号不存在，请重试。");
				}else if("nodata" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("对不起，没有任何数据需要处理！请重试。");
				}else if("pwderror" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("登录密码错误，请重试。");
				}*/
			}
			});
	}
});

