package com;
import java.util.Scanner;
public class Purchasing extends Samsung {
	Samsung sam = new Samsung();
	void Ok() {System.out.println("Wecome to Purchasing"+"\n"+"Choose the brand"+"\n"+"Samsung"+"\n"+"Oppo"+"\n"+"Vivo"+"Redmi");
	Scanner ne = new Scanner(System.in);
	String a = ne.next();
	switch(a) {
	case "Samsung":sam.Hell(); break;
	case "Oppo": System.out.println("hello"); break;
	case "Vivo": System.out.println("hello"); break;
	case "Redmi": System.out.println("hello"); break;
	default: System.out.println("try again");
	}
	ne.close();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
