// 이미지 마우스 이벤트
let pic = document.getElementById('pic')
pic.onmouseover = changePic;
pic.onmouseout = originPic
function changePic(){
    pic.src = "../static/coffee-gray.jpg";
}
    function originPic(){
    pic.src = "../static/coffee-blue.jpg";
}