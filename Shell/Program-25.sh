#!/bin/bash

printf "Enter the first file: "
read file1
printf "Enter the second file: "
read file2

if cmp -s "$file1" "$file2"; then
  printf "Files are the same. Deleting the second file.\n"
  rm "$file2"
else
  printf "Files are different. No file will be deleted.\n"
fi
