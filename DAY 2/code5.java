
/*

Que 5 : WAP to check whether the string contains vowels and return
the count of vowels.

 */

 class solution{

    static int vowelscount(String str){

        int count=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='a'|| str.charAt(i)=='A' ||str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o'||str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U'){

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        System.out.println("no of vowel present in string is " + vowelscount("ganEsh"));
    }
 }