var comment_ok;
var comment_var;

function on_comment() {
    var comment = document.getElementById("comment").value;
    if (!comment) { //comment.value值为空
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "请输入评论！";
    } else if (comment.length > 20 || comment.length < 2)//用户框value值不为空
    {
        document.getElementById("alert_win").style.display = "";
        document.getElementById("alert").innerHTML = "评论请输入6-20位字符";
    } else {
        document.getElementById("alert_win").style.display = "none";
        comment_var = comment;
        comment_ok = "ok";
    }
}

function submit_comment() {
    if (comment_ok != "ok") { //用户框value值和密码框value值都为空
        alert("请按要求填写评论");
        return false;
    }
}