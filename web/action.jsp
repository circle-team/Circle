<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="cn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pinterest的网格瀑布流</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/comment.css">
    <link rel="stylesheet" href="css/nav.css">
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="js/template-web.js"></script>
    <script src="js/comment.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    <script src="js/bootstrap-waterfall.js"></script>
    <script src="js/nav.js"></script>

</head>
<body>
<div class="nav">
    <div class="row">
        <nav class="narbar navbar-default navbar-fixed-top box1" role="navigation">
            <div class="col-md-3 text-left">
                <img id="logo" style="width: 45%" src="images/logo.png"/>
            </div>
            <div class="col-md-2"></div>
            <div class="col-md-7 text-right">
                <a href="#"><img src="images/personal.png"/></a>
                <a href="#"><img src="images/information.png"/></a>
                <a href="#"><img src="images/blog.png"/></a>
                <a href="#"><img src="images/defult_uiImge.png"/></a>
            </div>
        </nav>
    </div>
</div>
<div class="panel">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="nav nav-pills">
                <li class="active">
                    <button class="btn bg-primary btn-group-lg">asdasdasdsa</button>
                </li>
                <li>
                    <a href="#"> <span class="badge pull-right">16</span> More</a>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="waterfall"></div>
</div>

<div class="modal fade" id="modal-blog-details" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog">
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
                        <h3 class="details-text">正文内容</h3>
                    </div>
                </div>
                <hr>
                <div class="row clearfix">
                    <div class="col-md-12 column">
                                    <span class="praise"><span class="praise_img_block"><img src="images/love.png"
                                                                                             class="praise_img animated rubberBand"></span>
                                    <span class="praise_txt details-thupnum">146</span></span>

                        <span class="comments"><img src="images/comment.png"
                                                    class="comment_img animated rubberBand"></span>
                        <span class="comment_txt details-commentnum">146</span>
                    </div>
                </div>
                <hr>
                <div class="row clearfix animated fadeInDown">
                    <div class="col-md-12 column comment_block">
                        <div class="row clearfix">
                            <div class="col-md-2 column text-center">
                                <img height="80" width="80" alt="140x140"
                                     src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg"
                                     class="img-circle"/>
                                <label>name</label>
                            </div>
                            <div class="col-md-10 column">
                                <blockquote>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                                        posuere erat a ante.</p>
                                    <small>send date time<cite>发送于web客户端</cite></small>
                                </blockquote>
                            </div>
                        </div>
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
                                <button type="submit" class="btn btn-primary">评论</button>
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
                                <label for="image" class="btn btn-default">上传照片</label>
                                <input name="image" id="image" type="file" style="display:none">
                                <label for="comment">写博客</label><input type="text" onchange="on_blog()"
                                                                       class="form-control" id="new_blog"/>
                                <p class="help-block">
                                    Example block-level help text here.
                                </p>
                                <div class="alert animated fadeInDown alert-warning alert-dismissable"
                                     style="display: none" id="alert_win2">
                                    <h5 id="alert2">输入有误!</h5>
                                </div>
                                <button type="submit" class="btn btn-primary">发表</button>
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

<script id="waterfall-template" type="text/html">

    <ul class="list-group">
        <li class="list-group-item">
            <a href="javascript:refresh();">
                <img src="images/img_1.jpg"/>
            </a>
        </li>
        <li class="list-group-item">
            <span class="praise"><span class="praise_img_block"><img src="images/love.png"
                                                                     class="praise_img animated rubberBand"></span>
                                    <span class="praise_txt">146</span></span>

            <span class="comments"><img src="images/comment.png"
                                        class="comment_img animated rubberBand"></span>
            <span clcass="comment-txt">146</span>
            <a href="#modal-blog-details" class="modal-details-btn" data-text="" data-commentnum="12" data-thupnum="34"
               data-bid="123456"
               data-img="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg" role="button"
               class="btn btn-sm"
               data-toggle="modal">查看详情</a>
        </li>
        <li class="list-group-item">
            <div class="media">
                <div class="media-left">
                    <a href="javascript:;">
                        <img class="media-object img-rounded" style="width: 30px; height: 30px;"
                             src="images/avatar_30.png"/>
                    </a>
                </div>
                <div class="media-body">
                    <h5 class="media-heading">Liber</h5>
                    <small>I love this pin!</small>
                </div>
            </div>
        </li>
    </ul>


</script>
<script>
    function refresh() {
        var res;
        $.ajax({
            type: 'GET',
            url: 'SelfBlogServlet',
            dataType: 'json',
            success: function (data) {
                var blogs = eval(data);
                for (var index in blogs) {
                    alert(blogs[index].bid);
                }
                $('.waterfall')
                    .data('bootstrap-waterfall-template', $('#waterfall-template').html())
                    .waterfall();
            },
            error: function () {
                alert("dddddddddddddddddddd!");
            }
        });
        $('.waterfall')
            .data('bootstrap-waterfall-template', $('#waterfall-template').html())
            .waterfall();
        $(function () {
            $("body").on("click", ".praise", function () {
                var praise_img_block = $(this).find(".praise_img_block");
                var praise_img = $(this).find(".praise_img");
                var praise_txt = $(this).find(".praise_txt");
                var num = parseInt(praise_txt.text());
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
            })
            $("body").on("click", ".modal-details-btn", function () {
                var bid = $(this).data("bid");
                var text = $(this).data("text");
                var commentnum = $(this).data("commentnum");
                var thupnum = $(this).data("thupnum");
                var img = $(this).data("img");
                $(".details-content").attr("id", bid);
                $(".details-commentnum").html(commentnum);
                $(".details-thupnum").html(thupnum);
                $(".details-text").html(text);
                $(".details-img").attr("src", img);
            })
        });
    }

    refresh();
</script>
</body>
</html>