package com.control_statements;

public class Test_6 {

	public static void rightAngledTriangle(int num) {
		for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
	}
	public static void main(String[] args) {
		rightAngledTriangle(5);
	}

}
