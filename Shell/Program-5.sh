#!/bin/bash

printf "Enter num1: "
read num1
printf "Enter num2: "
read num2
printf "Enter num3: "
read num3

mean=$(echo "scale=2; ($num1 + $num2 + $num3) / 3" | bc)

sd=$(echo "scale=2; sqrt((($num1 - $mean)^2 + ($num2 - $mean)^2 + ($num3 - $mean)^2) / 3)" | bc -l)

echo "Mean: $mean"
echo "Standard Deviation: $sd"
