// 유효성 검사 여부를 기록할 객체 생성
const checkObj = {
    "memberEmail" : true, // 1) 정규표현식 이메일형식(@) 맞는지 체크 => 2) ajax통신(중복검사)
    "memberPw" : false, // 정규표현식 체크
    "memberPwConfirm" : false, // 비밀번호 일치 
    "memberNickname" : false, 
    // 1) 정규표현식 닉네임형식(영어,숫자,한글 2~10자) 맞는지 체크 => 2) ajax통신(중복검사)
    "memberTel" : false, // 정규표현식 체크
    "sendEmail" : false //
}

const memberEmail = document.getElementById("memberEmail");

// 인증 번호 보내기 

const sendBtn = document.getElementById("sendBtn");
const cMessage = document.getElementById("cMessage");

let checkInterval; // setInterval 을 저장할 변수
let min = 4;
let sec = 59;


sendBtn.addEventListener("click",function(){

    if( checkObj.memberEmail ) {//유효한 이메일이 작성되어 있을때만 메일 보내기

        $.ajax({
            url : "sendEmail", 
            data : {"inputEmail" : memberEmail.value},
            type : "GET",
            success : function(result) {
                console.log("성공");
                console.log(result);
            },
            error : function() {
                console.log("다시");
            }

        });

        // mail 발송 ajax 코드는 동작이 느리다
        // => ajax 코드가 비동기이기 때문에 메일이 보내지는 것을 기다리지 않고
        // 바로 다음 코드 수행!

        // 5분 타이머 
        // setInterval(함수, 지연시간)

        cMessage.innerText = "5:00"; // 초기값 5분
        min = 4;
        sec = 59;

        cMessage.classList.remove("confirm");
        cMessage.classList.remove("error");

        checkInterval = setInterval(function(){
            if(sec<10) sec="0" + sec;
            cMessage.innerText = min + ":" + sec;
            if(Number(sec) === 0){
                min--;
                sec = 59;
            } else {
                sec--;
            } 
            if (min === -1){ // 만료
                cMessage.classList.add("error");
                cMessage.innerText = " 인증 번호가 만료 되었습니다. "
                clearInterval(checkInterval); // checkInterval 반복 지움
            }
        }, 1000); // 1초 지연 후 수행
        alert("인증번호가 발송되었습니다. 이메일 확인")
    }


})

const cNumber = document.getElementById("cNumber");

const cBtn = document.getElementById("cBtn");

cBtn.addEventListener("click", function(){
    if(checkObj.memberEmail) {
        $.ajax({
            url : "CheckNumber", 
            data : {"inputcNumber" : cNumber.value ,"inputEmail" : memberEmail.value },
            type : "GET",
            success : function(result) {
                console.log("성공");
                console.log(result);
            },
            error : function() {
                console.log("다시");
            }
        })




    } else {

    }
})