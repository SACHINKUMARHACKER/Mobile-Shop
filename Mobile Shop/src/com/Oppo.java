package src.com;
import java.util.Scanner;
public class Oppo extends Vivo{
    String b;
    void Hell() {
		System.out.println("Welcome to Oppo");
		System.out.println("Choose any Model"+"\n"+"Press 1 for Oppo F1"+"\n"+"Press 2 for Oppo F3"+"\n"+"Press 3 for Oppo F5");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch(a) {
		case 1:System.out.println("Price for Oppo F1 is Rs 18,000"+"\n"+"Press opf1 to get it");
		 
		 break;
		case 2:System.out.println("Price for Oppo F3 is Rs 22,000"+"\n"+"Press opf3 to get it");
		  break;
		case 3:System.out.println("Price for Oppo F5 is Rs 50,000"+"\n"+"Press opf5 to get it");
		
		default:System.out.println("Try again!!!!!!!!");;
		
		}
		b = scan.next();
		scan.close();
		switch(b) {
		case "opf1":System.out.println("Thanks for purchasing");break;
		case "opf3":System.out.println("Thanks for purchasing");break;
		case "opf5":System.out.println("Thanks for purchasing");
		default: System.out.println("Try Again!!!!");
		}
	}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
    }

}
