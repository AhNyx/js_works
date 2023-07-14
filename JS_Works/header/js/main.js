/*
let toggleBtn = document.querySelector(".navbar_toggle")
let menu = document.querySelector(".navbar_menu")

toggleBtn.addEventListener('click', function(){
    menu.classList.toggle('active');
});
*/

$(function(){
    $(".navbar_toggleBtn").click(function(){
        $('.navbar_menu').toggle("active");
    })

    $(window).resize(function(){
        if(parseInt($('nav').css('width')) > 768){
            $('.navbar_menu').css('display', 'flex');
        };
    });
});

