
/*

Que 2 : WAP to print the following pattern
Take row input from user
1
2 4
3 6 9
4 8 12 16

 */

 class solution{

    static void printpattern(int row,int col){

        int num=1;


        for(int i=1;i<=row;i++){

            num=i;

            for(int j=0;j<i;j++){

                System.out.print(num+" ");
                num=num+i;
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
