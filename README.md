# Longest-valid-parentheses
## Probelm statement
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring

### Example 1:

Input: s = "(()"

Output: 2

Explanation: The longest valid parentheses substring is "()".
### Example 2:

Input: s = ")()())"

Output: 4

Explanation: The longest valid parentheses substring is "()()".
### Example 3:

Input: s = ""

Output: 0
 

### Constraints:

0 <= s.length <= 3 * 104
s[i] is '(', or ')'.
## Solution 
- Initialize a stack to store the indices of opening parentheses.
- Push -1 onto the stack to act as a starting point.
- Iterate through the string from left to right, and for each character:
- If it's an opening parentheses, push its index onto the stack.
- If it's a closing parentheses, pop the top index from the stack:
- If the stack is empty, push the current index onto the stack.
- Otherwise, calculate the length of the valid parentheses substring ending at the current index:
- If the stack is not empty, the length is the difference between the current index and the top index on the stack.
- Otherwise, the length is the difference between the current index and the starting point (-1).
- Update the maximum length of the valid parentheses substring seen so far.
- Return the maximum length of the valid parentheses substring seen so far.
