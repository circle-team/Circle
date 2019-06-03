// 导航栏动画效果
var isAnimated = false;
$(document).ready(function(){
    $(window).on("scroll",function () {
        if ($(this).scrollTop()>150) {
            $(".box1").addClass("box2");
            $(".box2").removeClass("box1");
            if (!isAnimated) {
                $(".navbar").css("top", "-60px");
                $(".navbar").animate({"top": "0px"}, 1000);
                isAnimated = true;
            }
        }else {
            isAnimated = false;
            $(".box1").removeClass("box2");
            $(".box2").addClass("box1");
        }
    })
})