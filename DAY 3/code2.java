
/*

Que 2 : WAP to print the following pattern
Take row input from user
1
2 1
3 2 1
4 3 2 1

 */

 class solution{

    static void printpattern(int row,int col){

        int num=1;


        for(int i=1;i<=row;i++){

            num=i;

            for(int j=0;j<i;j++){

                System.out.print(num+" ");
                num--;
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
