// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int num = Integer.parseInt(args[0]);
	int i = 0;
	double sum = 0.0;

	for (i = 0; i < num; i++){
	double term = Math.pow(-1, i) / (2*i + 1);
	sum = sum + term;
	}

	double pi = sum * 4;
	System.out.println("pi according to java:" + Math.PI);
	System.out.println("pi, approximated:    " + pi); 
	} }

