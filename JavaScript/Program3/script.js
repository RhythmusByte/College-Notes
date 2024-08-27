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
		document.getElementById('output').textContent =
			'Please enter valid integers';
		return;
	}

	let result;
	switch (operation) {
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
