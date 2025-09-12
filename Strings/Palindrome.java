import java.util.*;

public class Palindrome {

    // public static boolean isPalindrome(String str) {
    //     char left = 0, right = str.length()-1;

    //     while (left < right) {
    //         if (charAt(left) != charAt(right)) {
    //             return false;
    //         }

    //         left++;
    //         right--;
    //     }
    //     return true;

    // }

    // public static void main(String args[]) {
    //     String str = "Racecar";
    //     System.out.println(isPalindrome(str));
    // }


    // finding shotest path

    public static float shotestpath(String path){

        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            if(dir == "S"){
                y--;
            }
            else if(dir == "N"){
                y++;
            }
            else if( dir == "W"){
                x--;
            }
            else{
                x++;
            }
 
        
        }

        

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

        
    }


    public static void main(String args[]){
        String path = "WWEEESSNNEE";
        System.out.println(shotestpath(path));
    }
}
