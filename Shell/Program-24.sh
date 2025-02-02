#!/bin/bash

while true; do
  printf "\nSelect an operation:\n"
  printf "1. Display file contents\n"
  printf "2. List directory\n"
  printf "3. Make directory\n"
  printf "4. Copy file\n"
  printf "5. Rename file\n"
  printf "6. Delete file\n"
  printf "7. Exit\n"
  printf "Enter your choice: "
  read choice

  case $choice in
    1)
      printf "Enter the file name to display: "
      read file
      cat $file
      ;;
    2)
      printf "Enter directory path to list: "
      read dir
      ls $dir
      ;;
    3)
      printf "Enter the directory name to create: "
      read dir
      mkdir $dir
      ;;
    4)
      printf "Enter the source file to copy: "
      read source
      printf "Enter the destination file: "
      read dest
      cp $source $dest
      ;;
    5)
      printf "Enter the current file name: "
      read oldname
      printf "Enter the new file name: "
      read newname
      mv $oldname $newname
      ;;
    6)
      printf "Enter the file to delete: "
      read file
      rm $file
      ;;
    7)
      exit 0
      ;;
    *)
      printf "Invalid choice! Please try again.\n"
      ;;
  esac
done
