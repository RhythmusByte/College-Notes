#!/bin/bash

sum=0
count=0

for num in "$@"; do
  sum=$(( sum + num ))
  count=$(( count + 1 ))
done

if [[ $count -gt 0 ]]; then
  avg=$(( sum / count ))
  echo "Average: $avg"
else
  echo "No numbers provided."
fi
