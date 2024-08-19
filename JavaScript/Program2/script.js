const h1 = document.getElementById('h1');
const p1 = document.getElementById('p1');
const p2 = document.getElementById('p2');

let a = parseInt(prompt('Enter side 1:'));
let b = parseInt(prompt('Enter side 2:'));
let c = parseInt(prompt('Enter side 3:'));

if (a + b > c && b + c > a && a + c > b) {
    let sum = (a + b + c) / 2;
    let area = Math.sqrt(sum * (sum - a) * (sum - b) * (sum - c));

    if (a === b && b === c) {
        p1.textContent = 'It is an equilateral triangle!';
    } else if (a === b || b === c || a === c) {
        p1.textContent = 'It is an isosceles triangle!';
    } else {
        p1.textContent = 'It is a scalene triangle!';
    }

    p2.textContent = 'Area of the triangle is ' + area;
    h1.textContent = 'Triangle can be formed!!';
} else {
    h1.textContent = "Triangle can't be formed!!";
}
