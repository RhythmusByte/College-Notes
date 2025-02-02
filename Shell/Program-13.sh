#!/bin/bash

printf "Enter the filename: "
read file

if [[ -f $file ]]; then
  tr '[:lower:]' '[:upper:]' < "$file" > temp_file && mv temp_file "$file"
  echo "Converted all contents to uppercase in $file"
else
  echo "File does not exist."
fi
