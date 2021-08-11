window.addEventListener('load', function(){
	alert('load 성공');
	
	clearMessage();
});

function clearMessage(){
	var messages=document.getElementsByClassName('alert-message');
	
	for(var i=0; i<messages.length; i++){
		messages[i].style.display='none';
	}
	
}

function showMessage(inputElement, message){
	var messageElement=inputElement.parentNode.querySelector('span');
	
	messageElement.style.display='inline';
	messageElement.innerText=message;
	
	inputElement.focus();
}