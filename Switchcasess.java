package switchcases;

import java.util.Scanner;

public class Switchcasess {

	public static void main(String[] args) {
		System.out.println("enter the case name ");
		Scanner a = new Scanner(System.in);
		String b= a.nextLine();
		a.close();
		switch(b) {
		case "sravan": System.out.println("sravan is a bad guy ");
		break;
		case "ravi": System.out.println("ravi is a good guy ");
		break;
		case "dhanu": System.out.println("dhanu is a smart guy ");
		break;
		default: System.out.println("no one is perfect  ");
		}
	}

}
