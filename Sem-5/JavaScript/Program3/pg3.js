
const calculate = (operation) => {
    let n1= parseFloat(document.getElementById("num1").value);
    let n2= parseFloat(document.getElementById("num2").value);
    let result;
    switch(operation){
        case "add": result=n1+n2
        break;
        case "sub": result= n1 - n2; 
        break;
        case "mul": result= n1*n2; 
        break;
        case "div": result= n1/n2; 
        break;
        
    }
    
document.getElementById("result").textContent='Result:' + result;    
}
