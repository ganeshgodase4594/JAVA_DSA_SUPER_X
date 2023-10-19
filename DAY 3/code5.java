
/*

Que 5 : WAP to check whether the string contains characters other than
letters.

 */

  class solution {

     static boolean containsNonLetters(String str) {
    
        for (char ch : str.toCharArray()) {
            
            if (!Character.isLetter(ch)) {
               
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      
        String str = "ganesh123";

        if (containsNonLetters(str)) {
           
            System.out.println("The string contains characters other than letters.");
        } else {
           
            System.out.println("The string contains only letters.");
        }
    }
}
