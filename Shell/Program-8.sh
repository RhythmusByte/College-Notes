#!/bin/bash

isPrime() {
  local num=$1
  if [[ $num -lt 2 ]]; then
    return 1 
  fi
  for (( i=2; i*i<=num; i++ )); do
    if [[ $(( num % i )) -eq 0 ]]; then
      return 1 
    fi
  done
  return 0  
}

printf "Enter limit: "
read limit

printf "Prime numbers up to %d:\t" "$limit"

for (( num=2; num<=limit; num++ )); do
  if isPrime "$num"; then
    printf "%d " "$num"
  fi
done

printf "\n" 
