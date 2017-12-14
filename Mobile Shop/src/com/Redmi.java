package src.com;
import java.util.Scanner;
    public class Redmi {
        String b;
        void Hell() {
		System.out.println("Welcome to Redmi");
		System.out.println("Choose any Model"+"\n"+"Press 1 for Redmi Note 3"+"\n"+"Press 2 for Redmi Note 4"+"\n"+"Press 3 for Redmi Note 5");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 1:System.out.println("Price for Redmi Note 3 is Rs 11,000"+"\n"+"Press rmn3 to get it");
		 
		 break;
		case 2:System.out.println("Price for Redmi Note 4 is Rs 13,000"+"\n"+"Press rmn4 to get it");
		  break;
		case 3:System.out.println("Price for Redmi Note 5 is Rs 15,000"+"\n"+"Press rmn5 to get it");
		
		default:System.out.println("Try again!!!!!!!!");;
		
		}
		b = scan.next();
		scan.close();
		switch(b) {
		case "rmn3":System.out.println("Thanks for purchasing");break;
		case "rmn4":System.out.println("Thanks for purchasing");break;
		case "rmn5":System.out.println("Thanks for purchasing");
		default: System.out.println("Try Again!!!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
