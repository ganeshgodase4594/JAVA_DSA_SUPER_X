
/*

Que 5 : WAP to count the size of given string
(without using inbuilt method)

 */

 class solution{

    static int size(String str){

        char arr[]=str.toCharArray();

        int count=0;

        for(int i=0;i<arr.length;i++){

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        
        String str="ganesh";

        System.out.println("size of string is "+size(str));
    }
 }