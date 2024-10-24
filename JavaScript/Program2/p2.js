let a = parseInt(prompt("Enter first side: "))
let b = parseInt(prompt("Enter second side: "))
let c = parseInt(prompt("Enter third side: "))

const isTraingle = (a,b,c) =>  (a+b>c && a+c>b && b+c>a);

const typeOfTriangle = (a,b,c) => {
    if((a==b && b==c && a==c)){
        return "Equilateral";
    }
    else if(a==b || b==c || a==c){
        return "Isosceles";
    }
    else {
        return "Scalene";
    }
}
if(isTraingle(a,b,c)){
    const s = (a + b + c) / 2;
    const area = Math.sqrt(s * (s - a) * (s - b) * (s - c))
    alert(`Type of Triangle: ${typeOfTriangle(a, b, c)}\nArea: ${area.toFixed(2)}`);
}else{
    alert("Triangle Formation is not possible");
}
