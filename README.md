# Mastermind Console Game

![Mastermind](mastermind.jpg)

Welcome to the Mastermind console game! This is a Java-based implementation of the classic board game "Mastermind." The objective of the game is to guess a secret code consisting of a sequence of letters within a limited number of attempts.

## How to Play

1. Clone this repository to your local machine or download the source code as a ZIP file.

2. Compile the Java source code to create the executable class files:
   ```
   javac Mastermind.java
   ```

3. Run the game:
   ```
   java Mastermind
   ```

4. The computer will generate a secret code made up of a sequence of letters. Your task is to guess this code within a limited number of attempts.

5. You'll be prompted to enter your guess. The code consists of a sequence of letters. For example: `ABCD`.

6. After each guess, the computer will provide feedback to help you refine your guess. The feedback will consist of two parts:
   - The number of correct letters in the correct positions.
   - The number of correct letters in the wrong positions.

7. Use the feedback to adjust your subsequent guesses. Keep making guesses until you guess the code correctly or run out of attempts.

8. The game will display messages to indicate whether you've won or lost.

9. Have fun playing Mastermind!

## Game Rules

1. The secret code is a sequence of letters, and the length of the code can be configured in the `Mastermind.java` file.

2. The letters in the code can be chosen from a predefined set of characters (e.g., A, B, C, D, E, F, G).

3. Each letter in the code may appear only once. For example, the code `ABCA` is not allowed.

4. You have a limited number of attempts to guess the code, and the number of attempts can be configured in the `Mastermind.java` file.

5. After each guess, the computer will provide feedback in the form of the number of correct letters in the correct positions and the number of correct letters in the wrong positions.

## Customization

You can easily customize the game by modifying the following parameters in the `Mastermind.java` file:

- `CODE_LENGTH`: The length of the secret code.
- `ALLOWED_LETTERS`: The set of characters from which the secret code can be composed.
- `MAX_ATTEMPTS`: The maximum number of attempts allowed to guess the code.

Feel free to experiment with these parameters to make the game easier or more challenging.

## About

This Mastermind console game is written in Java and serves as a simple implementation of the classic board game. It was created by [Your Name] as a fun programming exercise.

## Acknowledgments

Special thanks to the creators of the original Mastermind board game, which has provided countless hours of entertainment and enjoyment.

Enjoy the game and happy guessing!
