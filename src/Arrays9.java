import java.lang.reflect.Array;

public class Arrays9 {
    public static void main(String[] args){

        int [] num = {1,7,6,5,9};
        int [] num2= {2,7,6,3,4};

        for (int counter = 0; counter<num.length;counter++){
            for (int count = 0; count<num2.length; count++){
                if (num[counter]==num2[count]){

                    System.out.println(num[counter] + ", " + num2[count]);

                }
            }
        }

    }
}
