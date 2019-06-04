<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
  <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
  <link rel="stylesheet" href="css/home.css">
  <script src="js/jquery-3.4.1.min.js"></script>
  <script src="bootstrap/js/bootstrap.js"></script>
  <!--<script>-->
  <!--function ScollPostion(){-->
  <!--var t, l, w, h;-->
  <!--if (document.documentElement && document.documentElement.scrollTop) {-->
  <!--t = document.documentElement.scrollTop;-->
  <!--l = document.documentElement.scrollLeft;-->
  <!--w = document.documentElement.scrollWidth;-->
  <!--h = document.documentElement.scrollHeight;-->
  <!-- else if (document.body) {-->
  <!--t = document.body.scrollTop;-->
  <!--l = document.body.scrollLeft;-->
  <!--w = document.body.scrollWidth;-->
  <!--h = document.body.scrollHeight;-->
  <!--}-->
  <!--return { top: t, left: l, width: w, height: h };-->
  <!--}-->
  <!--</script>-->
</head>}
<body>
<div class="text-center">
  <div class="container">
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
  <div class="row center-block">
    <div class="col-md-12">
      <div class="carousel slider" data-ride="carousel" id="carouse-example-generic">
        <ol class="carousel-indicators">
          <li data-slide-to="2" data-target="carouse-example-generic" class="active">
          </li>
          <li data-slide-to="3" data-target="carouse-example-generic">
          </li>
          <li data-slide-to="4" data-target="carouse-example-generic">
          </li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img class="img-responsive" src="images/img_2.jpg" alt=""/>
            <div class="carousel-caption" style="font-size: 50px;">First</div>
          </div>
          <div class="item">
            <img class="img-responsive" src="images/img_3.jpg" alt=""/>
            <div class="carousel-caption" style="font-size: 50px;">Second</div>
          </div>
          <div class="item">
            <img class="img-responsive" src="images/img_4.jpg" alt=""/>
            <div class="carousel-caption" style="font-size: 50px;">Third</div>
          </div>
        </div>
        <a class="left carousel-control" href="#carouse-example-generic"role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carouse-example-generic"role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-6"><img style="width: 70%;height: 420px;margin-left: 100px;margin-top: 30px;" src="images/img_1.jpg"/></div>
    <div class="col-lg-2" style="margin-top: 35px;"><p>okokokokokokokokokokokokokkko</p></div>
    <div class="col-md-3"><img style="width: 90%;margin-top: 30px;" src="images/img_5.jpg"/></div>
    <div class="col-md-5" style="margin-top: 30px;"><p class="text-right">okokokokokokokoko</p></div>
    <div class="col-md-3"><img style="width: 100%;margin-left: 40px;margin-top: 0px;" src="images/img_6.jpg"/></div>
    <div class="col-md-1"><p style="-webkit-writing-mode:vertical-lr ;writing-mode: lr-bt; margin-left: 50px;margin-top: 20px;">okokokokokokokokookkok</p></div>
    <div class="col-md-6"><img style="width: 60%;height: 250px;margin-left: 260px;margin-top: -350px;" src="images/img_7.jpg"/></div>

  </div>
  <div class="row">
    <div class="col-md-4 col-md-offset-1"><img style="width: 90%;height: 300px;margin-top: 40px;" src="images/img_8.jpg"/></div>
    <div class="col-md-2" style="height: 300px;border: black 1px solid;margin-top: 40px;margin-left: -40px;"><p>okokokkokokkokkokokokoko</p></div>
    <div class="col-md-2"><img style="width: 120%;height: 300px;margin-top: 40px;" src="images/img_9.jpg"/></div>
    <div class="col-md-2" style="height: 300px;border: black 1px solid;margin-top: 40px;margin-left: 31px;"><p>okokokokokokokokokokokokok</p></div>
    <div class="col-md-2 col-md-offset-1"><img style="width: 120%;height: 300px;margin-top: 40px;margin-left: 25px;" src="images/img_10.jpg"/></div>
    <div class="col-md-2" style="height: 300px;border: black 1px solid;margin-top: 40px;margin-left: 55px;"><p>okokokkokokkokkokokokoko</p></div>
    <div class="col-md-4"><img style="width: 90%;height: 300px;margin-top: 40px;margin-left: -40px;" src="images/img_2.jpg"/></div>
    <div class="col-md-2" style="height: 300px;border: black 1px solid;margin-top: 40px;margin-left: -60px;"><p>okokokokokokokokokokokokok</p></div>
  </div>
</div>
<div class="row">
  <div class="col-md-12 text-center">
    <nav aria-label="Page navigation">
      <ul class="pagination">
        <li>
          <a href="#" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
          </a>
        </li>
        <li class="active"><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li>
          <a href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
          </a>
        </li>
      </ul>
    </nav>
  </div>
</div>
<div class="row">
  <div class="col-md-12 text-center">
    <p>
    <ul class="pagination">
      <li><a href="#"><img src="images/qq.png"/></a></li>
      <li><a href="#"><img src="images/wechat.png"></a></li>
      <li><a href="#"><img src="images/ins.png"></a></li>
      <li><a href="#"><img src="images/微博.png"></a></li>
    </ul>
    </p>
  </div>
</div>

<script>
  var isAnimated = false;
  $(document).ready(function(){
    $(window).on("scroll",function () {
      if ($(this).scrollTop()>190) {
        $(".box1").addClass("box2");
        $(".box2").removeClass("box1");
        if (!isAnimated) {
          $(".navbar").css("top", "-60px");
          $(".navbar").animate({"top": "0px"}, 1000);
          isAnimated = true;
        }
      }else {
        isAnimated = false;
        $(".box1").removeClass("box2");
        $(".box2").addClass("box1");
      }
    })
  })
</script>
</body>
</html>