const email = document.getElementById('email');
const password = document.getElementById('password');

const erremail = document.getElementById('error_email');
const errpass = document.getElementById('error_password');

const form = document.querySelector('form');

form.addEventListener('submit', (e) => {
    let isValid = checkInput();
    if (!isValid) {
        e.preventDefault();
    }
});

function checkInput() {
    let valid = true;
	const emailCheck = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (!email.value.match(emailCheck)) {
        erremail.innerHTML = "Valid Email is Required";
        valid = false;
    } else {
        erremail.innerHTML = "";
    }
    
    if (password.value.trim() === "") {
        errpass.innerHTML = "Password is Required";
        valid = false;
    } else {
        errpass.innerHTML = "";
    }
    
    return valid;
}
