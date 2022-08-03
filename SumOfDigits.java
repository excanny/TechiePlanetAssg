public class SumOfDigits {

    public static int Sum(int num) {

        String temp = Integer.toString(num);
        int sum = 0;

        int[] newArray = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i++)
        {
            newArray[i] = temp.charAt(i);
        }

        for (int j = 0; j < newArray.length; j++) {
            sum =+ newArray[j];
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(Sum(num));
    }
}
