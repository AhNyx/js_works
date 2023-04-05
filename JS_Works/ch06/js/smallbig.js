//이미지 바꾸기
let bigPic = document.getElementById("cup");
let smallPics = document.querySelectorAll(".small");
console.log(smallPics.length);

// smallPics[0].onclick = showBig;

for (let i = 0; i < smallPics.length; i++) {
  //   smallPics[i].onclick = showBig;
  smallPics[i].addEventListener("click", showBig);
}
function showBig() {
  console.log(this.src);
  bigPic.setAttribute("src", this.src);
}
