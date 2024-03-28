function resUp(id,req)
{
	let form1 = document.querySelector('.res_info')
	if(!document.querySelector('.form-check-input').checked)
	{
		alert("약관동의에 체크 해주세요!")
		return false;
		
	}
	let sendData = "ID="+id+"&request="+req;
	form1.action = "resSynchronous?"+sendData;
    form1.submit();

}
	function winOpen()
	{
		let feature = "width=400, height=400,top=100,left=100";
		window.open("terms.jsp","",feature);	
	}
	
	function al_summit(f)
	{
		console.log("fff:"+f);
		if(f.ID.value =='')
		{
			alert("ID를 입력해주세요.")
			return false
		}
		if(f.PWD.value =='')
		{
			alert("PassWord를 입력해주세요.")
			return false
		}
		if(confirm("login 하시겠습니까?"))
		{
			f.submit();
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
		
		
		