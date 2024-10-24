



let sum=0;
let numbers = prompt("Enter the numbers (seperate by space):");
let arr = numbers.split(" ");
for(let i=0;i<arr.length;i++){
    sum+=parseInt(arr[i]);
}
alert(`Sum = ${sum}`);
