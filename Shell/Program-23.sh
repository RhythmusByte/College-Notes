#!/bin/bash

printf "Enter a string: "
read str

vowels=0
consonants=0
numbers=0

for (( i=0; i<${#str}; i++ )); do
  char=${str:i:1}
  
  if [[ $char =~ [aeiouAEIOU] ]]; then
    vowels=$((vowels + 1))
  elif [[ $char =~ [a-zA-Z] ]]; then
    consonants=$((consonants + 1))
  elif [[ $char =~ [0-9] ]]; then
    numbers=$((numbers + 1))
  fi
done

echo "Vowels: $vowels"
echo "Consonants: $consonants"
echo "Numbers: $numbers"
