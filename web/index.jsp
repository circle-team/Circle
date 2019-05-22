<%--
  Created by IntelliJ IDEA.
  User: Cynika
  Date: 2019/5/8
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
  <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/jquery-3.4.1.min.js"></script>
  <script src="bootstr ap/js/bootstrap.js"></script>
</head>
  <body>
  <div class="container"><%--导航栏--%>
    <div class="row">
      <div class="col-md-12 column">
        <nav class="navbar navbar-default navbar-fixed-top <%--navbar-inverse--%>" id="box1" role="navigation">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
          </div>

          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li class="active">
                <a href="#">Link</a>
              </li>
              <li>
                <a href="#">Link</a>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="#">Action</a>
                  </li>
                  <li>
                    <a href="#">Another action</a>
                  </li>
                  <li>
                    <a href="#">Something else here</a>
                  </li>
                  <li class="divider">
                  </li>
                  <li>
                    <a href="#">Separated link</a>
                  </li>
                  <li class="divider">
                  </li>
                  <li>
                    <a href="#">One more separated link</a>
                  </li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li>
                <a href="#">Link</a>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="#">Action</a>
                  </li>
                  <li>
                    <a href="#">Another action</a>
                  </li>
                  <li>
                    <a href="#">Something else here</a>
                  </li>
                  <li class="divider">
                  </li>
                  <li>
                    <a href="#">Separated link</a>
                  </li>
                </ul>
              </li>
            </ul>
          </div>

        </nav>
      </div>
    </div><%--导航栏--%>
    <div class="row clearfix">
      <div class="col-md-12 column">
      </div>
    </div>
    <div class="row clearfix">
      <div class="col-md-12 column">
        <div class="carousel slide" id="carousel-301909">
          <ol class="carousel-indicators">
            <li data-slide-to="0" data-target="#carousel-301909">
            </li>
            <li data-slide-to="1" data-target="#carousel-301909">
            </li>
            <li data-slide-to="2" data-target="#carousel-301909" class="active">
            </li>
          </ol>
          <div class="carousel-inner">
            <div class="item">
              <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg" />
              <div class="carousel-caption">
                <h4>
                  First Thumbnail label
                </h4>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
              </div>
            </div>
            <div class="item">
              <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/2/default.jpg" />
              <div class="carousel-caption">
                <h4>
                  Second Thumbnail label
                </h4>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
              </div>
            </div>
            <div class="item active">
              <img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/3/default.jpg" />
              <div class="carousel-caption">
                <h4>
                  Third Thumbnail label
                </h4>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
              </div>
            </div>
          </div> <a class="left carousel-control" href="#carousel-301909" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-301909" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div>
        <div class="row">
          <div class="col-md-4">
            <div class="thumbnail">
              <img alt="300x200" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/600/200/people/default.jpg" />
              <div class="caption">
                <h3>
                  Thumbnail label
                </h3>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
                <p>
                  <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <img alt="300x200" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/600/200/city/default.jpg" />
              <div class="caption">
                <h3>
                  Thumbnail label
                </h3>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
                <p>
                  <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                </p>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="thumbnail">
              <img alt="300x200" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/600/200/sports/default.jpg" />
              <div class="caption">
                <h3>
                  Thumbnail label
                </h3>
                <p>
                  Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                </p>
                <p>
                  <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="row clearfix">
      <div class="col-md-8 column">
        <img alt="140x140" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg" />
        <p>
          <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
        </p>
        <a id="modal-665779" href="#modal-container-665779" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>

        <div class="modal fade" id="modal-container-665779" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                  标题
                </h4>
              </div>
              <div class="modal-body">
                内容...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
              </div>
            </div>

          </div>

        </div>

      </div>
      <div class="col-md-4 column">
        <img alt="140x140" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg" />
        <p>
          <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
        </p>
        <a id="modal-174630" href="#modal-container-174630" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>

        <div class="modal fade" id="modal-container-174630" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                  标题
                </h4>
              </div>
              <div class="modal-body">
                内容...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
              </div>
            </div>

          </div>

        </div>

      </div>
    </div>
    <div class="row clearfix">
      <div class="col-md-2 column">
      </div>
      <div class="col-md-4 column">
        <img alt="140x140" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg" />
        <p>
          <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
        </p>
        <a id="modal-872479" href="#modal-container-872479" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>

        <div class="modal fade" id="modal-container-872479" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                  标题
                </h4>
              </div>
              <div class="modal-body">
                内容...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
              </div>
            </div>

          </div>

        </div>

      </div>
      <div class="col-md-4 column">
        <img alt="140x140" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/140/140/default.jpg" />
        <p>
          <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
        </p>
        <a id="modal-479939" href="#modal-container-479939" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>

        <div class="modal fade" id="modal-container-479939" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                  标题
                </h4>
              </div>
              <div class="modal-body">
                内容...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary">保存</button>
              </div>
            </div>

          </div>

        </div>

      </div>
      <div class="col-md-2 column">
        <blockquote>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
          </p> <small>Someone famous <cite>Source Title</cite></small>
        </blockquote>
      </div>
    </div>
    <div class="row clearfix">
      <div class="col-md-12 column">
        <ul class="pagination">
          <li>
            <a href="#">Prev</a>
          </li>
          <li>
            <a href="#">1</a>
          </li>
          <li>
            <a href="#">2</a>
          </li>
          <li>
            <a href="#">3</a>
          </li>
          <li>
            <a href="#">4</a>
          </li>
          <li>
            <a href="#">5</a>
          </li>
          <li>
            <a href="#">Next</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
  </body>
</html>
