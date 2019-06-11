<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="cn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UserCircle</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/comment.css">
    <link rel="stylesheet" href="css/nav.css">
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="js/template-web.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <script src="js/bootstrap-waterfall.js"></script>
    <script src="js/nav.js"></script>
    <script src="js/comment.js"></script>
    <script src="js/blog.js"></script>
    <script src="js/getDateDiff.js"></script>


</head>
<body>
<div class="container">
    <div class="row">
        <nav class="narbar navbar-default navbar-fixed-top box1" role="navigation">
            <div class="col-md-3 text-left">
                <img id="logo" style="max-width:125px;max-height:48px;" src="images/logo.png"/>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-7 text-right">
                <a href="index.jsp"><img src="images/personal.png"/></a>
                <a href="UserBlogs.jsp"><img src="images/information.png"/></a>
                <a href="UserCircle.jsp"><img src="images/blog.png"/></a>
                <a href="UserInfo.jsp" id="user"><img src="images/defult_uiImge.png"/></a>
            </div>
        </nav>
    </div>
</div>

<div class="blank" style="width: auto;height: 100px">

</div>


<div id="panel" class=" container jumbotron well-sm" style="width:auto;height:auto;max-width:800px;max-height:100px;">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="nav nav-pills">
                <li class="active">
                    <a class="btn-new-blog btn btn-primary btn" href="#modal-blog-new" role="button"
                       data-toggle="modal">发表博客</a>
                </li>
                <li class="active">
                    <a href="" class="btn btn-default btn-lg" href="#">刷新全部</a>
                </li>
                <li>
                    <h5>输入UID关注：</h5>
                </li>
                <li>
                    <input name="search_uid" id="search_uid" class="form-control input-medium search-query" type="text"/>
                </li>
                <li>
                    <button id="search_uid_btn" class="btn btn-default">查找</button>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="waterfall">
    </div>
</div>

<div class="modal fade" id="modal-blog-details" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" data-bid="">
        <div class="modal-content details-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="details">
                    详情内容
                </h4>
            </div>
            <div class="modal-body">
                <div class="row clearfix">
                    <div class="col-md-12 column text-center">
                        <img class="details-img" style="width:auto;height:auto;"
                             src=""/>
                    </div>
                </div>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <h3 class="details-text">正文内容</h3><br>

                    </div>
                </div>
                <hr>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <small id="blog-timestamp" class="timestamp pull-left">time</small>
                        <button id="delete-blog" data-bid="" class="btn btn-sm btn-danger pull-right"
                                style="display: none">删除博客
                        </button>
                    </div>
                </div>
                <hr>
                <div class="row clearfix animated fadeInDown">
                    <div class="col-md-12 column comment_block">

                    </div>
                </div>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <form role="form" onsubmit="return submit_comment()" method="post" action="comment">
                            <div class="form-group">
                                <label for="comment">写评论</label><input type="text" onchange="on_comment()"
                                                                       class="form-control" id="comment"/>
                                <p class="help-block">
                                    Example block-level help text here.
                                </p>
                                <div class="alert animated fadeInDown alert-warning alert-dismissable"
                                     style="display: none" id="alert_win">
                                    <h5 id="alert">输入有误!</h5>
                                </div>
                                <a data-bid="" class="commit-comment btn btn-primary">评论</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="modal-blog-new" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content new-blog-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel-new">
                    详情内容
                </h4>
            </div>
            <div class="modal-body">
                <div class="row clearfix">
                    <div class="col-md-12 column text-center">
                        <img style="width:auto;height:auto;"
                             src=""/>
                    </div>
                </div>
                <hr>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <form role="form" onsubmit="return submit_blog()" method="post" action="comment">
                            <div class="form-group">
                                <label for="new_blog_image" class="btn btn-default">上传照片</label>
                                <input name="image" id="new_blog_image" type="file" style="display:none">
                                <label for="comment">写博客</label><input type="text" onchange="on_blog()"
                                                                       class="form-control" id="new-blog-text"/>
                                <p class="help-block">
                                    Example block-level help text here.
                                </p>
                                <div class="alert animated fadeInDown alert-warning alert-dismissable"
                                     style="display: none" id="alert_win2">
                                    <h5 id="alert2">输入有误!</h5>
                                </div>
                                <a class="btn btn-primary commit-blog" href="#">发表</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<script id="template-blog" type="text/html">
    <ul id="{{blogid}}" class="list-group">
        <li class="list-group-item">
            <a href="javascript:;">
                <img src="{{image}}"/>
            </a>
        </li>
        <li class="list-group-item">
            <span class="praise" data-bid="{{blogid}}">
                {{if ifthumb==0}}
                <span class="praise_img_block"><img src="images/love.png" class="praise_img animated rubberBand"></span>
                <span class="praise_txt">{{thumbnumber}}</span></span>
            {{else if ifthumb==1}}
            <span class="praise_img_block"><img src="images/loved.png" class="praise_img animated rubberBand"></span>
            <span class="praise_txt">{{thumbnumber}}</span></span>
            {{/if}}
            <span class="comments"><img src="images/comment.png"
                                        class="comment_img animated rubberBand"></span>
            <span clcass="comment-txt">{{commentnumber}}</span>
            <a href="#modal-blog-details" class="btn btn-sm btn-default modal-details-btn" data-text="{{text}}"
               data-uid="{{uid}}"
               data-commentnum="{{commentnumber}}" data-thupnum="{{thumbnumber}}" data-time="{{date.time}}"
               data-bid="{{blogid}}" data-ifthumb="{{ifthumb}}" data-uimg="{{uimage}}"
               data-img="{{image}}" role="button"
               class="btn btn-sm"
               data-toggle="modal">查看详情</a>
        </li>
        <li class="list-group-item">
            <div class="media">
                <div class="media-left">
                    <a href="javascript:;">
                        <img class="media-object img-rounded" style="width: 30px; height: 30px; margin-top: -25px;"
                             src="{{uimage}}"/>
                    </a>
                </div>
                <div class="media-body">
                    <h5 class="media-heading"></h5>
                    <small>{{uname}}</small>
                </div>
            </div>
        </li>
    </ul>
