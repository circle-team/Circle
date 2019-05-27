<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link  type="text/css" rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <script src="js/register.js"></script>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            document.getElementById("alert_win").style.visibility="hidden";
        })
    </script>

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    注 册 <small> 立 即 成 为 circle 的 新 成 员</small>
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
                                    <a href="#">首页</a>
                                </li>
                                <li>
                                    <a href="#">简介</a>
                                </li>
                                <li class="disabled">
                                    <a href="#">信息</a>
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
                            <form class="form-horizontal" role="form" method="post" action=""
                                  onsubmit="return submitTest()">
                                <div class="form-group">
                                    <label for="name" class="col-sm-2 control-label">昵称</label>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control" id="name" placeholder="请输入用户名"
                                               name="name"  onchange="on_name()"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="q1" class="col-sm-2 control-label">密保问题1</label>
                                    <div class="col-sm-4">
                                        <select class="form-control" id="q1" name="q1" onchange="on_q1()">
                                            <option value="你喜欢看的电影？">你喜欢看的电影</option>
                                            <option value="你的生日？">你的生日</option>
                                            <option value="你最喜欢哪支球队？">你最喜欢哪支球队</option>
                                            <option value="你的初中班主任名字是什么？">你的初中班主任名字是？</option>
                                            <option value="你最喜欢的食物是什么？">你最喜欢的食物是？</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="a1" class="col-sm-2 control-label">问题1答案</label>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control" id="a1" name="a1"
                                               onchange="on_a1()" placeholder="请输入密保答案"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="q2" class="col-sm-2 control-label">密保问题2</label>
                                    <div class="col-sm-4">
                                        <select class="form-control" id="q2" name="q2" onchange="on_q2()">
                                            <option value="你喜欢看的电影？">你喜欢看的电影</option>
                                            <option value="你的生日？">你的生日</option>
                                            <option value="你最喜欢哪支球队？">你最喜欢哪支球队</option>
                                            <option value="你的初中班主任名字是什么？">你的初中班主任名字是？</option>
                                            <option value="你最喜欢的食物是什么？">你最喜欢的食物是？</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="a2" class="col-sm-2 control-label">问题2答案</label>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control" id="a2" name="a2"
                                               placeholder="请输入密保答案"  onchange="on_a2()"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="Password" class="col-sm-2 control-label">密码</label>
                                    <div class="col-sm-4">
                                        <input type="password" class="form-control" id="Password" name="password"
                                               placeholder="请输入密码"  onchange="on_Password()"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="Password2" class="col-sm-2 control-label">确认密码</label>
                                    <div class="col-sm-4">
                                        <input type="password" class="form-control" id="Password2" name="Password2"
                                               placeholder="请再次输入密码"  onchange="on_Password2()"/>
                                    </div>
                                </div>
                                <br>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button type="submit" class="btn btn-default">注 册</button>
                                    </div>
                                </div>
                            </form>
                            <div class="alert  alert-warning alert-dismissable" id="alert_win">
                                <h4 id="alert">
                                    输入有误!
                                </h4>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="col-md-4 column">
                    <div class="row clearfix">
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
        </div>

        <div class="col-md-12 column">
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