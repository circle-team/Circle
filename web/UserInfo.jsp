<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>asd</title>
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
            <div class="row clearfix">
                <div class="col-md-10 column">
                    <div class="row clearfix">
                        <form role="form">
                        <div class="col-md-4 column">
                            <div class="form-group">
                                <label for="image" class="btn btn-default">更换头像</label>
                                <input name="image" id="image" type="file" style="display:none">
                                <p class="help-block">
                                    Example block-level help text here.
                                </p>
                            </div>
                                <div class="form-group">
                                    <label for="name">姓名</label>
                                    <input type="text" class="form-control" name="name" id="name" />
                                </div>
                                <div class="form-group">
                                    <div class="row clearfix">
                                        <div class="col-md-6 column">
                                            <label for="gender"><h5>性别</h5></label>
                                        </div>
                                        <div class="col-md-6 column">
                                            <select class="form-control" id="gender" name="gender">
                                                <option value="男">男</option>
                                                <option value="女">女</option>
                                                <option value="不透露">不透露</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="contact">联系方式</label>
                                    <input type="text"  class="form-control" name="contact" id="contact" />
                                </div>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email"  class="form-control" name="email" id="email" />
                            </div>
                        </div>
                            <div class="col-md-2 column">
                            </div>
                        <div class="col-md-4 column">
                                <div class="form-group">
                                    <label for="identityNumber">身份证号码</label>
                                    <input type="text" class="form-control" name="identityNumber" id="identityNumber" />
                                </div>
                                <div class="form-group">
                                    <label for="hobby">爱好</label>
                                    <input type="password" class="form-control" name="hobby" id="hobby" />
                                </div>
                                <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                        </form>
                    </div>
                </div>
                <div class="col-md-2 column">
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                        <h4>
                            注意!
                        </h4> <strong>Warning!</strong> Best check yo self, you're not looking too good. <a href="#" class="alert-link">alert link</a>
                    </div>
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                        <h4>
                            注意!
                        </h4> <strong>Warning!</strong> Best check yo self, you're not looking too good. <a href="#" class="alert-link">alert link</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>