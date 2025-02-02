#!/bin/bash

source=$1
destination=$2

if [ -e "$destination" ]; then
  echo "$destination exists. Copy not allowed."
else
  cp "$source" "$destination"
  echo "Contents copied from $source to $destination"
fi
