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
        if($(this).scrollTop()>1){
            $('#part1').addClass(" fadeInLeft");
            $('#part1').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>100){
            $('#part2').addClass(" fadeInDown")
            $('#part2').removeClass(" no");
        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>200){
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
        if($(this).scrollTop()>600){
            $('#part8').addClass(" fadeInLeft")
            $('#part8').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>600){
            $('#part9').addClass(" fadeInUp")
            $('#part9').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>600){
            $('#part10').addClass(" fadeInRight")
            $('#part10').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>600){
            $('#part11').addClass(" fadeInUp")
            $('#part11').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>900){
            $('#part12').addClass(" fadeInLeft")
            $('#part12').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>900){
            $('#part13').addClass(" fadeInUp")
            $('#part13').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>900){
            $('#part14').addClass(" fadeInRight")
            $('#part14').removeClass(" no");

        }
    })
})
$(document).ready(function () {
    $(window).on("scroll",function () {
        if($(this).scrollTop()>900){
            $('#part15').addClass(" fadeInUp")
            $('#part15').removeClass(" no");

        }
    })
})
var modal2 = document.getElementById('myModal2');

// 获取图片模态框，alt 属性作为图片弹出中文本描述
var img1 = document.getElementsByClassName("myImg")[0];
var img2 = document.getElementsByClassName("myImg")[1];
var img3 = document.getElementsByClassName("myImg")[2];
var img4 = document.getElementsByClassName("myImg")[3];
var modalImg = document.getElementById("img01");
var captionText = document.getElementById("caption");
img1.onclick = function(){
    modal2.style.display = "block";
    modalImg.src = this.src;
    captionText.innerHTML = this.alt;
}
img2.onclick = function(){
    modal2.style.display = "block";
    modalImg.src = this.src;
    captionText.innerHTML = this.alt;
}
img3.onclick = function(){
    modal2.style.display = "block";
    modalImg.src = this.src;
    captionText.innerHTML = this.alt;
}
img4.onclick = function(){
    modal2.style.display = "block";
    modalImg.src = this.src;
    captionText.innerHTML = this.alt;
}

// 获取 <span> 元素，设置关闭模态框按钮
var span = document.getElementsByClassName("close2")[0];

// 点击 <span> 元素上的 (x), 关闭模态框
span.onclick = function() {
    modal2.style.display = "none";
}