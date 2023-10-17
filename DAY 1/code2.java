
/*

Que 2 : WAP to print the following pattern
Take row input from user
1
1 2
2 3 4
4 5 6 7

 */

 class solution{

    static void printpattern(int row,int col){

        int num=1;

        for(int i=1;i<=row;i++){

            for(int j=0;j<i;j++){

                System.out.print(num+" ");
                num++;
            }

            System.out.println();
            num--;
        }
    }

    public static void main(String[] args) {
        
        int row=4;
        int col=4;

        printpattern(row, col);
    }
 }