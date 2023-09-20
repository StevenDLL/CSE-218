package p3;

public class Demo {

	public static void main(String[] args) {
		System.out.println("The sum is " + sumFraction(5));
	}

	private static double sumFraction(int n) {
		if(n == 1) { // basecase
			return 1.0;
		}
		
		return 1.0/n + sumFraction(n-1);
	}

}

//1st call: 1/5 + sumFraction(4);
//2nd call: 1/5 + 1/4 + sumFraction(3)
//3rd call: 1/5 + 1/4 + 1/3 + sumFraction(2)
//4th call: 1/5 + 1/4 + 1/3 + 1/2 + sumFraction(1)
//5th call: 1/5 + 1/4 + 1/3 + 1/2 + 1.0