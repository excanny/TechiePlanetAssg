public class Staircase {

    public static void main(String[] args) {
       
        int height = 13;
        for (int i = 0; i < height; i++){

            for (int j=0; j < i+1; j++)
               System.out.print("#");
            System.out.println();

        }
        
    }
}
