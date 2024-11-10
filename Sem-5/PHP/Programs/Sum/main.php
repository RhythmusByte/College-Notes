<?php
if (isset($_GET['num1']) && isset($_GET['num2'])) {
    $num1 = trim($_GET['num1']);
    $num2 = trim($_GET['num2']);

    if (is_numeric($num1) && is_numeric($num2)) {
        $sum = $num1 + $num2;
        echo "The sum of $num1 and $num2 is: $sum";
    } else {
        echo "Please enter valid numbers.";
    }
} else {
    echo "Please enter both numbers.";
}
?>
