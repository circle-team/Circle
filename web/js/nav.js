// 导航栏动画效果
var isAnimated = false;
$(document).ready(function(){
    $(window).on("scroll",function () {
        if ($(this).scrollTop()>190) {
            $(".box1").addClass("box2");
            $(".box2").removeClass("box1");
            $(".mo1").addClass("mo2");
            $(".mo2").removeClass("mo1");
            if (!isAnimated) {
                $(".navbar").css("top", "-60px");
                $(".navbar").animate({"top": "0px"}, 1000);
                isAnimated = true;
            }
        }else {
            isAnimated = false;
            $(".box1").removeClass("box2");
            $(".box2").addClass("box1");
            $(".mo2").removeClass("mo1");
            $(".mo1").addClass("mo2");
        }
    })
})
// 用户信息
var modal = document.getElementById("myModal");
var btn = document.getElementById("user");
var span = document.getElementsByClassName("close")[0];

btn.onmouseover = function() {
    modal.style.display = "block";
}

span.onclick = function() {
    modal.style.display = "none";
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}