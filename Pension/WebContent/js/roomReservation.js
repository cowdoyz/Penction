function moveResCal() {
    let date = new Date();
    let today = date.getFullYear() + '-0' + (date.getMonth() + 1) + '-' + date.getDate();
    console.log(today);

    location.href = "/Pension/moveContoller?cmd=moveRES&today=" + today;

}
function moveRES(f)
{
	console.log("함수작동");
	
	let date = document.getElementById("cal_info").innerHTML;
	document.querySelector(".resDate").value = date;
	/*for(var i =0 ; i < 4 ;i++)
	{
		if(document.forms[0].checkRES[i].checked)
		{	*/
			console.log("동기 무브")
			f.action = "/Pension/resSynchronous";
			f.submit();
	/*	}
		
	}*/		
}

document.querySelectorAll("#cancel_btn").forEach((btn, index) => {
	btn.addEventListener("click", () => {
	        console.log(index);	
			let qnum = document.querySelectorAll('#qlistnum');
			console.log(qnum[index].value);
			if(confirm("취소 요청을 보내시겠습니까?"))
			{		
				location.href = '/Pension/resSynchronous?cmd=cancel_req&resNum=' +qnum[index].value;
			}
			else
			{
				return false;
			}
	    });
	});
document.querySelectorAll("#select_state").forEach((sel,index) => {
	sel.addEventListener("change", () => {
			console.log(sel);
			console.log(sel.value);
			let q_num = document.querySelectorAll('#res_num');
			if(sel.value == '예약완료')
			{
					
				if(confirm("예약을 승인 하시겠습니까?"))
				{
					location.href = '/Pension/resSynchronous?cmd=enter_res&resNum='+q_num[index].value;
					console.log(q_num[index].value);
				}
				else
				{
					
				} 
			}
			
			if(sel.value == '예약가능')
			{
				console.log(q_num[index].value)
				if(confirm("예약을 취소 하시겠습니까?"))
				{
					location.href = '/Pension/resSynchronous?cmd=res_cancel&resNum='+q_num[index].value;
				}
				else 
				{
					
				} 
				
			}
			
		});
});		
		

function moveAdimLogin()
{
	location.href = "/Pension/moveContoller?cmd=move_Al_Login";
}

