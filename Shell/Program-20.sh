#!/bin/bash

printf "Current Date and Time: "
date

printf "Number of Users: "
who | wc -l

printf "Terminal Name: "
tty

printf "Login Date and Time: "
whoami
