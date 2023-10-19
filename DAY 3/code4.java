
/*

Que 4 : WAP to print each reverse numbers in the given range
Input: start:25435
end: 25449

 */

  class solution {
    
     static int reverseNumber(int num) {
        
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum * 10 + digit;
            num /= 10;
        }
        return sum;
    }

     static void printReverseNumbers(int start, int end) {
       
        for (int i = start; i <= end; i++) {
       
            int rev = reverseNumber(i);
       
            System.out.println(i + " reversed is " + rev);
        }
    }

    public static void main(String[] args) {
        
        int start = 25435;
        
        int end = 25449;
        
        printReverseNumbers(start, end);
    }
}
