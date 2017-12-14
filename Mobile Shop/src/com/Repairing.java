package src.com;
import java.util.Scanner;
public class Repairing {
    void Rep(){
         System.out.println("Welcome to Repairing "+"\n"+"Please tell us what you want to sell "+"\n"+"Press 1 for Headset"+"\n"+
        "Press 2 for Chargers"+"\n"+"Press 3 for Smartphone");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 1:System.out.println("Thanks for Repairing Headsets");break;
            case 2:System.out.println("Thanks for Repairing Chargers");break;
            case 3:System.out.println("Thanks for Repairing Smartphone");
            default:System.out.println("Try Again!!!!!!");
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
    }
}
