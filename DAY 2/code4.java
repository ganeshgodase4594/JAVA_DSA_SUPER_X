
/*

Que 4 : WAP to print the composite numbers in the given range
Input: start:1
end:100

 */

 class solution{

    static void checkprime(int start,int end){

        int count=0;

        for(int i=start;i<=end;i++){

            count=0;
            
            for(int j=1;j<=i;j++){

            if(i%j==0){

                count++;
            }
        }

        if(count==2){

            System.out.println(i+" is a prime number");
        }else{
           System.out.println(i+" is a composite number");
        }
    }
}
        

    public static void main(String[] args) {
        
        int n=47;

        int start=1;
        int end=100;

        checkprime(start, end);
    }
 }