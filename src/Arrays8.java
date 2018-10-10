public class Arrays8 {
    public static void main(String[] args){


        String[] letters = {"w","t","y","h","k"};

        for(int i = 0; i < letters.length; i++){
            if(letters[i].equalsIgnoreCase("t")){
                letters[i] = "hello";
            }
            System.out.println(letters[i]);
        }

    }
}
