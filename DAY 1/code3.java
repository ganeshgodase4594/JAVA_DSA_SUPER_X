
/*

Que 3 : WAP to check whether the given no is odd or even

 */

 class solution{

    static void checkoddeven(int n){

        if(n%2==0){

            System.out.println(n+" is even no");
        }else{

            System.out.println(n+" is odd no");
        }
    }

    public static void main(String[] args) {
        
        int n=45;

        checkoddeven(n);
    }
 }