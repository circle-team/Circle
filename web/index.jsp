<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="cn">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
  <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
  <link rel="stylesheet" href="css/home.css">
  <link rel="stylesheet" href="css/nav.css">
  <link rel="stylesheet" href="css/animate.min.css">
  <script src="js/jquery-3.4.1.min.js"></script>
  <script src="bootstrap/js/bootstrap.js"></script>
</head>
<body>
<div id="page">
  <div class="text-center">
    <div class="container">
      <div class="row">
        <nav class="narbar navbar-default navbar-fixed-top box1" role="navigation">
          <div class="col-md-3 text-left">
            <img id="logo" style="width: 47% ;height: 120%" src="images/logo.png"/>
          </div>
          <div class="col-md-2"></div>
          <div class="col-md-7 text-right">

            <a href="#"><img src="images/personal.png"/></a>
            <a href="UserInfo.jsp"><img src="images/information.png"/></a>
            <a href="#"><img src="images/blog.png"/></a>
            <a href="#" id="user"><img src="images/defult_uiImge.png"/>
              <div id="userText">
                <h1>okokokokokoko</h1>
              </div>
            </a>
          </div>
          <!--<div id="myModal" class="modal">-->
          <!--<div class="modal-header">-->
          <!--<span class="close">&times;</span>-->
          <!--</div>-->
          <!--<div class="modal-body">-->
          <!--<p>弹窗文本...</p>-->
          <!--<p>弹窗文本...</p>-->
          <!--</div>-->
          <!--<div class="modal-footer"></div>-->
          <!--</div>-->
        </nav>
      </div>
    </div>

    <div class="row center-block">
      <div class="col-md-12">
        <div class="carousel slider" data-ride="carousel" id="carouse-example-generic">
          <div class="carousel-inner" role="listbox">
            <div class="item fade active">
              <img class="img-responsive" src="images/img_53.jpg" alt=""/>
              <div class="carousel-caption" style="font-size: 50px;">First</div>
            </div>
            <div class="item fade">
              <img class="img-responsive" src="images/img_37.jpg" alt=""/>
              <div class="carousel-caption" style="font-size: 50px;">Second</div>
            </div>
            <div class="item fade">
              <img class="img-responsive" src="images/img_50.jpg" alt=""/>
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
      <div class="col-md-6 no animated" id="part1"><img src="images/img_30.jpg"/></div>
      <div class="col-lg-2 no animated" id="part2">
        <h4>愿面朝大海, 春暖花开</h4>
        <p>从明天起, 做一个幸福的人<br>喂马, 劈柴, 周游世界<br>从明天起, 关心粮食和蔬菜<br>我有一所房子, 面朝大海, 春暖花开<br>从明天起, 和每一个亲人通信<br>告诉他们我的幸福<br>那幸福的闪电告诉我的<br>我将告诉每一个人<br>给每一条河每一座山取一个温暖的名字<br>陌生人, 我也为你祝福<br>愿你有一个灿烂的前程<br>愿你有情人终成眷属<br>愿你在尘世获得幸福<br>我只愿面朝大海, 春暖花开</p></div>
      <div class="col-md-3 no animated" id="part3"><img src="images/img_17.jpg"/></div>
      <div class="col-md-5 no animated" id="part4"><p class="text-right">无缘的你啊, 不是来得太早 就是, 太迟</p></div>
      <div class="col-md-3 no animated" id="part5"><img src="images/img_29.jpg"/></div>
      <div class="col-md-1 no animated" id="part6"><p style="-webkit-writing-mode:vertical-lr ;writing-mode: lr-bt; margin-left: 50px;margin-top: 20px;">像是春光，火焰，像是热情。</p></div>
      <div class="col-md-6 no animated" id="part7"><img src="images/img_36.jpg"/></div>

    </div>
    <div class="row">
      <div class="col-md-4 no animated col-md-offset-1" id="part8"><img src="images/img_33.jpg"/><h3></h3></div>
      <div class="col-md-2 no animated" id="part9"><p>如果雨之後还是雨<br>如果忧伤之後仍是忧伤<br>请让我从容面对这别离之後的<br>别离 微笑地继续去寻找<br>一个不可能再出现的 你</p></div>
      <div class="col-md-2 no animated" id="part10"><img src="images/img_23.jpg"/></div>
      <div class="col-md-2 no animated" id="part11"><p>假如我来世上一遭<br>只为与你相聚一次<br>只为了亿万光年里的那一刹那<br>一刹那里所有的甜蜜与悲凄<br>那麽 就让一切该发生的<br>都在瞬间出现吧<br>我俯首感谢所有星球的相助<br>让我与你相遇<br>与你别离<br>完成了上帝所作的一首诗<br>然後 再缓缓地老去</p></div>
      <div class="col-md-2 no animated col-md-offset-1" id="part12"><img src="images/img_28.jpg"/></div>
      <div class="col-md-2 no animated" id="part13"><p>我已无诗<br>世间也再无飞花 无细雨<br>尘封的四季啊<br>请别哭泣<br>万般 万般的无奈<br>爱的馀烬已熄<br>重回人间<br>猛然醒觉那千条百条 都是<br>已知的路 已了然的轨迹<br>跟著人群走下去吧<br>就这样微笑地走到尽头<br>我柔弱的心啊<br>请试著去忘记 请千万千万<br>别再哭泣</p></div>
      <div class="col-md-4 no animated" id="part14"><img src="images/img_43.png"/></div>
      <div class="col-md-2 no animated" id="part15"><p>溪水急著要流向海洋<br>浪潮却渴望重回土地<br>在绿树白花的篱前<br>曾那样轻易地挥手道别<br>而沧桑了二十年後<br>我们的魂魄却夜夜归来<br>微风拂过时<br>便化作满园的郁香</p></div>
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
        <li><a href="#"><img src="images/weibo.png"></a></li>
      </ul>
      </p>
    </div>
  </div>
</div>

<script src="js/home.js"></script>
<script src="js/nav.js"></script>
</body>
</html>