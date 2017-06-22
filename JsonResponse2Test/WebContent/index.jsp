<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试返回JSON格式的数据</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	testResponseBody();
});
function testResponseBody(){
	$.post("${pageContext.request.contextPath}/json/testRequestBody",null,
			function(data){ 
		$.each(data,function(){
			var tr  = $("<tr align='center'/>");
            $("<td/>").html(this.sid).appendTo(tr);
            $("<td/>").html(this.name).appendTo(tr);
            $("<td/>").html(this.sclass).appendTo(tr);
            $("<td/>").html(this.date).appendTo(tr);
            $("#booktable").append(tr);
        })
	},"json");
}
</script>
</head>
<body>
<table id="booktable" border="1"  style="border-collapse: collapse;">
	<tr align="center">
	  <th>学号</th>
	  <th>姓名</th>
	  <th>班级</th>
	  <th>时间</th>
	</tr>
	
</table>
	
</body>
</html>