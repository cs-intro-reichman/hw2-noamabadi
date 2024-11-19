// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mood = (args[1]);
		boolean firstTime = true;
		if (mood.equals("v")) {
		for (int i =1; i<= N; i++) {
			int s = i;
			int sum = 1;
			while (s != 1 || firstTime) {
				sum++; 
			firstTime = false; 
			if (s % 2 == 0) { // i = 1, s = 1
				System.out.print(s + " ");
				s = s / 2;
				
			}
				else 
				{
					System.out.print(s + " ");
					s = (s * 3 + 1);
				}
			}
			System.out.print(1 + " (" + sum + ")");
			System.out.println();
		}
			
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
