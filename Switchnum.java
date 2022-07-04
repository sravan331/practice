package switchcases;

import java.util.Scanner;

public class Switchnum {

	public static void main(String[] args) {
		System.out.println("enter the case number ");
		Scanner no = new Scanner(System.in);
		int noo = no.nextInt();
		switch(noo) {
		case 1: System.out.println("the case number is 420 ");
		break;
		case 2: System.out.println("the case number is 143 ");
		break;
		case 3: System.out.println("the case number is 141 ");
		break;
		default: System.out.println("the case number is invalid ");
		}
	}

}
