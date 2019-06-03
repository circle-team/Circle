// 导航栏动画效果
var isAnimated = false;
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 150) {
            $(".box1").addClass("box2");
            $(".box2").removeClass("box1");
            if (!isAnimated) {
                $(".navbar").css("top", "-60px");
                $(".navbar").animate({"top": "0px"}, 1000);
                isAnimated = true;
            }
        } else {
            isAnimated = false;
            $(".box1").removeClass("box2");
            $(".box2").addClass("box1");
        }
    })
})
// 用户弹窗
var oDiv1 = document.getElementById('user');
var oDiv2 = document.getElementById('userText');
document.onclick = function (e) {
    if (!oDiv1.contains(e.target)) {
        oDiv2.style.display = "none";
    }
}
oDiv1.onmouseover = function () {
    oDiv2.style.display = "block";
}
oDiv1.onmouseout = function () {
    oDiv2.style.display = "none";
}

//遮罩窗体
// var modal = document.getElementById("myModal");
// var btn = document.getElementById("logo");
// var span = document.getElementsByClassName("close")[0];
//
// btn.onclick = function() {
//     modal.style.display = "block";
// }
//
// span.onclick = function() {
//     modal.style.display = "none";
// }
//
// window.onclick = function(event) {
//     if (event.target == modal) {
//         modal.style.display = "none";
//     }
// }

//动画效果
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 110) {
            $('#part1').addClass(" fadeInLeft");
            $('#part1').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 170) {
            $('#part2').addClass(" fadeInDown")
            $('#part2').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 230) {
            $('#part3').addClass(" fadeInRight")
            $('#part3').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 300) {
            $('#part4').addClass(" fadeInRight")
            $('#part4').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 410) {
            $('#part5').addClass(" fadeInUp")
            $('#part5').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 420) {
            $('#part6').addClass(" fadeInUp")
            $('#part6').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 580) {
            $('#part7').addClass(" fadeInUp")
            $('#part7').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 700) {
            $('#part8').addClass(" fadeInLeft")
            $('#part8').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 700) {
            $('#part9').addClass(" fadeInUp")
            $('#part9').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 700) {
            $('#part10').addClass(" fadeInRight")
            $('#part10').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 700) {
            $('#part11').addClass(" fadeInUp")
            $('#part11').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 1200) {
            $('#part12').addClass(" fadeInLeft")
            $('#part12').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 1200) {
            $('#part13').addClass(" fadeInUp")
            $('#part13').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 1200) {
            $('#part14').addClass(" fadeInRight")
            $('#part14').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll", function () {
        if ($(this).scrollTop() > 1200) {
            $('#part15').addClass(" fadeInUp")
            $('#part15').removeClass(" no");

        }
    })
})