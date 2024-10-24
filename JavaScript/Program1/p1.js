let num = parseInt(prompt("Enter the number : "))

let i,sum=0;

for(i=1;i<num;i++){
    if(num%i==0){
        sum+=i;
    }
}

if(sum==num){
    result="Perfect";
}else if(sum>num){
    result="Abundant";
}else{
    result="Deficient";
}


alert(result);