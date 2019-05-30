$(document).ready(function(){
    document.getElementById("alert_win").style.visibility="hidden";
})

var comment_ok;
var comment_var;

function on_comment() {
    var name = document.getElementById("comment").value;
    if (!name) { //comment.value值为空
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "请输入评论！";
    } else if (name.length > 20 || name.length < 2)//用户框value值不为空
    {
        document.getElementById("alert_win").style.visibility="visible";
        document.getElementById("alert").innerHTML= "评论请输入6-20位字符";
    }else{
        document.getElementById("alert_win").style.visibility="hidden";
        comment_var=name;
        comment_ok="ok";
    }
}