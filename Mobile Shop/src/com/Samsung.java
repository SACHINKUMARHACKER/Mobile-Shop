package src.com;
import java.util.Scanner;
public class Samsung extends Oppo{
	String b;
	void Hell() {
		System.out.println("Welcome to Samsung");
		System.out.println("Choose any Model"+"\n"+"Press 1 for Galaxy J5"+"\n"+"Press 2 for Samsung S 8"+"\n"+"Press 3 for Samsung note 4");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 1:System.out.println("Price for Samsung Galaxy j5 is Rs 12,000"+"\n"+"Press smj5 to get it");
		 
		 break;
		case 2:System.out.println("Price for Samsung Galaxy s 8 is Rs 70,000"+"\n"+"Press sms8 to get it");
		  break;
		case 3:System.out.println("Price for Samsung Galaxy note 4 is Rs 120,000"+"\n"+"Press smn4 to get it");
		
		default:System.out.println("Try again!!!!!!!!");;
		
		}
		b = scan.next();
		scan.close();
		switch(b) {
		case "smj5":System.out.println("Thanks for purchasing");break;
		case "sms8":System.out.println("Thanks for purchasing");break;
		case "smn4":System.out.println("Thanks for purchasing");
		default: System.out.println("Try Again!!!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
