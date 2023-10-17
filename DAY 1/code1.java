
/*

Que 1 : WAP to print the following pattern
Take input from user
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7

 */

 class solution{

    static void printpattern(int row,int col){

        for(int i=1;i<=row;i++){

            int num=i;

            for(int j=0;j<col;j++){

                System.out.print(num+" ");
                num++;
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