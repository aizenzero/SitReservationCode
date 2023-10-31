
import java.util.Scanner;


public class Main {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------Welcome to our Bus Company------------------\n");

        System.out.println("-----------------------Bus Sit Reservation-----------------------");

        char [][] table = new char[11][9];

        for(int colSit=1;colSit<=8;colSit++){
            System.out.print("\t\tColumn "+colSit+"");
        }
        System.out.println();

        for(int rowSit = 1;rowSit<=10;rowSit++){
            System.out.print("Row "+rowSit+"|"+"\t\t");

            for(int col = 1;col<=8;col++){

                table[rowSit][col] = '*';

                System.out.print(table[rowSit][col]+"\t\t\t\t");
            }
            System.out.println();

        }


        while(true){
            System.out.print("Enter row and column number to reserve  separated by space (ex: 3 3)");
            int row     = input.nextInt();
            int column  = input.nextInt();

            if(row <= 0 || row > 10  || column <=0 || column > 8){
                System.out.println("Invalid sit");
                continue;
            }
            if (table[row][column] == 'X'){
                System.out.println("Sit is already reserved");
                continue;
            }

            System.out.println("You have reserved sit at: ");
            System.out.println("Row "+row);
            System.out.println("Column "+column);

            //update the table

            table[row][column] ='X';

            for (int colSit = 1; colSit <= 8; colSit++) {
                System.out.print("\t\tColumn " + colSit + " ");
            }
            System.out.println();

            for (int rowSit = 1; rowSit <= 10; rowSit++) {
                System.out.print("Row" + rowSit + "|" + "\t\t");

                for (int col = 1; col <= 8; col++) {
                    System.out.print(table[rowSit][col] + "\t\t\t\t");
                }
                System.out.println();
            }

            System.out.println("You have successfully reserved a seat!");
            System.out.print("Do you want to reserve another seat? (y/n): ");
            char answer = input.next().toUpperCase().charAt(0);

            if (answer != 'Y') {
                System.out.println("----------------------------------------------");
                System.out.println("Thank you for choosing our company.");
                break; // Exit the loop
            }

        }

    }
}