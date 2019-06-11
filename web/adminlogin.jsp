<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <%--<!--    <script src="js/login.js"></script>-->--%>

    <script>
        function login_commit() {
            var name=$("#name").val();
            var Password=$("#Password").val();
            if(name=="admin" && Password=="88888888"){
                window.open("admin.html");
            }else{
                alert("用户名或者密码错误！")
            }
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    管理员登陆 <small>等级最高者的登陆</small>
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
                            <form id="login_form" class="form-horizontal" role="form" method="post" action="login"
                                  onsubmit="return login_commit()">
                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon1">ID号</span>
                                    <input type="text" class="form-control" id="name" placeholder="请输入用户名" aria-describedby="addon1" name="name" onblur="oBlur_name()"/>
                                </div>

                                <div class="input-group form-group col-sm-6">
                                    <span class="input-group-addon" id="addon2">密   码</span>
                                    <input type="password" class="form-control" id="Password" name="password"
                                           aria-describedby="addon2" placeholder="请输入密码" value="" onblur="oBlur_Password()"/>
                                </div>
<%--                                <div class="form-group">--%>
<%--                                    <div class="col-sm-6">--%>
<%--                                        <div class="checkbox">--%>
<%--                                            <input name="remember" value="Y" id="rem" type="checkbox"/><label for="rem">记住我</label>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button class="btn btn-default" type="submit">登 录</button>
                                    </div>
                                </div>
                            </form>

                            <div id="login_alert" class="alert alert-danger" role="alert" style="display: none">
                                该用户不存在
                            </div>
                            <div id="login_alert1" class="alert alert-danger" role="alert" style="display: none">
                                密码错误
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

            <p class="text-center">
                <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong>
                编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在
                <small>Ruby</small>
                社区中。
            </p>
        </div>

    </div>
</div>
</body>
</html>