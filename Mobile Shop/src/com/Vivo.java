package src.com;
import java.util.Scanner;
public class Vivo extends Redmi{
    String b;
        void Hell() {
		System.out.println("Welcome to Vivo");
		System.out.println("Choose any Model"+"\n"+"Press 1 for Vivo Note 3"+"\n"+"Press 2 for Vivo V5"+"\n"+"Press 3 for Vivo V7");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 1:System.out.println("Price for Vivo Note 3 is Rs 12,000"+"\n"+"Press vvn3 to get it");
		 
		 break;
		case 2:System.out.println("Price for Vivo V5 is Rs 15,000"+"\n"+"Press vvv5 to get it");
		  break;
		case 3:System.out.println("Price for Vivo V7 is Rs 18,000"+"\n"+"Press vvv7 to get it");
		
		default:System.out.println("Try again!!!!!!!!");;
		
		}
		b = scan.next();
		scan.close();
		switch(b) {
		case "vvn3":System.out.println("Thanks for purchasing");break;
		case "vvv5":System.out.println("Thanks for purchasing");break;
		case "vvv7":System.out.println("Thanks for purchasing");
		default: System.out.println("Try Again!!!!");
		}
	}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }

}
