function checkNumberType() {
    let number = parseInt(window.prompt("Enter a number:"));
    
    function sumOfDivisors(num) {
        let sum = 0;
        for (let i = 1; i <= num / 2; i++) {
            if (num % i === 0) {
                sum += i;
            }
        }
        return sum;
    }

    let sum = sumOfDivisors(number);

    let result;
    if (sum === number) {
        result = number + " is a perfect number.";
    } else if (sum > number) {
        result = number + " is an abundant number.";
    } else {
        result = number + " is a deficient number.";
    }
    window.alert(result);
}

checkNumberType();
