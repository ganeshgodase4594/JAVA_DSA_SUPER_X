
/*

Que 4 : WAP to print the odd numbers in the given range
Input: start:1
end:10

 */

 class solution{

    static void printrange(int start,int end){

        for(int i=start;i<=end;i++){

            if(i%2==1){

                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        
        int start=1;
        int end=10;

        printrange(start, end);
    }
 }