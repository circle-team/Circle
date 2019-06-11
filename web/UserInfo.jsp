<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>asd</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css">
    <link rel="stylesheet" href="css/nav.css">
    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/nav.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
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
                    <a href="#"><img src="images/personal.png"/></a>
                    <a href="UserBlogs.jsp"><img src="images/information.png"/></a>
                    <a href="UserCircle.jsp"><img src="images/blog.png"/></a>
                    <a href="UserInfo.jsp" id="user"><img src="images/defult_uiImge.png"/></a>
                </div>
            </nav>
        </div>

    <div style="height:100px;width: auto">

    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-10 column">
                    <div class="row clearfix">
                        <form role="form" action="userinf" method="post">
                            <div class="col-md-4 column">
                                <img height="160" width="160" src="images/img_10.jpg" alt="">
                                <br>
                                <div class="form-group">
                                    <label for="image" class="btn btn-default">更换头像</label>
                                    <input name="image" id="image" type="file" style="display:none">
<%--                                    <img src="/upload/kids.jpg" alt="">--%>
                                    <p class="help-block">
                                        Example block-level help text here.
                                    </p>
                                    <span id="addon55" value="">your  id:</span>
                                    <input type="" class="form-control" aria-describedby="addon1" name="id" id="id"
                                           value="${sessionScope.userinf.getUid()}" disabled/>

                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon1" value="">姓名</span>
                                    <input type="text" class="form-control" aria-describedby="addon1" name="name"
                                           id="name" value="${sessionScope.userinf.getUname()}"
                                           hidden="{$user.getname()}"/>
                                </div>
                                <div class="form-group input-group col-md-6 column">
                                    <span class="input-group-addon" id="addon2">性别</span>
                                    <select class="form-control" id="gender" aria-describedby="addon2" name="gender">
                                        <option value="男">男</option>
                                        <option value="不透露">不透露</option>
                                        <option value="女">女</option>
                                    </select>
                                    <input type="hidden" id="gender1" value="${sessionScope.userinf.getUgender()}">
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon3">联系方式</span>
                                    <input type="text" class="form-control" aria-describedby="addon3" name="contact"
                                           id="contact" value="${sessionScope.userinf.getUcontact()}"/>
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon4">Email</span>
                                    <input type="email" class="form-control" aria-describedby="addon4" name="email"
                                           id="email" value="${sessionScope.userinf.getUemail()}"/>
                                </div>
                            </div>
                            <div class="col-md-2 column">
                            </div>
                            <div class="col-md-4 column">
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon5">身份证号码</span>
                                    <input type="text" class="form-control" aria-describedby="addon5"
                                           name="identityNumber" id="identityNumber"
                                           value="${sessionScope.userinf.getUidentityNumber()}"/>
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon6">爱好</span>
                                    <input type="text" class="form-control" aria-describedby="addon6" name="hobby"
                                           id="hobby" value="${sessionScope.userinf.getUhobby()}"/>
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon7">地址</span>
                                    <input type="text" class="form-control" aria-describedby="addon7" name="address"
                                           id="pschool" value="${sessionScope.userinf.getUaddress()}"/>
                                </div>
                                <div class="form-group input-group col-md-6 column">
                                    <span class="input-group-addon" id="addon8">年龄</span>
                                    <input type="text" class="form-control" aria-describedby="addon8" name="age"
                                           id="age" value="${sessionScope.userinf.getUage()}"/>
                                </div>
<%--                                <div class="form-group input-group">--%>
<%--                                    <span class="input-group-addon" id="addon9">初中学校</span>--%>
<%--                                    <input type="text" class="form-control" aria-describedby="addon9" name="mschool"--%>
<%--                                           id="mschool"/>--%>
<%--                                </div>--%>
<%--                                <div class="form-group input-group col-md-6 column">--%>
<%--                                    <span class="input-group-addon" id="addon10">初中年级</span>--%>
<%--                                    <input type="text" class="form-control" aria-describedby="addon10" name="mgrade"--%>
<%--                                           id="mgrade"/>--%>
<%--                                </div>--%>
<%--                                <div class="form-group input-group">--%>
<%--                                    <span class="input-group-addon" id="addon11">高中学校</span>--%>
<%--                                    <input type="text" class="form-control" aria-describedby="addon11" name="hschool"--%>
<%--                                           id="hschool"/>--%>
<%--                                </div>--%>
<%--                                <div class="form-group input-group col-md-6 column">--%>
<%--                                    <span class="input-group-addon" id="addon12">高中年级</span>--%>
<%--                                    <input type="text" class="form-control" aria-describedby="addon12" name="hgrade"--%>
<%--                                           id="hgrade"/>--%>
<%--                                </div>--%>
                                <div class="form-group input-group">
                                    <span class="input-group-addon" id="addon13">大学学校</span>
                                    <input type="text" class="form-control" aria-describedby="addon13" name="uschool"
                                           id="uschool" value="${sessionScope.userinf.getUschool()}"/>
                                </div>
                                <div class="form-group input-group col-md-6 column">
                                    <span class="input-group-addon" id="addon14">大学年级</span>
                                    <input type="text" class="form-control" aria-describedby="addon14" name="ugrade"
                                           id="ugrade" value="${sessionScope.userinf.getUgrade()}"/>
                                </div>
                                <button type="submit" class="btn btn-default btn-lg">保 存</button>
                            </div>
                        </form>

                    </div>
                </div>
                <div class="col-md-2 column">
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                        <h4>
                            注意!
                        </h4> <strong>Warning!</strong> Best check yo self, you're not looking too good. <a href="#"
                                                                                                            class="alert-link">alert
                        link</a>
                    </div>
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                        <h4>
                            注意!
                        </h4> <strong>Warning!</strong> Best check yo self, you're not looking too good. <a href="#"
                                                                                                            class="alert-link">alert
                        link</a>
                    </div>
                </div>

            </div>
            <button id="follow1" type="button" class="btn btn-default btn-lg">推荐关注</button>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>