
/*

Que 3 : WAP to check whether the given no is prime or composite

 */

 class solution{

    static boolean checkprime(int n){

        int count=0;

        for(int i=1;i<=n;i++){

            if(n%i==0){

                count++;
            }
        }

        if(count==2){

            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        int n=47;

        if(checkprime(n)){

            System.out.println(n+" is a prime no");
        }else{

            System.out.println(n+" is a composite no");
        }
    }
 }