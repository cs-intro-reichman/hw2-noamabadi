// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String cheer = args[0];
        cheer = cheer.toUpperCase();
        String anLetters = "AEFHILMNORSX";
        for (int i = 0; i < cheer.length(); i++) {
             char c = cheer.charAt(i);
             if (anLetters.indexOf(c) != -1) {
                System.out.println("Give me an " + c + ": " + c + "!");  }
             else { System.out.println("Give me a " + c + ": " + c + "!");} 
          } 
        System.out.println("What " + "does " + "that " + "spell?");
        int number = Integer.parseInt(args[1]);

        for (int count = 0; count < number; count++) {
                System.out.println(cheer + "!!!");
        }
        }
}
