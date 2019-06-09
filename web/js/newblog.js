var blog_ok;
var blog_var;

function on_blog() {
    var blog = document.getElementById("new_blog").value;
    if (!blog) { //comment.value值为空
        document.getElementById("alert_win2").style.display = "";
        document.getElementById("alert2").innerHTML = "请输入博客内容！";
    } else if (blog.length > 20 || blog.length < 2) {
        document.getElementById("alert_win2").style.display = "";
        document.getElementById("alert2").innerHTML = "评论请输入6-20位字符";
    } else {
        document.getElementById("alert_win2").style.display = "none";
        blog_var = blog;
        blog_ok = "ok";
    }
}

function submit_blog() {
    if (blog_ok != "ok") {
        alert("请按要求填写博客");
        return false;
    }
}

function new_blog() {
    $(".commit-blog").click(function () {
        if (submit_blog()) {
            var uid = '${sessionScope.userinf.getUid()}'
            var text = $("#new-blog-text").val();
            $.ajax({
                type: 'GET',
                url: 'SelfBlogServlet',
                data: {uid: uid,text:text},
                dataType:'json',
                success: function () {
                    alert("push success");
                },
                error: function () {
                    alert("push fail");
                }
            });
        }
    });
}