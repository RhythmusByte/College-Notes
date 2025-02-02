#!/bin/bash

printf "Enter the number: "
read n

a=0
b=1

printf "Fibonacci Series: %d %d " "$a" "$b"

for (( i=3; i<=n; i++ )); do
  fib=$(( a + b ))
  printf "%d " "$fib"
  a=$b
  b=$fib
done

printf "\n"
