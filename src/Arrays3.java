import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args){

        int[] myArray = new int [10];
        Scanner in = new Scanner(System.in);

        int sum =0;
        for(int i = 0; i<myArray.length; i++){
            System.out.println("Enter numbers from 1-10");
            myArray[i]=in.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Total is " + sum );

    }
}
