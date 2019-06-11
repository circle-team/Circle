<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
    <link rel="stylesheet" href="css/nav.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <script src="js/register.js"></script>
    <script src="js/nav.js"></script>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <script src="js/template-web.js"></script>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <nav class="narbar navbar-default navbar-fixed-top box1" role="navigation">
            <div class="col-md-3 text-left">
                <img id="logo" style="width: 47% ;height: 40%" src="images/logo.png"/>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-7 text-right">

                <a href="#"><img src="images/personal.png"/></a>
                <a href="UserInfo.jsp"><img src="images/information.png"/></a>
                <a href="#"><img src="images/blog.png"/></a>
                <a href="#" id="user"><img src="images/defult_uiImge.png"/>
                    <div id="userText">
                    </div>
                </a>
            </div>
        </nav>
    </div>
</div>

<div style="height: 100px;"></div>
<div class="FollowList">
</div>
<script id="template" type="text/html">
    <div style="width:auto;height:auto;max-width:800px;max-height:100px;" class="container jumbotron well-sm">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="row clearfix">
                    <div class="col-md-2 column">
                        <img style="width:auto;height:auto;max-width:72px;max-height:72px;" alt="140x140"
                             src="{{uimage}}"
                             class="img-circle"/>
                    </div>
                    <div class="col-md-8 column row">
                        <h5><span class="label  label-primary"> 昵称</span>{{uname}}</h5>
                        <h5><span class="label  label-primary">年龄</span>{{uage}}</h5>
                        <h5><span class="label  label-primary">所属学校 </span>{{uschool}}<span class="label  label-primary">所属年级</span>{{ugrade}}</h5>
                    </div>
                    <div class="col-md-2 column">
                        <button class="follow btn btn-sm btn-default pull-right" data-uid="{{uid}}" href="#"><h5>关注</h5>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</script>

<script>
    function re_FollowList() {
        var result;
        $.ajax({
            type: 'POST',
            url: 'AcquireStudentServlet',
            dataType: 'json',
            success: function (data) {
                console.log(data);
                var follows = eval(data);
                for (var index in follows) {
                    var a = follows[index];
                    var res = template("template", a);
                    console.log(res);
                    result = result + res;
                    // 将模板放入页面中
                }
                $('.FollowList').append(result);
            },
            error: function () {
                alert("page load fail!");
            }
        });
        $("body").on("click", ".follow", function () {
            var uid = $(this).data("uid");
            $.ajax({
                type: 'POST',
                url: 'FollowAddServlet',
                data: {uid: uid},
                async:false,
                success: function () {
                    alert("follow success");
                },
                error: function () {
                    alert("follow fail");
                }
            });
        });
        $("body").on("click", ".notfollow", function () {
            var uid = $(this).data("uid");
            $.ajax({
                type: 'POST',
                url: 'FollowAddServlet',
                data: {uid: uid},
                async:false,
                success: function () {
                    alert("notfollow success");
                },
                error: function () {
                    alert("notfollow fail");
                }
            });

        });
    };
    re_FollowList();

</script>
</body>
</html>