package unl.cse.kaprekar;

public class KaprekarDemo {

	public static void main(String args[]) {
		
		if(args.length != 1) {
			System.out.println("Usage: KaprekarDemo n");
			System.exit(1);
		}
		
		boolean n = Boolean.parseBoolean(args[0]);
		if(n) {
			System.out.printf("%d is a Kaprekar Number!\n", n);
		} else {
			System.out.printf("%d is not a Kaprekar Number!\n", n);
		}		
	}
}
