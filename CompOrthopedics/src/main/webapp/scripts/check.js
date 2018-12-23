/**
 * 
 */
let user = {};

window.onload = function(){
	populateUser();
}

function populateUser(){
	//send a GET request to localhost:7001/SessionMgmtDemo/session
	fetch("http://localhost:7001/CompOrthopedics/session").then(function(response) {
		return response.json();
	}).then(function(data){
		//check whether there was a valid session returned
		//define behavior for no user returned 
		if (data.session === null) {
			console.log("data.session was null");
			window.location = "http://localhost:7001/CompOrthopedics/login";
		} else {
			//define behavior for user returned
			emp = data;
			document.getElementById("empId").innerText = "Employee ID: "+emp.id; // Name from beans
			document.getElementById("manId").innerText = "Manager ID: "+emp.manId;
			document.getElementById("firstname").innerText = "First name: "+emp.firstName;
			document.getElementById("lastname").innerText = "Last name: "+emp.lastName;
			document.getElementById("title").innerText = "title: "+emp.title;
		}
	});
	

	
	
}