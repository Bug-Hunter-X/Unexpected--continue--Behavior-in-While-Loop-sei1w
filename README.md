# Unexpected `continue` Behavior in Java While Loop

This repository demonstrates a subtle bug in Java code involving the use of a `continue` statement within a `while` loop. The code intends to print numbers from 0 to 9, excluding 5. However, there's a potential for unexpected behavior if the loop's condition or the `continue` condition are modified.

## Bug Description

The original code uses a `while` loop with a `continue` statement.  While functionally correct in this simple case, there's a risk of errors if the loop's condition or the `if` statement's condition changes.  For instance, adding more complex logic to the `if` condition could lead to an infinite loop or skipping unintended numbers. 

## Solution

The solution involves carefully reviewing the loop's control flow and ensuring that all possible scenarios are handled correctly.