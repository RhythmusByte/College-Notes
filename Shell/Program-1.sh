#!/bin/bash
echo -n "Enter the radius of the circle:"
read radius
area=$(echo "3.14 * $radius * $radius" | bc)
echo "Area of the circle is: $area"
