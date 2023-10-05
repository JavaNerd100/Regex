package AnotherCharacterClasses;

public class AnotherCharacterClasses {

    public static void main(String[] args) {

        //A dot symbol in regular expressions represents any character at all.
        System.out.println("doggy".matches("....."));
        System.out.println("doggy".matches(".*"));
        System.out.println("doggy".matches(".+"));
        System.out.println("doggy".matches(".?"));

        /**
         *  A caret symbol context of brackets inside of the brackets this means opposite or not
         *  that match any character which isn't inside the brackets However, outside of square brackets,
         *  this matches the beginning of a line or the beginning of a string.
         *  A dollar sign means ending of a line and can match newline character
         */
        System.out.println("doggy".matches("^....."));
        System.out.println("doggy".matches("^.....$"));

        /**
         * The boundary character class simply matches the area between a word character and a non
         * word character or a non word character and a word character.
         * So the order of those two things doesn't matter.
         * word boundary character does not match a space itself.
         */
        System.out.println("doggy".matches("\\b....."));
        System.out.println("cat doggy".matches("...\\s\\b....."));

        /**
         * A word character allows numbers,letters and underscores.
         * However opposite of word character is capital W represents
         * non word character
         */
        System.out.println("123".matches("\\W\\W\\W"));
        System.out.println("---".matches("\\W\\W\\W"));

        /**
         * \\D represents non digit character
         */
        System.out.println("123".matches("\\D\\D\\D"));
        System.out.println("ABC".matches("\\D\\D\\D"));
        /**
         * \\S represents non space character
         */
        System.out.println(" ".matches("\\S"));
        System.out.println(".".matches("\\S"));




    }
}
