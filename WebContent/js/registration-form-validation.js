function formValidation() {
	var fname = document.getElementById(firstname);
	var mname = document.getElementById(middlename);
	var lname = document.getElementById(lastname);
	var uemail = document.getElementById(email);
	var uphone = document.getElementById(phone);
	var ucity = document.getElementById(city);
	var ucountry = document.getElementById(country);
	var upincode = document.getElementById(pincode);

	if (allLetter(fname)) {
		if (allLetter(mname)) {
			if (allLetter(lname)) {
				if (ValidateEmail(uemail)) {
					if (allnumeric(uphone)) {
						if (allLetter(ucity)) {
							if (countryselect(ucountry)) {
								if (allnumeric(upincode)) {

								}
							}
						}
					}
				}
			}
		}
	}
	return false;

}
function allLetter(uname) {
	var letters = /^[A-Za-z]+$/;
	if (uname.value.match(letters)) {
		return true;
	} else {
		alert('Username must have alphabet characters only');
		uname.focus();
		return false;
	}
}

function alphanumeric(uadd) {
	var letters = /^[0-9a-zA-Z]+$/;
	if (uadd.value.match(letters)) {
		return true;
	} else {
		alert('User address must have alphanumeric characters only');
		uadd.focus();
		return false;
	}
}
function countryselect(ucountry) {
	if (ucountry.value == "Default") {
		alert('Select your country from the list');
		ucountry.focus();
		return false;
	} else {
		return true;
	}
}
function allnumeric(uzip) {
	var numbers = /^[0-9]+$/;
	if (uzip.value.match(numbers)) {
		return true;
	} else {
		alert('Field must have numeric characters only');
		uzip.focus();
		return false;
	}
}
function ValidateEmail(uemail) {
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (uemail.value.match(mailformat)) {
		return true;
	} else {
		alert("You have entered an invalid email address!");
		uemail.focus();
		return false;
	}

}

function alphanumeric(uadd) {
	var letters = /^[0-9a-zA-Z]+$/;
	if (uadd.value.match(letters)) {
		return true;
	} else {
		alert('User address must have alphanumeric characters only');
		uadd.focus();
		return false;
	}
}
function countryselect(ucountry) {
	if (ucountry.value == "Default") {
		alert('Select your country from the list');
		ucountry.focus();
		return false;
	} else {
		return true;
	}
}
function allnumeric(uzip) {
	var numbers = /^[0-9]+$/;
	if (uzip.value.match(numbers)) {
		return true;
	} else {
		alert('Field must have numeric characters only');
		uzip.focus();
		return false;
	}
}
function ValidateEmail(uemail) {
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if (uemail.value.match(mailformat)) {
		return true;
	} else {
		alert("You have entered an invalid email address!");
		uemail.focus();
		return false;
	}

}
