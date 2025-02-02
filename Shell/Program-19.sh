#!/bin/bash

printf "Enter a text (maximum 10 characters): "
read text
echo "$text"

printf "Enter the year: "
read year
cal "$year"
