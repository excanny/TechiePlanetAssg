public class TimeConverter {
    // Print Time in words.
    static String printTime(int H, int M)
    {
        String time = "";
        String nums[] = { "zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen",
                            "eighteen", "nineteen", "twenty", "twenty one",
                            "twenty two", "twenty three", "twenty four",
                            "twenty five", "twenty six", "twenty seven",
                            "twenty eight", "twenty nine",
                        };
        if(H < 0 || H > 12) return "Invalid hour entered";
     
        if (M == 0)
            time = nums[H] + " o' clock ";
     
        else if (M == 1)
             time = "one minute past " + nums[H];
     
        else if (M == 59)
            time = "one minute to " + nums[(H % 12) + 1];
     
        else if (M == 15)
            time = "quarter past " + nums[H];
     
        else if (M == 30)
            time = "half past " + nums[H];
     
        else if (M == 45)
            time = "quarter to " + nums[(H % 12) + 1];
     
        else if (M <= 30)
            time = nums[M] + " minutes past " + nums[H];
     
        else if (M > 30)
            time = nums[60 - M] + " minutes to " +   nums[(H % 12) + 1];

        return time;
    }
     
    public static void main(String[] args) {
        System.out.println(printTime(12, 0));
    }
  }