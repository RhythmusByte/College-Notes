#!/bin/zsh 
# Use #!/bin/bash while you use!!!

while true; do

    printf "\n|-- Basic Calculator\n"
    printf "|-- 1. Addition\n"
    printf "|-- 2. Subtraction\n"
    printf "|-- 3. Multiplication\n"
    printf "|-- 4. Division\n"
    printf "|-- 5. Exit\n"

    printf "\n\tEnter your choice: "
    read choice

    if [[ "$choice" -eq 5 ]]; then
        echo "Exiting..."
        exit 0
    fi

    printf "Enter first number: "
    read num1
    printf "Enter second number: "
    read num2

    case $choice in
        1) result=$((num1 + num2))
           printf "Result: %d\n" "$result" ;;
        2) result=$((num1 - num2))
           printf "Result: %d\n" "$result" ;;
        3) result=$((num1 * num2))
           printf "Result: %d\n" "$result" ;;
        4) 
           if [[ "$num2" -eq 0 ]]; then
               echo "Error: Division by zero is not allowed."
           else
               result=$(echo "scale=2; $num1 / $num2" | bc)
               printf "Result: %s\n" "$result"
           fi ;;
        *) echo "Invalid choice!!" ;;
    esac
done
