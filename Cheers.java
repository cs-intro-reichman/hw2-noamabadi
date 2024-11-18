// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String input = args[0].toUpperCase();
        int repeat = Integer.parseInt(args[1]);

        String vowels = "AEFHILMNORSX";
        int i = 0;
        for (i = 0; i < input.length(); i++){
        char letter = input.charAt(i);
        String b = vowels.indexOf(letter) != -1 ? "an" :"a "; 
        System.out.println( "Give me " + b + " " + letter + ": " + letter + "!");

        }
        System.out.println( "What does that spell?");

        for (i = 0; i < repeat; i++){
                System.out.println(input + "!!!");
        }  } }       
