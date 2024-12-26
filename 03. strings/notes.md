# Regular Expressions
- A regular expression is a sequence of characters that define a search pattern.

- . - Any (single) character except newline
- [abc] - Exactly one alphabet from the given
- [^abc] - Any character except given letters
- [abc][vz] - Either first or second
- [a-z1-7] - a-z or 1-7
- A|B - Either A or B
- XZ - Exactly XZ

## Meta Characters
- \d - Any digit
- \D - Any non-digit
- \s - Any whitespace
- \S - Any non-whitespace
- \w - Any word character
- \W - Any non-word character

## Quantifiers
- * - 0 or more times
- + - 1 or more times
- ? - 0 or 1 times
- {X} - Exactly X times
- {X,Y} - Between X and Y times

### Examples
[abc]* - Any number of a, b, c
[abc]+ - At least one a, b, c
[a-z]* - Any number of a-z
[a-z]{5} - Exactly 5 a-z