document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        themeSystem: 'bootstrap5',
        height: '100%',
        headerToolbar: {
            left: 'prev,next',
            center: 'title',
            right: ''
        },
        initialDate: '2024-01-10',
        events: [{
                title: '예약하기',
                start: '2024-01-01',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기2',
                start: '2024-01-02',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-03',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-04',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-05',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-06',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-07',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-08',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-09',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-10',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-11',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-12',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-13',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-14',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-15',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-16',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-17',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-18',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-19',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-20',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-21',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-22',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-23',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-24',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-25',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-26',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-27',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-28',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-29',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-30',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },
            {
                title: '예약하기',
                start: '2024-01-31',
                url: '/Pension/resContoller?cmd=resDay&day=',
            },

        ],
        eventClick: function(info) {
            info.jsEvent.preventDefault();
            money = 0;
            document.querySelector(".totalPriceText").innerHTML = money + "원";
            selectedParkIndex = 0;
			selectedPersonIndex = 0;
            console.log(info.event.url);
            console.log(info.event.startStr);
            let day = info.event.startStr;
            fetch(info.event.url + day)
                .then(response => response.json())
                .then(json => {
                    console.log(JSON.parse(json.result)[0]);
                    console.log(JSON.parse(json.result)[1]);
                    console.log(JSON.parse(json.result)[2]);
                    console.log(JSON.parse(json.result)[3]);
                    let jcl = JSON.parse(json.result);
					console.log(jcl[0]);
					console.log(jcl[0].room_number);
                    console.log(myTime(jcl[0].reservation_date));
                    let test = document.getElementById("cal_info");
                    test.innerHTML = myTime(jcl[0].reservation_date);
                    let msg = "";
                    let input = document.getElementById("input_res");
                    if (jcl != null) {
                        for (var j in jcl) {
                            msg += "<div class='res_main'>";
                            msg += "<div class='res_check'>";
                            msg += "<input class='form-check-input checksize' type='checkbox' value='"+jcl[j].room_number +
								   "'name='checkRES'";
					        if(jcl[j].reservation_State == '예약대기'|| jcl[j].reservation_State == '예약완료') msg += "disabled"; 
                            msg += "></div><div class='res_img'";
							    	if(jcl[j].reservation_State == '예약대기'|| jcl[j].reservation_State == '예약완료') msg += "style='opacity: 0.5'";
                            msg += "><img src='images/room" + jcl[j].room_number + ".jpg' class='img-thumbnail'><div>";
                            msg += "<table>";
                                if(jcl[j].reservation_State == '예약대기'|| jcl[j].reservation_State == '예약완료') msg += "<tr><td class='font_stateR'>" + jcl[j].reservation_State + "</td></tr>";
								else msg += "<tr><td class='font_stateG'>" + jcl[j].reservation_State + "</td></tr>";
                            msg +="<tr><td>" + jcl[j].room_name + "</td></tr>" +
                                "<tr><td>최대 (" + jcl[j].room_maxperson + ")명</td></tr>" +
                                "<tr><td>" + jcl[j].room_price + "</td></tr></table>";
                            msg += "</div></div><div class='gura'></div><div>";
                            msg += "<label for='form-select'>기 간</label>" +
                                "<select class='form-select park' name='park_"+jcl[j].room_number+"'";
								if(jcl[j].reservation_State == '예약대기'|| jcl[j].reservation_State == '예약완료') msg += "disabled"; 	
                            msg +="><option value='1'>1박</option> " +
                                "<option value='2'>2박</option> " +
                                "<option value='3'>3박</option> " +
                                "<option value='4'>4박</option> " +
                                "<option value='5'>5박</option> " +
                                "</select> " +
                                "</div> " +
                                "<div class='padding_sel'> " +
                                "<label for='form-select'>인 원</label> " +
                                "<select class='form-select person' name='person_"+jcl[j].room_number+"'";
		 					 if(jcl[j].reservation_State == '예약대기'|| jcl[j].reservation_State == '예약완료') msg += "disabled"; 	
                             msg +="><option value='1'>1명</option> " +
                                "<option value='2'>2명</option> " +
                                "<option value='3'>3명</option> " +
                                "<option value='4'>4명</option> " +
                                "</select> " +
                                "</div> " +
                                "<div> " +
                                "<p class='money'>" + jcl[j].room_price + "</p>" +
                                "</div> " +
                                "</div> " +
                                "<hr></div>";

                        }
                        input.innerHTML = msg;
                        if (!msg) {
                            msg += "<h1> 조회 실패 </h1>";
                            input.innerHTML = msg;
                        }

						// 모든 체크박스의 변경을 감지하는 이벤트 
						document.querySelectorAll(".form-check-input").forEach((checkbox, index) => {
						    checkbox.addEventListener("change", () => {
						        console.log("체크인덱스" + index);
						        updateTotalMoney();
						        // 모든 체크박스가 해제된 경우
						        if (document.querySelectorAll(".form-check-input:checked").length === 0) {
						            money = 0;
						            document.querySelector(".totalPriceText").innerHTML = money + "원";
						            document.querySelector(".revBtn").style.display = 'none';
						        }
						    });
						});
						// 숙박 선택 요소에 대한 이벤트 
						document.querySelectorAll(".park").forEach((park, index) => {
						    park.addEventListener("change", () => {
						        selectedParkIndex = index;
						        console.log(index);
						        updateMoney(index);
						    });
						});
						// 인원 수 선택 요소에 대한 이벤트 
						document.querySelectorAll(".person").forEach((person, index) => {
						    person.addEventListener("change", () => {
						        selectedPersonIndex = index;
						        console.log(index);
						        updateMoney(index);
						    });
						});
						/*function moveRES(f)
						{
							console.log("함수작동");
							document.querySelector(".resDate").value = date = document.getElementById("cal_info").innerHTML;
							for(var i =0 ; i < 4 ;i++)
							{
								if(document.forms[0].checkRES[i].checked)
								{	
									console.log("비동기 무브")
									f.action = "Pension/resSynchronous";
									f.submit();
								}
								
							}
						}*/
						document.getElementById("sbtn").addEventListener('click', ()=>
						{
								document.getElementById("sbtn").preventDefault;
								console.log("비동기버튼 입력");
								moveRES(document.forms[0]);
          			    })
						
                    }


                })
                .catch(err => console.log(err));
        }

    });
    calendar.render();
});

