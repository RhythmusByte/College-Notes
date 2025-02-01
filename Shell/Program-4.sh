#!/bin/bash

printf "Enter num1: "
read num1
printf "Enter num2: "
read num2
printf "Enter num3: "
read num3

if [[ $num1 -gt $num2 ]]; then
  if [[ $num1 -gt $num3 ]]; then
    echo "$num1 is greater"
  else
    echo "$num3 is greater"
  fi
elif [[ $num2 -gt $num3 ]]; then
  echo "$num2 is greater"
else
  echo "$num3 is greater"
fi
