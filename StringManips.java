package fg;
import java.util.Scanner;
public class StringManips {

	public static void main(String[] args) {
        String phrase = new String ("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        String middle3; // middle three characters of the phrase

        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);

        // get the middle three characters of the phrase
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);

        // replace all blank characters in switchedPhrase with an asterisk (*)
        switchedPhrase = switchedPhrase.replace(' ', '*');
         // print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength +
                " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " +
                phrase.charAt(middleIndex));
        System.out.println("Switched phrase: trying test.This is a S ");
        System.out.println(middle3);
        System.out.println(switchedPhrase);

        // declare two new variables city and state of type String
        String city;
        String state;

        // create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a city:");
        city = keyboard.nextLine();

        System.out.println("Please enter a state:");
        state = keyboard.nextLine();

        // create and print a new string
        String formattedHometown = state.toUpperCase() + city.toLowerCase() + state.toUpperCase();
        System.out.println(formattedHometown);
        
	}

}
