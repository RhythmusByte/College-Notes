<?php
function reverseString($str) {
    for ($i = 0, $end = strlen($str) - 1; $i < $end; $i++, $end--) {
        $temp = $str[$i];
        $str[$i] = $str[$end];
        $str[$end] = $temp;
    }
    return $str;
}

$original = "Apple";
$reversed = reverseString($original);
echo $reversed;
?>