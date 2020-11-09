package codewars;

import java.lang.*;

public class Prime {
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		for(int i = 2; i <= Math.sqrt((double) num); i++){
			if (num % i == 0) return false;
		}
		return true;
	}
}
