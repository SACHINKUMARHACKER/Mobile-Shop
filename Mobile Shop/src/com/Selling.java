package src.com;
import java.util.Scanner;
public class Selling extends Repairing {
        void Sell(){
        System.out.println("Welcome to Selling "+"\n"+"Please tell us what you want to sell "+"\n"+"Press 1 for Headset"+"\n"+
        "Press 2 for Chargers"+"\n"+"Press 3 for Screen Guards");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 1:System.out.println("Thanks for Selling Headsets");break;
            case 2:System.out.println("Thanks for Selling Chargers");break;
            case 3:System.out.println("Thanks for Selling Screen Guards");
            default:System.out.println("Try Again!!!!!!");
        }
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }

}
