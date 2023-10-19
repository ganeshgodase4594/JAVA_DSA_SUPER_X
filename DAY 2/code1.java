
/*

Que 1 : WAP to print the following pattern
Take input from user
A B C D
B C D E
C D E F
D E F G

 */

 class solution{

    static void printpattern(int row,int col){

        char ch='A';

        for(int i=0;i<row;i++){
            
            char ch1=ch;

            for(int j=0;j<col;j++){

                 System.out.print(ch1+" ");
                 ch1++;
    
            }
            System.out.println();
            ch++;
        }
    }

    public static void main(String[] args) {
        
        int row=4;
        int col=4;

        printpattern(row, col);
    }
 }

