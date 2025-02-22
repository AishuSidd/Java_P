package com.control_statements;

public class Prime1 {

	public static void main(String[] args) {
		        int start = 10;  
		        int end = 50;    

		        System.out.println("Prime numbers between " + start + " and " + end + ":");
		        for (int i = start; i <= end; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		            }
		        }
	}

public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
}