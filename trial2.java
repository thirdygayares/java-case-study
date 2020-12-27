package casestudy;
import java.util.*;
public class trial2 {
	public static Scanner sc = new Scanner(System.in);
	public static String[][] accountTable = { { "0123-4567-8901", "Roel Richard", "5000.00", "1111" }, 
											  { "345-6789-0123 ", "Dorie Marie", "0.00", "2222" },  
											  { "3456-7890-1234 ", "Railee Darrel", "10000", "3333" },
											  { "4567-8901-2345", "Railynne Dessirei", "2500", "4444" },
											  { "5678-9012-3456 ", "Raine Dessirei ", "10000", "5555" },		
											};
	public static int pinnumber = 0;
	public static int pinnumbers = 0;
	public static String accountNumber = " ";
	public static int outputTwoPin = 0;
	public static int passwordtrial = 0, ii= 0, ij=0;
	
	
	public static void main(String[] args) {
		
		//System.out.println(accountTable[1][2]);
		int pinnumber = 0;
		for(ii = 0; ii<accountTable.length; ii++){
			pinnumber++;
			pinnumbers = Integer.parseInt(accountTable[ii][3]);
			
			System.out.println(pinnumbers);

		}
			
			
		outputOne();
		
	}
	
	
	public static void outputOne(){
		System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
		System.out.println("\n\n \t\t S -> Start Transaction");
		System.out.println("\t\t Q -> Quit");
		System.out.print("\n\n\t\t Enter your Choice: ");
		char outputOneChoice = sc.next().charAt(0);
		
		switch(outputOneChoice) {
		case 'S':
		case 's':
			passwordtrial = 0;
			outputTwo();
		
			break;
			
			
		}
	}
	
	public static void outputTwo(){
		while (passwordtrial >= 3) {
			System.out.println("\n\n\t\t\tCAPTURED CARD….\r\n\t\t\t PLEASE CALL 143-44");
			outputOne();
			return;
	}

		System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
		System.out.println("\n\n\t\t Enter your Pin NUmber: ");
		outputTwoPin = sc.nextInt();	
		
		if(outputTwoPin == Integer.parseInt(accountTable[0][3])) {
			 outputThree();
			 return;
		}
		else if(outputTwoPin == Integer.parseInt(accountTable[1][3])) {
			 outputThree();
			 return;
		}
		else if(outputTwoPin == Integer.parseInt(accountTable[2][3])) {
			 outputThree();
			 return;
		}
		else if(outputTwoPin == Integer.parseInt(accountTable[3][3])) {
			 outputThree();
			 return;
		}
		else if(outputTwoPin == Integer.parseInt(accountTable[4][3])) {
			 outputThree();
			 return;
		}
		
		else {
			System.out.println("\n\n\t\tMaling pin");
			passwordtrial++;
			outputTwo();
		}

	
	}
	
	
	public static void outputThree() {
		System.out.println("yehey");
	}
	
	
}