</script>

<script id="template-comment" type="text/html">
    <div class="row clearfix">
        <div class="col-md-2 column text-center">
            <img height="72" width="72" alt="140x140"
                 src="{{cimg}}"
                 class="img-circle"/>
            <label class="text-center">{{cname}}</label>
        </div>
        <div class="col-md-10 column">
            <blockquote>
                <p>{{ctext}}</p>
            </blockquote>
        </div>
    </div>
</script>

<script>
    function re_comment(bid) {
        $.ajax({
            type: 'POST',
            url: 'AcquireCommentServlet',
            data: {bid: bid},
            dataType: 'json',
            success: function (data) {
                var result;
                $('.comment_block').html("");
                console.log(data);
                var comments = eval(data);
                for (var index in comments) {
                    var a = comments[index];
                    var res = template("template-comment", a);
                    console.log(res);
                    result = result + res;
                    // 将模板放入页面中
                }
                $('.comment_block').append(result);
            },
            error: function () {
                alert("comments load fail");
            }
        });
    }

    function re_blog() {
        var result;
        $.ajax({
            type: 'GET',
            url: 'SelfBlogServlet',
            dataType: 'json',
            success: function (data) {
                console.log(data);
                var blogs = eval(data);
                for (var index in blogs) {
                    var a = blogs[index];
                    var res = template("template-blog", a);
                    console.log(res);
                    result = result + res;
                    // 将模板放入页面中
                }

                $('.waterfall').append(result).waterfall();
            },
            error: function () {
                alert("page load fail");
            }
        });
    }

    function re_click() {
        $("body").on("click", ".modal-details-btn", function () {
            var uid = $(this).data("uid");
            var bid = $(this).data("bid");
            var text = $(this).data("text");
            var time = $(this).data("time");
            var commentnum = $(this).data("commentnum");
            var thupnum = $(this).data("thupnum");
            var img = $(this).data("img");
            var ifthumb = $(this).data("ifthumb");
            $(".details-content").data("bid", bid);
            $("#delete-blog").data("bid", bid);
            $("#delete-blog").data("uid", uid);
            $("#log-details-praise").data("bid", bid);
            $("#blog-timestamp").html(getDateDiff(time));
            $(".details-commentnum").html(commentnum);
            var uid2 = '${sessionScope.userinf.getUid()}';
            alert(uid2);
            if (uid == uid2) {
                $("#delete-blog").css("display", "block");
            } else {
                $("#delete-blog").css("display", "none");
            }
            $(".details-thupnum").html(thupnum);
            $(".details-text").html(text);
            $(".details-img").attr("src", img);
            re_comment(bid);

        });
        $("body").on("click", ".praise", function () {
            var praise_img_block = $(this).find(".praise_img_block");
            var praise_img = $(this).find(".praise_img");
            var praise_txt = $(this).find(".praise_txt");
            var bid = $(this).data("bid");
            var num = parseInt(praise_txt.text());
            alert(bid);
            $.ajax({
                type: 'POST',
                url: 'ThumbAddServlet',
                data: {bid: bid},
                success: function () {
                    if (praise_img.attr("src") == ("images/loved.png")) {
                        praise_img_block.html("<img src='images/love.png' class='praise_img animated rubberBand' />");
                        praise_txt.removeClass("hover");
                        num -= 1;
                        praise_txt.text(num)
                    } else {
                        praise_img.attr("src", "images/loved.png");
                        praise_img_block.html("<img src='images/loved.png' class='praise_img animated rubberBand' />");
                        praise_txt.addClass("hover");
                        num += 1;
                        praise_txt.text(num)
                    }
                },
                error: function () {
                    // alert(uid);
                    alert("praise fail");

                }
            });

        });
        $("body").on("click", "#delete-blog", function () {
            var bid = $(this).data("bid");
            $.ajax({
                type: 'GET',
                url: 'DeleteBlogServlet',
                data: {bid: bid},
                success: function () {
                    location.reload();
                    alert("delete success");
                },
                error: function () {
                    location.reload();
                    alert("delete fail");
                }
            });
        });
        $("body").on("click", ".commit-blog", function () {
            var text = $("#new-blog-text").val();
            $.ajax({
                type: 'POST',
                url: 'InsertBlogServlet',
                data: {text: text},
                success: function () {
                    alert("push blog success");
                    location.reload();
                },
                error: function () {
                    alert("push blog fail");
                    location.reload();
                }
            });

        });
        $("body").on("click", ".commit-comment", function () {
            var bid = $(".details-content").data("bid");
            var text = $("#comment").val();
            alert(bid);
            alert(text);
            $.ajax({
                type: 'POST',
                url: 'CommentAddServlet',
                data: {bid: bid, text: text},
                success: function () {
                    alert("push success");
                    re_comment(bid);
                },
                error: function () {
                    alert("push fail");
                }
            });

        });
    }

    re_blog();
    re_click();
</script>
</body>
</html>