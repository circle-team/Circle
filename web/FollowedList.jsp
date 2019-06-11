<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <title>FollowedList</title>
</head>
<body>
<div class="container">
    <div class="row">
        <nav class="narbar navbar-default navbar-fixed-top box1" role="navigation">
            <div class="col-md-3 text-left">
                <img id="logo" style="width:auto;height:auto;max-width:125px;max-height:48px;" src="images/logo.png"/>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-7 text-right">
                <a href="#"><img src="images/personal.png"/></a>
                <a href="UserInfo.jsp"><img src="images/information.png"/></a>
                <a href="#"><img src="images/blog.png"/></a>
                <a href="login.jsp" id="user"><img src="images/defult_uiImge.png"/></a>
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
                        <h5><span class="label  label-primary">所属学校 </span>{{uschool}}<span class="label label-primary">所属年级</span>{{ugrade}}
                        </h5>
                    </div>
                    <div class="col-md-2 column follow-btn">
                        {{if ifthumb==0}}
                        <button class="follow btn btn-sm btn-default pull-right" data-iffollow="0"
                                data-uid="{{uid}}" href="#">关&nbsp&nbsp &nbsp&nbsp注
                        </button>

                        {{else if ifthumb==1}}
                        <button class="follow btn btn-sm btn-primary pull-right" data-iffollow="1"
                                data-uid="{{uid}}" href="#">取消关注
                        </button>
                        {{/if}}


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
            url: 'AcquireBFansServlet',
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
            var btn = $(this);
            var iffollow = btn.data("iffollow");
            var uid = btn.data("uid");
            $.ajax({
                type: 'POST',
                url: 'FollowAddServlet',
                data: {uid: uid},
                async: false,
                success: function () {
                    if (iffollow == 1) {
                        btn.html("关    注");
                        btn.removeClass("btn-primary");
                        btn.addClass("btn-default");
                        btn.data("iffollow", "0");
                    } else if (iffollow == 0) {
                        btn.html("取消关注");
                        btn.removeClass("btn-default");
                        btn.addClass("btn-primary");
                        btn.data("iffollow", "1");

                    }
                },
                error: function () {
                    alert("follow fail");
                }
            });
        });
    };
    re_FollowList();

</script>
</body>
</html>
