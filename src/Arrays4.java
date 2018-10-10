import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args){
        int total=0;
        double avrage=0;
        int[]myNumber=new int[3];

        Scanner sc=new Scanner(System.in);

        for (int index=0;index<myNumber.length;index++){
            System.out.println("pleae enter the number");

            int userInputNum=sc.nextInt();
            myNumber[index]=userInputNum;
            total=total+myNumber[index];
            avrage=total/myNumber.length;
        }

        System.out.println(avrage);
    }
}
