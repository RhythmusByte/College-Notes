#!/bin/bash

printf "Enter a filename: "
read file

if [ -e "$file" ]; then
  echo "$file exists"
else
  echo "$file does not exist"
fi

if [ -f "$file" ]; then
  echo "$file is a regular file"
else
  echo "$file is not a regular file"
fi

if [ -s "$file" ]; then
  echo "$file is not empty"
else
  echo "$file is empty"
fi

if [ -r "$file" ]; then
  echo "$file has read permission"
else
  echo "$file does not have read permission"
fi

if [ -w "$file" ]; then
  echo "$file has write permission"
else
  echo "$file does not have write permission"
fi

if [ -x "$file" ]; then
  echo "$file has executable permission"
else
  echo "$file does not have executable permission"
fi

if [ -O "$file" ]; then
  echo "You are the owner of $file"
else
  echo "You are not the owner of $file"
fi

if [ -N "$file" ]; then
  echo "$file has been modified since last read"
else
  echo "$file has not been modified since last read"
fi

printf "Enter file1: "
read file1
printf "Enter file2: "
read file2

if [ "$file1" -nt "$file2" ]; then
  echo "$file1 is newer than $file2"
else
  echo "$file1 is not newer than $file2"
fi
