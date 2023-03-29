//'y' 키를 누르면 '계속 반복합니다', 'n'키를 누르면 '반복 중단합니다'
// 그 이외의 키는 '키를 잘못 눌렀습니다.'

while(true){
    let key = prompt("계속 반복 할까요?", 'y/n');

    if(key == 'y' || key == 'Y'){
        window.alert("계속 반복합니다.");
    }
    else if(key == 'n' || key == 'N'){
        window.alert("반복 중단합니다.");
        break;
    }
    else{
        window.alert("키를 잘못 눌렀습니다.");
    }
}
document.write("프로그램 종료!!");