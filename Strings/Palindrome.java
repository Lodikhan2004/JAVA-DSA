package Strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int n= str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){// (n-1-i)==> last elem
                return false;
            }
        }
        return true;


        /* ==> my logic
        int n= str.length();
        int end=n-1;
        for(int i=0; i<=n-1; i++){
            if(str.charAt(i) != str.charAt(end)){// (n-1-i)==> last elem
                return false;
            }
            end--;
        }
        return true; */
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String name=sc.nextLine();
        
        if( isPalindrome(name)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
        sc.close();
    } //TIME COMPLEXITY ==> O(n)
    
}
