// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int calc = Integer.parseInt(args[0]);

		double dividor = 3.0;
		double sum = 1.0; 
		int counter = 1;
		boolean positiveOrNegative = false;

		while (counter < calc) {
			if (positiveOrNegative == false){

				sum = sum - (1.0 / dividor); 
				positiveOrNegative = true;	}
				else { 
					sum = sum + (1.0 / dividor);
					positiveOrNegative = false;
				}
			counter++;
			dividor = dividor + 2.0;
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4.0);
	}
}
