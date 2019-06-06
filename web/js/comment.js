var comment_ok;
var comment_var;


/* @author:Romey
 * 动态点赞
 * 此效果包含css3，部分浏览器不兼容（如：IE10以下的版本）
*/


$(function(){
    $(".praise").click(function(){
        var praise_img_block = $(this).find(".praise_img_block");
        var praise_img = $(this).find(".praise_img");
        var praise_txt = $(this).find(".praise_txt");
        var num=parseInt(praise_txt.text());
        if(praise_img.attr("src") == ("images/loved.png")){
            praise_img_block.html("<img src='images/love.png' class='praise_img animated rubberBand' />");
            praise_txt.removeClass("hover");
            num -=1;
            praise_txt.text(num)
        }else{
            praise_img.attr("src","images/loved.png");
            praise_img_block.html("<img src='images/loved.png' class='praise_img animated rubberBand' />");
            praise_txt.addClass("hover");
            num +=1;
            praise_txt.text(num)
        }
    });
});

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

function submitTest() {
    if (comment_ok != "ok") { //用户框value值和密码框value值都为空
        alert("请按要求填写评论");
        return false;
    }
}