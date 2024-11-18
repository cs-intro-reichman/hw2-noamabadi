// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int calc = Integer.parseInt(args[0]);

		double divider = 3.0;
		double sum = 1.0; 
		int counter = 1;
		boolean possitiveOrNegative = false;

		while (counter < calc) {

			if (possitiveOrNegative == false){

			sum = sum - (1.0 / divider); 
			possitiveOrNegative = true;	
		} else { 

				sum = sum + (1.0 / divider);
				possitiveOrNegative = false;
				}

				
			counter++;
			divider = divider + 2.0;
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4.0);
	}
}
