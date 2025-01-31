
let start = prompt("Starting Year : ");
let end = prompt("Ending Year : ");
let years =[];

function find(start,end){
    for(start;start<=end;start++){
        year = new Date(start,0,1)
        if (year.getDay() == 0){
            years.push(year.getFullYear());
        }
    }
    alert(years)
}

find(start,end);

