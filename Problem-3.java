// Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
//   Output: (examples)
//     1) input a = 1, then output : 1
//     2) input a = 2, then output : 1
//     3) input a = 3, then output : 1, 3, 5
//     4) input a = 4, then output : 1, 3, 5
//     5) input a = 5, then output : 1, 3, 5, 7, 9
//     6) input a = 6, then output : 1, 3, 5, 7, 9
//     .
//     .
//     7) input a = x, then output : 1, 3, 5, 7, .......
 package org.Tandemloop;

import java.util.Scanner;

public class OddNumber2 {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number a");
		int a=sc.nextInt();
		if(a%2==0) {
			a=a-1;
		}
		System.out.println("output :");
		for(int i=0;i<a;i++) {
			int odd =2*i+1;
			System.out.print(odd);
			if(i<a-1) {
				System.out.print(",");
			}
		}
}
}
