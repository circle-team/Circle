<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
   <script src="js/login.js"></script>-->

<%--    <script>--%>
<%--        function login_commit(){--%>
<%--            var flag = true;--%>
<%--            $.ajax({--%>
<%--                url:"login",--%>
<%--                type:"POST",--%>
<%--                async:false,--%>
<%--                data:$("#login_form").serialize(),--%>
<%--                success:function (data) {--%>
<%--                    ;                    if(data=="false"){--%>
<%--                        $("#login_alert").css("display","block");--%>
<%--                        flag = false;--%>
<%--                    }--%>
<%--                }--%>
<%--            })--%>
<%--            return flag;--%>
<%--        }--%>
<%--        $(document).ready(function(){--%>

<%--            /*$("#btn btn-default").click(function () {--%>
<%--                $.ajax({--%>

<%--                    url:"loginServlet",--%>
<%--                    type:"POST",--%>
<%--                    data:{"name":$("#name").val(),"password":$("#password").val()},--%>
<%--                    success:function (test) {--%>
<%--                        if(test==2)--%>
<%--                        $("alert").html("密码错误");--%>

<%--                    },--%>
<%--                    error:function () {--%>
<%--                        alert("出现连接错误！");--%>
<%--                    }--%>



<%--                })--%>
<%--            })*/--%>




<%--        })--%>



<%--    </script>--%>
    <script>
        function rep_merge(){

                $.ajax({
                    url:"PwdReplaceServlet",
                    type:"POST",
                    async:false,
                    data:$("#login_form").serialize(),
                    success:function (data) {
                        if(data.puton=="0"){
                            alert(typeof data.puton);
                            $("#login_alert").css("display","none");
                            $("#login_alert1").css("display","block");

                        }
                        else
                        {

                            alert(data.que);
                            $("#login_alert1").css("display","none");
                            $("#question").val(data.que);
                        }
                    }
                })
            }

        function login_commit(){
            var flag = false;
            $.ajax({
                url:"PwdSubmitServlet",
                type:"POST",
                async:false,
                data:$("#login_form").serialize(),
                success:function (data) {
                    // alert("false"===false);
                    if(false === data){
                        $("#login_alert1").css("display","none");
                        $("#login_alert").css("display","block");
                    }
                    else{
                        alert("恭喜!修改成功！");

                    }

                }
            })
            return flag;
        }




    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    找回密码<small>密码可以忘，但密保问题可真得记住了:)</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-2 column">
                    <div class="row clearfix">
                        <div class="col-md-8 column">
                            <ul class="nav nav-tabs nav-stacked">
                                <li class="active">
                                    <a href="register.html">注册</a>
                                </li>
                                <li>
                                    <a href="login.jsp">登陆</a>
                                </li>
                                <li class="active">
                                    <a href="PasswordReplace.jsp">忘记密码(修改密码)</a>
                                </li>
                                <li class="dropdown pull-right">
                                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">下拉<strong
                                            class="caret"></strong></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">操作</a>
                                        </li>
                                        <li>
                                            <a href="#">设置栏目</a>
                                        </li>
                                        <li>
                                            <a href="#">更多设置</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li>
                                            <a href="#">分割线</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="col-md-4 column">
                        </div>
                    </div>
                </div>
                <div class="col-md-6 column">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <br>
                            <form id="login_form" class="form-horizontal" role="form" method="post" action="PwdReplace"
                                  onsubmit="return login_commit()">
                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon1">id号</span>
                                    <input type="text" class="form-control" id="id" name="id" placeholder="请输入id号" aria-describedby="addon1" />
                                    <a class="btn btn-default" onclick="rep_merge()" href="javascript:;">验证</a>
                                </div>


                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon2">密保问题</span>
                                    <input type="text" class="form-control" id="question" name="question"
                                           aria-describedby="addon2" placeholder="" />
                                </div>
                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon3">问题答案</span>
                                    <input type="text" class="form-control" id="answer" name="answer"
                                           aria-describedby="addon2" placeholder="请输入问题答案" />
                                </div>
                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon4">新密码</span>
                                    <input type="text" class="form-control" id="password" name="password"
                                           aria-describedby="addon2" placeholder="请输入新密码" />
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-6">
<%--                                        <div class="checkbox">--%>
<%--                                            <input name="remember" value="Y" id="rem" type="checkbox"/><label for="rem">记住我</label>--%>
<%--                                        </div>--%>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button class="btn btn-default" type="submit">登 录</button>
                                    </div>
                                </div>

                            </form>

<%--                            <button class="btn btn-default" onclick="rep_merge()">验证</button>--%>

                            <div id="login_alert" class="alert alert-danger" role="alert" style="display: none">
                                密保问题错误
                            </div>
                            <div id="login_alert1" class="alert alert-danger" role="alert" style="display: none">
                                该用户不存在！
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <div class="row clearfix">
                        <div class="col-md-4 column">
                        </div>
                        <br>
                        <div class="col-md-12 column">
                            <div class="carousel slide" id="carousel-848284">
                                <ol class="carousel-indicators">
                                    <li class="active" data-slide-to="0" data-target="#carousel-848284">
                                    </li>
                                    <li data-slide-to="1" data-target="#carousel-848284">
                                    </li>
                                    <li data-slide-to="2" data-target="#carousel-848284">
                                    </li>
                                </ol>
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <img alt=""
                                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg"/>
                                        <div class="carousel-caption">
                                            <h4>
                                                First Thumbnail label
                                            </h4>
                                            <p>
                                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id
                                                elit non mi porta gravida at eget metus. Nullam id dolor id nibh
                                                ultricies vehicula ut id elit.
                                            </p>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <img alt=""
                                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/2/default.jpg"/>
                                        <div class="carousel-caption">
                                            <h4>
                                                Second Thumbnail label
                                            </h4>
                                            <p>
                                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id
                                                elit non mi porta gravida at eget metus. Nullam id dolor id nibh
                                                ultricies vehicula ut id elit.
                                            </p>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <img alt=""
                                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/3/default.jpg"/>
                                        <div class="carousel-caption">
                                            <h4>
                                                Third Thumbnail label
                                            </h4>
                                            <p>
                                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id
                                                elit non mi porta gravida at eget metus. Nullam id dolor id nibh
                                                ultricies vehicula ut id elit.
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <a class="left carousel-control" href="#carousel-848284" data-slide="prev"><span
                                        class="glyphicon glyphicon-chevron-left"></span></a> <a
                                    class="right carousel-control" href="#carousel-848284" data-slide="next"><span
                                    class="glyphicon glyphicon-chevron-right"></span></a>
                            </div>
                            <br>
                            <div class="alert alert-success alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                <h4>
                                    注意!
                                </h4> <strong>Warning!</strong> Best check yo self, you're not looking too good. <a
                                    href="#" class="alert-link">alert link</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <p class="text-center">在修改密码提交之前可以验证一下是否存在该用户并显示你要回答的密保问题，点击上表验证即可，否则则需要自己输入自己的密保问题
            </p>
        </div>

    </div>
</div>
</body>
</html>