//幻灯片自动播放
var slideIndex = 0;
    showSlides(slideIndex);

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("item");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}
    slides[slideIndex-1].style.display = "block";
    setTimeout(showSlides, 1500); // 切换时间为 2 秒
}

//动画效果
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>110){
            $('#part1').addClass(" fadeInLeft");
            $('#part1').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>170){
            $('#part2').addClass(" fadeInDown")
            $('#part2').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>230){
            $('#part3').addClass(" fadeInRight")
            $('#part3').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>300){
            $('#part4').addClass(" fadeInRight")
            $('#part4').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>410){
            $('#part5').addClass(" fadeInUp")
            $('#part5').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>420){
            $('#part6').addClass(" fadeInUp")
            $('#part6').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>580){
            $('#part7').addClass(" fadeInUp")
            $('#part7').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>700){
            $('#part8').addClass(" fadeInLeft")
            $('#part8').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>700){
            $('#part9').addClass(" fadeInUp")
            $('#part9').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>700){
            $('#part10').addClass(" fadeInRight")
            $('#part10').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>700){
            $('#part11').addClass(" fadeInUp")
            $('#part11').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>1000){
            $('#part12').addClass(" fadeInLeft")
            $('#part12').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>1000){
            $('#part13').addClass(" fadeInUp")
            $('#part13').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>1000){
            $('#part14').addClass(" fadeInRight")
            $('#part14').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>1000){
            $('#part15').addClass(" fadeInUp")
            $('#part15').removeClass(" no");

        }
    })
})