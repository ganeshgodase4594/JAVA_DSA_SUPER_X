
/*

Que 3 : WAP to check whether the given no is a palindrome number or not.

 */

 class solution{

    static boolean chechpalindrome(int n){

        int temp=n;
        int sum=0;

        while(n!=0){

            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }

        if(temp==sum){

            return true;
        }
        return false;

    } 
    public static void main(String[] args) {
        
        int n=343;

        if(chechpalindrome(n)){

            System.out.println(n+" is a palondrome number");
        }else{
             System.out.println(n+" is a palondrome number");
        }
    }
 }