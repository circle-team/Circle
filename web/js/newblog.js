var blog_ok;
var blog_var;

function on_blog() {
    var comment = document.getElementById("new_blog").value;
    if (!comment) { //comment.value值为空
        document.getElementById("alert_win2").style.display = "";
        document.getElementById("alert2").innerHTML = "请输入评论！";
    } else if (comment.length > 20 || comment.length < 2) {
        document.getElementById("alert_win2").style.display = "";
        document.getElementById("alert2").innerHTML = "评论请输入6-20位字符";
    } else {
        document.getElementById("alert_win2").style.display = "none";
        blog_var = comment;
        blog_ok = "ok";
    }
}

function submit_blog() {
    if (blog_ok != "ok") {
        alert("请按要求填写评论");
        return false;
    }
}