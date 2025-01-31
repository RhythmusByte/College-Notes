#!/bin/bash

printf "Enter a number: "
read num 

if (( num % 2 == 0 )); then
  echo "$num is even"
else
  command
  echo "$num is odd"
fi
