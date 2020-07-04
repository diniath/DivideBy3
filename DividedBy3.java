package mypackage;

public class DividedBy3 {
	public static void main (String [] args){
		int inputNumber = Integer.parseInt(args[0]);
		int result = inputNumber % 3;
		System.out.println ("result: " + result);
	}

}