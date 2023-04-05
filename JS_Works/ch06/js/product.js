//이미지 바꾸기
let bigPic = document.getElementById("cup");
let smallPics = document.querySelectorAll(".small");

for (let i = 0; i < smallPics.length; i++) {
  smallPics[i].addEventListener("click", function () {
    bigPic.setAttribute("src", this.src);
  });
}

//상세 설명 보기
let view = document.getElementById("view");
let detail = document.getElementById("detail");

//토글 프로그래밍
let sw = true;

view.addEventListener("click", function () {
  if (sw) {
    detail.style.display = "block";
    view.innerText = "상세 설명 닫기";
    sw = false;
  } else {
    detail.style.display = "none";
    view.innerText = "상세 설명 보기";
    sw = true;
  }
});
