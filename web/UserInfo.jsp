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
                        <div class="col-md-6 column">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label><input type="email" class="form-control" id="exampleInputEmail1" />
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label><input type="password" class="form-control" id="exampleInputPassword1" />
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
                                    <p class="help-block">
                                        Example block-level help text here.
                                    </p>
                                </div>
                        </div>
                        <div class="col-md-6 column">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label><input type="email" class="form-control" id="exampleInputEmail1" />
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label><input type="password" class="form-control" id="exampleInputPassword1" />
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
                                    <p class="help-block">
                                        Example block-level help text here.
                                    </p>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox" />Check me out</label>
                                </div> <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                        </form>>
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