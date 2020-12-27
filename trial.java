package casestudy;
import java.util.*;
public class trial {
    public static Scanner sc = new Scanner(System.in);
    public static String[][] accountTable = {
        {
            "0123-4567-8901",
            "Roel Richard",
            "5000.00",
            "1111"
        },
        {
            "345-6789-0123 ",
            "Dorie Marie",
            "0.00",
            "2222"
        },
        {
            "3456-7890-1234 ",
            "Railee Darrel",
            "10000",
            "3333"
        },
        {
            "4567-8901-2345",
            "Railynne Dessirei",
            "2500",
            "4444"
        },
        {
            "5678-9012-3456 ",
            "Raine Dessirei ",
            "10000",
            "5555"
        },
    };

    public static int i;
    public static int pinnumbers = 0;
    public static String accountNumber = " ", accountName = " ";
    public static int outputTwoPin = 0, passwordtrial = 0, ii = 0, ij = 0;
    public static double balance = 0;

    public static void main(String[] args) {
        //System.out.println(accountTable[1][2]);
      
        for (ii = 0; ii < accountTable.length; ii++) {
            pinnumbers = Integer.parseInt(accountTable[ii][3]);
            System.out.println(pinnumbers);
        }
        outputOne();
    }
    public static void outputOne() {
        System.out.println("\n\t\t  _________________________");
        System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
        System.out.println("\t\t  _________________________");
        System.out.println("\n\n \t\t S -> Start Transaction");
        System.out.println("\t\t Q -> Quit");
        System.out.print("\n\n\t\t Enter your Choice: ");
        char outputOneChoice = sc.next().charAt(0);

        switch (outputOneChoice) {
            case 'S':
            case 's':
                passwordtrial = 0;
                outputTwo();
                break;
            case 'q':
            case 'Q':
                System.out.println("you are quit");
                System.exit(0);
                break;
            default:
                System.out.println("wtf");
        }
    }

    public static void outputTwo() {
        while (passwordtrial >= 3) {
            System.out.println("\n\n\t\t\tCAPTURED CARD….\r\n\t\t\t PLEASE CALL 143-44");
            outputOne();
        }
        System.out.println("\n\t\t  _________________________");
        System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
        System.out.println("\t\t  _________________________");
        System.out.println("\n\n\t\t    Enter your Pin NUmber: ");
        System.out.print("\n\t\t\t     ");
        outputTwoPin = sc.nextInt();

        for (i = 0; i < accountTable.length; i++) {
            if (Integer.parseInt(accountTable[i][3]) == outputTwoPin) {

                balance = Double.parseDouble(accountTable[i][2]);
                accountNumber = accountTable[i][0];
                accountName = accountTable[i][1];
                outputThree();
                System.exit(0);

            }
        }
        System.out.println("\n\n\t\t\tMaling pin");
        passwordtrial++;
        outputTwo();

        /** while(passwordtrial >= 3) {
			System.out.println("\n\n\t\t\tCAPTURED CARD….\r\n\t\t\t PLEASE CALL 143-44");
			outputOne();
		}*/
    }
    public static void outputThree() {
        System.out.println("\n\t\t  _________________________");
        System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
        System.out.println("\t\t  _________________________");
        System.out.println("\n\t\t Select Type of Transaction: ");
        System.out.println("\n\t\t     B-> Balance Inquiry ");
        System.out.println("\t\t     W-> Withdrawal ");
        System.out.println("\t\t     D-> Deposit");
        System.out.println("\t\t     C-> Cancel");
        System.out.print("\n\t\t Enter transaction Type: ");
        char transaction = sc.next().charAt(0);


        switch (transaction) {
            case 'B':
            case 'b':
                balanceInquiry();
                break;

            case 'c':
            case 'C':
                outputOne();
                break;

            default:
                System.out.println("Invalid Choices");
        }
    }

    public static void balanceInquiry() {
        System.out.println("\n\t\t  _________________________");
        System.out.println("\t\t\t    BDO\n\t\t\tBanko de Oro");
        System.out.println("\t\t  _________________________");
        System.out.println("\n\t\tAccount #:       " + accountNumber);
        System.out.println("\n\t\tAccount Name:    " + accountName);
        System.out.println("\n\t\tBalance:         " + balance);

        System.out.println("\n\t\t\tPress X to Exit");
        char exit = sc.next().charAt(0);

        switch (exit) {
            case 'x':
            case 'X':
                outputThree();
                break;
        }

    }



    //ending
}