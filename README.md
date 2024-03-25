# Letter Frequency Analyzer

This Java program calculates and displays the frequency of each letter in a given text with probabilities, providing insight into the distribution of letters. The frequency analysis is performed on English alphabetic characters only, ignoring spaces, punctuation, and line breaks. The results are sorted in descending order of frequency to easily identify the most common letters in the sample text.

## Features

- **Frequency Analysis**: Counts the occurrences of each English letter in the input text.
- **Probability Calculation**: Calculates the probability of each letter's appearance in the text.
- **Result Sorting**: Sorts the letters by their frequencies in descending order for easy analysis.
- **Case Insensitivity**: Processes text in a case-insensitive manner, treating all letters as uppercase.

## How It Works

The program consists of two main methods:

1. `analyzeLetterFrequencyWithProbability`: This method takes a string of text as input and calculates the frequency and probability of each letter. It returns a map of characters (letters) to their respective probabilities.

2. `sortByValueDescending`: This method takes the map of letters and their probabilities and sorts them in descending order based on the probability values.

## Usage

To use this program, simply input your text into the `sampleText` string variable in the `main` method. The program will then analyze the letter frequency and probability, sort the results, and print them to the console.

```java
public static void main(String[] args) {
    String sampleText = "Your sample text goes here...";
    Map<Character, Double> probabilities = analyzeLetterFrequencyWithProbability(sampleText);
    probabilities = sortByValueDescending(probabilities);
    System.out.println(probabilities);
}
