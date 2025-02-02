#!/bin/bash

printf "Enter base: "
read base
printf "Enter exponent: "
read exp

result=$(echo "$base^$exp" | bc)
echo "Result: $result"
