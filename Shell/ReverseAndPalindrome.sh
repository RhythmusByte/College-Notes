#!/bin/bash

printf "Enter a string: "
read str

rev_str=$(echo "$str" | rev)

echo "Reversed string: $rev_str"

if [[ "$str" == "$rev_str" ]]; then
  echo "$str is a palindrome"
else
  echo "$str is not a palindrome"
fi
