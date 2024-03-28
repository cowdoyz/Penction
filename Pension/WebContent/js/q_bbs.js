
function insert_bbsmove()
{
	location.href = "moveContoller?cmd=moveInsertBBS"
}
function insertQBBS(f)
{
	if(f.BBS_PW.value == '' || f.BBS_TITLE.value == '')
	{
		alert("내용을 입력해주세요");
		return false;
	}
	f.action = "bbsContoller";
	f.submit();
}


function movebbslist()
{
	location.href ="/Pension/bbsContoller?cmd=moveQBBS";
}

function aa()
{
	alert("msg");
}

