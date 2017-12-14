package src.com;
import java.util.Scanner;
public class Purchasing extends Samsung {
	Samsung sam = new Samsung();
	Oppo op = new Oppo();
	Vivo vi = new Vivo();
	Redmi Rm = new Redmi();
	void Ok() {System.out.println("Wecome to Purchasing"+"\n"+"Choose the brand"+"\n"+"Samsung"+"\n"+"Oppo"+"\n"+"Vivo"+"Redmi");
	Scanner ne = new Scanner(System.in);
	String a = ne.next();
	switch(a) {
	case "Samsung":sam.Hell(); break;
	case "Oppo":op.Hell() ; break;
	case "Vivo": vi.Hell(); break;
	case "Redmi": Rm.Hell(); break;
	default: System.out.println("try again");
	}
	ne.close();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
