package Oss0421;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("´Ü: ");
		int dan=sc.nextInt();
		if(dan==0) {
			for(int i=2;i<10;i++) {
				for(int j=1;j<10;j++) {
					System.out.printf("%d x %d = %d ", i, j, i*j);
				}
			System.out.println();
			}
		}
		else {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\n", dan, j, dan*j);
			}
		}
		System.out.println();
	}
}
