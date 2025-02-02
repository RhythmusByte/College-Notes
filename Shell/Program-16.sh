#!/bin/bash

printf "Enter Basic Pay: "
read basic

da=$(( (40 * basic) / 100 ))
hra=$(( (20 * basic) / 100 ))
gross=$(( basic + da + hra ))

echo "Gross Salary: $gross"
