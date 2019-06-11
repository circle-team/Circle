
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js">

    </script>
</head>
<body>
<p>
    name:<input type="text" id="name"/>
    文件：<input type="file" id="file"/>
    <br>
    <button id="btu" onclick="btu()">提交</button>
</p>
</body>

<script>
    function btu(){
        var name=$("#name").val();
        var file=$("#file")[0].files[0];//新特性，获取文件对象
        var fordata=new FormData();//新特性，得到formData对象，把获取的值扔进去，相当于map
        fordata.append("name",name);
        fordata.append("file",file);
        console.log(file)
        $.ajax({
            url:"UpdataFile",
            data:fordata,
            cache:false,
            processData:false, //必须写
            contentType:false, //必须写
            type:"post",
            success:function(data){
                console.log("Success")
            }
        })

    }
</script>
</html>
