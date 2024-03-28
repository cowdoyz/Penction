/**
 * 
 */
const f = document.forms[0];
const id_check = document.getElementById("id_check");
const pw_check = document.getElementById("pw_check");
const name_check = document.getElementById("name_check");
const phone_check = document.getElementById("phone_check");
const emial_check = document.getElementById("email_check");

const regExpId = /^[a-z]+[0-9a-z]{3,12}$/;	// 아이디 검증 정규식
const regExpPw = /^[0-9a-zA-Z]{8,16}$/;		// 비밀번호 검증 정규식
const regPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/ //전화번호 정규식
const regExpName = /^[가-힣a-zA-Z]{2,12}$/;	// 이름 검증 정규식 
const regExpEmail = /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;	// 이메일 검증 정규식

//데이터 검증 완료 함수
function validated(inputTarget, resultState, comment){
	inputTarget.classList.add("is-valid");
	inputTarget.classList.remove("is-invalid");
	if(resultState){
		resultState.classList.add("valid-feedback");
		resultState.classList.remove("invalid-feedback");
		comment ? 
			resultState.innerHTML = comment : 
				resultState.innerHTML = '' ;
	}
}
// 데이터 검증 미완료 함수
function invalidate(inputTarget, resultState, comment){
	inputTarget.classList.remove("is-valid");
	inputTarget.classList.add("is-invalid");
	if(resultState){
		resultState.classList.remove("valid-feedback");
		resultState.classList.add("invalid-feedback");
		comment ? 
			resultState.innerHTML = comment : 
				resultState.innerHTML = '' ;
	}
}
// 검증 스타일 초기화 함수
function Initialization(inputTarget, resultState){
	inputTarget.classList.remove("is-valid");
	inputTarget.classList.remove("is-invalid");
	if(resultState){
		resultState.classList.remove("valid-feedback");
		resultState.classList.remove("invalid-feedback");
		resultState.innerHTML = '';
	}
}

function signUp() 
{
	let targetID = f.ID;
	let targetPW = f.PW;
	let targetNA = f.NAME;
	let targetPH = f.PHONE;
	let targetEM = f.EMAIL;
	if(targetID.value == '')
	{
		invalidate(targetID,id_check,"ID를 입력해주세요.");
		return;
		
	}	
	else if(!regExpId.exec(targetID.value))
	{
		invalidate(targetID,id_check,"올바른 방식으로 입력해주세요.");
		return;
	}
	else if(regExpId.exec(targetID.value))
	{
		Initialization(targetID,id_check);
		validated(targetID,id_check,"정상입니다.");
	}
	if(targetPW.value == '')
	{
		invalidate(targetPW,pw_check,"Password를 입력해주세요.");
		return;
	}	
	else if(!regExpPw.exec(targetPW	.value))
	{
		invalidate(targetPW,pw_check,"올바른 방식으로 입력해주세요.");
		return;
	}
	else if(regExpPw.exec(targetPW.value))
	{
		Initialization(targetPW,pw_check);
		validated(targetPW,pw_check,"정상입니다.");
	}
	if(targetNA.value == '')
	{
		invalidate(targetNA,name_check,"이름을 입력해주세요.");
		return;
	}	
	else if(!regExpName.exec(targetNA.value))
	{
		invalidate(targetNA,name_check,"올바른 방식으로 입력해주세요.");
		return;
	}
	else if(regExpName.exec(targetNA.value))
	{
		Initialization(targetNA,pw_check);
		validated(targetNA,name_check,"정상입니다.");
	}
	if(targetPH.value == '')
	{
		invalidate(targetPH,phone_check,"전화번호를 입력해주세요.");
		return;
	}	
	else if(!regPhone.exec(targetPH.value))
	{
		invalidate(targetPH,phone_check,"올바른 방식으로 입력해주세요.");
		return;
	}
	else if(regPhone.exec(targetPH.value))
	{
		Initialization(targetPH,phone_check);
		validated(targetPH,phone_check,"정상입니다.");
	}
	if(targetEM.value == '')
	{
		invalidate(targetEM,emial_check,"이메일을 입력해주세요.");
		return;
	}	
	else if(!regExpEmail.exec(targetEM.value))
	{
		invalidate(targetEM,emial_check,"올바른 방식으로 입력해주세요.");
		return;
	}
	else if(regExpEmail.exec(targetEM.value))
	{
		Initialization(targetEM,emial_check);
		validated(targetEM,emial_check,"정상입니다.");
	}
	
	join();
}

function join()
{
	console.log("f"+f)
	let formData = new FormData(f);
	console.log(formData);
	
	let jsonData = JSON.stringify(Object.fromEntries(formData.entries()));
	console.log(jsonData);
	fetch('/Pension/SignContoller',
	{
		method : 'post',
		body : 	jsonData,
		headers : {'Content-type': 'application/json; charset=UTF-8'}
	})
	.then( response => response.json() )
	.then( json => 
			{
				console.log(json.signupResult);
				console.log(typeof json.signupResult);
								
				if(json.signupResult == 1)
				{
					alert("가입 성공");
					mainMove();
				}
				else
				{
					alert("가입 실패");
				}
				
			})
	.catch( err => 
			{
				// 에러 처리
			    console.log('Fetch error:', err);
			    // 에러 메시지 출력
			    console.log('Error message:', err.message);
			});
	
}

function mainMove()
{
	location.href = 'moveContoller?cmd=moveMain';
}










