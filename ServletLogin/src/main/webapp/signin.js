const name1=document.getElementById('username');
const email=document.getElementById('email');
const p1=document.getElementById('password');
const p2=document.getElementById('cpassword');

const errname=document.getElementById('err_name');
const erremail=document.getElementById('err_email');
const errp1=document.getElementById('err_password');
const errp2=document.getElementById('err_cpassword');

const form=document.querySelector('form');

form.addEventListener('submit' , (e)=>{
	let isvalid=checkInput();
	if(!isvalid){
		e.preventDefault();
	}
});

function checkInput(){
	let valid=true;
	
	const emailCheck = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
	
	if(name1.value.trim()=== ""){
		errname.innerHTML="Name is Required";
		valid=false;
	}
	else{
		errname.innerHTML="";
	}
	
	if(!email.value.match(emailCheck)){
		erremail.innerHTML="Valid Email is Required";
		valid=false;
	}
	else{
		erremail.innerHTML="";
	}
	if(p1.value.trim()===""){
		errp1.innerHTML="Password is Required";
		valid=false;
	}
	else{
		errp1.innerHTML="";
	}
	if(p2.value.trim()===""){
			errp2.innerHTML="Confirm Password is Required";
			valid=false;
	}
	else{
		if(p1.value.trim()===p2.value.trim())
			{
				errp2.innerHTML="";
				
			}
			else{
				errp2.innerHTML="Password Doesn't Match";
				valid=false;
			}
			
	}
	return valid;
		
}