function validate() {
    let p1 = document.getElementById("p1").value;
    let p2 = document.getElementById("p2").value;

    if (( p1.length == p2.length )&& p2.length < 8) {
        alert("The password length must be greater than 8 ");
    }
    else if (p1 != p2) {
        alert("the password is not matching.");
    }else{
        alert("the Password is Valid.")
    }
}