const moneyElements = document.querySelectorAll(".money");
const parkElements = document.querySelectorAll(".park");
const personElements = document.querySelectorAll(".person");

const roomMoneyValues = [100000, 200000, 150000, 250000];
const personMoneyValues = [0, 0, 0, 10000, 20000];

let selectedParkIndex = 0;
let selectedPersonIndex = 0;
let money = 0;


function updateMoney(index) {
    const parkIndex = selectedParkIndex;
    const personIndex = selectedPersonIndex;
	console.log("pi" + parkIndex );
	console.log("pei" + personIndex);
    const parkMultiplier = parseInt(document.querySelectorAll(".park")[parkIndex].value) || 1;
    console.log("pm"+parkMultiplier);
    const personMultiplier = parseInt(document.querySelectorAll(".person")[personIndex].value) || 0;
    console.log("pem"+personMultiplier)
    /*const parkMultiplier = parseInt(document.querySelectorAll(".park")[parkIndex].value) || 1;
    const personMultiplier = parseInt(document.querySelectorAll(".person")[personIndex].value) || 0;*/

    const newValue =
        (roomMoneyValues[parkIndex] * parkMultiplier) + personMoneyValues[personMultiplier];
    	document.querySelectorAll(".money")[index].innerHTML = newValue;
    updateTotalMoney();

}

function updateTotalMoney() {
    money = 0;

    document.querySelectorAll(".form-check-input").forEach((check, index) => {
        if (check.checked) {
            money += parseInt(document.querySelectorAll(".money")[index].innerHTML);
            document.querySelector(".revBtn").style.display = money > 0 ? 'block' : 'none';
        }
    });
    document.querySelector(".totalPriceText").innerHTML = money.toLocaleString('ko-KR')+'원';
	document.querySelector(".totalPrice").value = money;

}
// 모든 체크박스의 변경을 감지하는 이벤트 
document.querySelectorAll(".form-check-input").forEach((checkbox, index) => {
    checkbox.addEventListener("change", () => {
        console.log("체크인덱스" + index);
        updateTotalMoney();
        // 모든 체크박스가 해제된 경우
        if (document.querySelectorAll(".form-check-input:checked").length === 0) {
            money = 0;
            document.querySelector(".totalPriceText").innerHTML = money + "원";
            document.querySelector(".revBtn").style.display = 'none';
        }
    });
});
// 숙박 선택 요소에 대한 이벤트 
parkElements.forEach((park, index) => {
    park.addEventListener("change", () => {
        selectedParkIndex = index;
        console.log("함수로 들어가는 인덱스"+index);
        updateMoney(index);
    });
});
// 인원 수 선택 요소에 대한 이벤트 
personElements.forEach((person, index) => {
    person.addEventListener("change", () => {
        selectedPersonIndex = index;
        console.log(index);
        updateMoney(index);
    });
});

function myTime(unixTimeStamp) {
    let myDate = new Date(unixTimeStamp);
    let date;
	// 10월부터는 생각안한 코드 나중에고치자 중요순위낮음
	if(myDate.getDate() < 10)
	{
	 console.log(myDate.getDate());
   	 date = myDate.getFullYear() + "-0" + (myDate.getMonth() + 1) + "-0" + myDate.getDate();
	}
	else
	{
	 console.log(myDate.getDate());
   	 date = myDate.getFullYear() + "-0" + (myDate.getMonth() + 1) + "-" + myDate.getDate();
	}

    return date;
}