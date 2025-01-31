#!/bin/bash

printf "Enter the radius of the circle: "
read radius

area=$(echo "3.14 * $radius * $radius" | bc)
printf "Area of the circle is: %s\n" $area
