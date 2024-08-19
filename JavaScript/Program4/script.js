
function getInputValues() {
    const num1 = parseInt(document.getElementById('num1').value, 10);
    const num2 = parseInt(document.getElementById('num2').value, 10);
    
    if (isNaN(num1) || isNaN(num2)) {
        return { num1: null, num2: null };
    }
    
    return { num1, num2 };
}

function calculate(operation) {
    const { num1, num2 } = getInputValues();

    if (num1 === null || num2 === null) {
        document.getElementById('output').textContent = 'Please enter valid integers';
        return;
    }

    let result;
    switch(operation) {
        case 'add':
            result = num1 + num2;
            break;
        case 'sub':
            result = num1 - num2;
            break;
        case 'div':
            if (num2 !== 0) {
                result = num1 / num2;
            } else {
                result = 'Error: Division by zero';
            }
            break;
        case 'mult':
            result = num1 * num2;
            break;
        default:
            result = 'Invalid operation';
    }
    document.getElementById('output').textContent = result;
}

const body = document.getElementById('main');

let colors = ['#FF6633', '#FFB399', '#FF33FF', '#FFFF99', '#00B3E6', 
    '#E6B333', '#3366E6', '#999966', '#99FF99', '#B34D4D',
    '#80B300', '#809900', '#E6B3B3', '#6680B3', '#66991A', 
    '#FF99E6', '#CCFF1A', '#FF1A66', '#E6331A', '#33FFCC',
    '#66994D', '#B366CC', '#4D8000', '#B33300', '#CC80CC', 
    '#66664D', '#991AFF', '#E666FF', '#4DB3FF', '#1AB399',
    '#E666B3', '#33991A', '#CC9999', '#B3B31A', '#00E680', 
    '#4D8066', '#809980', '#E6FF80', '#1AFF33', '#999933',
    '#FF3380', '#CCCC00', '#66E64D', '#4D80CC', '#9900B3', 
    '#E64D66', '#4DB380', '#FF4D4D', '#99E6E6', '#6666FF'];

function bg() {
    let index = Math.floor(Math.random() * colors.length);
    body.style.backgroundColor=colors[index];
}
