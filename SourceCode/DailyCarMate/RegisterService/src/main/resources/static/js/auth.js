function register()
{
var name=document.getElementById("name").value;
var email=document.getElementById("userEmail").value;
var mobile=document.getElementById("mobile").value;
var dob=document.getElementById("dob").value;
var pwd=document.getElementById("userPassword").value;
var cpwd=document.getElementById("confirmPassword").value;
var data={"name":name,"email":email,"mobile":mobile,"dob":dob,"password":pwd};
var json=JSON.stringify(data);
$.ajax({
	url: "/user/register",
	method:"post",
	contentType:"application/json",
	data:json,
	success: function(data){
    alert("Welcome "+name+" Registered Succesfully");
}});
}