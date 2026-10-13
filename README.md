# calculator

A tiny command-line calculator in Java, one of the first things I wrote while learning the language. Type an equation such as `2 * 21` and it prints the result, then asks again.

## Running it

The files declare `package Calculator`, so compile into an output folder and run the `runner` class by its full name:

```bash
javac -d out *.java
java -cp out Calculator.runner
```

Supported operators: `+`, `-`, `*`, `/`. Stop it with `Ctrl+C`.

## What I learnt

- How `Scanner` splits input into tokens, so `2 * 21` works but `2*21` does not.
- A method can share its class's name and still not be a constructor. `public void Cal()` looked like one but was a normal method; it is now called `run()` to avoid the confusion.
- Using a `switch` to dispatch on an operator string.

## What I would do better

- Use `double` rather than `float`, which loses precision quickly.
- Handle bad input (`InputMismatchException`), division by zero and end of input instead of crashing.
- Parse a whole line (`2*21`, brackets, precedence) rather than exactly three tokens.
- Give the loop a way to exit, and add a few unit tests.
- Follow Java naming conventions: lowercase package names and `PascalCase` class names (`Runner`, not `runner`).
