// 변수의 값을 교환하기
let x = 0, y = 1;

let temp;


document.write("교환전<br>");
document.write("x=" + x + ", y=" + y + "<br>");

//교환 처리
temp = x;
x = y;
y = temp;

document.write("교환후<br>");
document.write("x=" + x + ", y=" + y + "<br>");
