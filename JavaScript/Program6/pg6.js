
const contain = (str)=> (str.includes('@') && str.includes('.') )
const beforeAt = (str)=> {
    let pAt = str.indexOf('@');
    return str.length -1 != pAt && pAt != 0;
}
const beforeDot = (str)=> {
    let pDot = str.indexOf('.');
    return str.length -1 !=pDot && str.length -2;
}



function validate(){
    let mail = document.getElementById("email").value;
    if(contain(mail)){
        if((beforeAt(mail))){
            if(beforeDot(mail)){
                alert("Email is valid!")
            }else{
                alert("Email is not valid! \n There must be at least two characters after . (dot)")
            }
        }else{
            alert("Email is not valid! \n There must be at least one character before and after the @")
        }

    }else{
        alert("Email is not valid! \n Mail id must contain the @ and . character")
    }
    
    
}