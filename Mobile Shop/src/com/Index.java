package com;
import java.util.Scanner;
public class Index extends Purchasing{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purchasing pur = new Purchasing();
		System.out.println("What's Up");
		System.out.println("Welcome to our Shop");
		System.out.println("Press 1 for purchasing"+"\n"+"Press 2 for selling"+"\n"+"Press 3 for repairing");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 1:pur.Ok(); break;
		case 2:; break;
		case 3:;
		default:;
		}
		scan.close();
	}

}
