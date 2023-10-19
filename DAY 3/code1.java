
/*

Que 1 : WAP to print the following pattern
Take input from user
A B C D
D C B A
A B C D
D C B A

 */

  class solution{

    static void printpattern(int row,int col){

        char ch='A';

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

               if(i%2==0){

                 System.out.print(ch+" ");
                ch++;
               }else{

                 System.out.print(ch+" ");
                ch--;
               }
            }
            if(i%2==0){

                ch--;
            }else{
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int row=4;
        int col=4;

        printpattern(row, col);
    }
 }