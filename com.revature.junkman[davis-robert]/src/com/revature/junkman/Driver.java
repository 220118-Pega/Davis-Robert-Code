package com.revature.junkman;
//import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use scanner to read console to get user input via console
		//needs a input stream, in this case e use the Ssytem.in, 
		//which is the console
		
		System.out.println("Welcome to JunkMan!!!");
		
		Scanner myScanner = new Scanner(System.in);
	//	Console console = System.console();
		
		//every time you guess wrong, the player gets a strike
		int eachChance = 6;
		
	//	String mysteryWord = console.readPassword("Enter Mystery Word").toString();
	
		System.out.println("Enter word to be guessed: ");
		
		//just asks for user input
		String mysteryWord = myScanner.nextLine();
		
		List<String> correctlyGuessedLetters = new ArrayList<String>();
		//to print current guess state
		String originalWord = mysteryWord;
		
		
		while(eachChance > 0) {
			
		
		//gets user input
		System.out.println("The mystery word is: " +mysteryWord);
		
		
		//guessing part of the game
		//ask player for a letter they 
		System.out.println("Guess a letter in the word: ");
		String guessedLetter = myScanner.nextLine();
		
		//use if-else block to specify what to print out if a player correctly guesses a letter in the word
		if(mysteryWord.contains(guessedLetter)) {
			//what you do if the mystery word contains the letter you guessed
			//if mysteryword.contains(guessedLetter) returns true
			System.out.println(mysteryWord.contains(guessedLetter));
			System.out.println("The word contains " + guessedLetter);
			//remove all correctly  guessed letters
			mysteryWord = mysteryWord.replaceAll(guessedLetter, "");
			//add all my correctly guessed letters to a collection
			correctlyGuessedLetters.add(guessedLetter);
			
		}else {
			//this is what you do when the mystery wrd does not contain the letter you guessed
			//if the mysteryWord.contains(guessedLetter) returns false
			System.out.println(mysteryWord.contains(guessedLetter));
			System.out.println("the word does not contain "  +guessedLetter);
			
			eachChance--;
		}
		
		System.out.println("How the guessing is going: ");
		//use the wrapper class Character
		for(Character letter:originalWord.toCharArray()) {
			
			if(correctlyGuessedLetters.contains(letter.toString()))
			{
				System.out.println(letter);
			}else {
				System.out.println("#");
			}
			
			
		}
		
		System.out.println();
		
		if(mysteryWord.length() == 0) {
			System.out.println("Congratulations you guessed all the letters in the word!!");
			break;
		}
		
		}
		//System.out.println("Hello World!");

	}

}
