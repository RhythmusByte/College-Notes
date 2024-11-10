<?php
function check($num) {
    $sum = 0;
    
    for ($i = 1; $i < $num; $i++) {
        if ($num % $i == 0) {
            $sum += $i;
        }
    }
    
    if ($sum == $num) {
        $result = "Perfect";
    } else if ($sum > $num) {
        $result = "Abundant";
    } else {
        $result = "Deficient";
    }
    
    return $result;
}

echo '<form action="" method="post">
        <label>Enter a number: </label>
        <input type="number" name="num">
        <button type="submit">Check</button>
    </form>';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $num = $_POST['num'];
    $ans = check($num);
    echo $ans;
}
?>