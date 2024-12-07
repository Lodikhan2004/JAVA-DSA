package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class isAnagrams {
    public static void is_anagrams(String str1 , String str2){
       //convert to lower case
       String lowStr1=str1.toLowerCase();
       String lowStr2=str2.toLowerCase();

       //convert to char array
       char str1arr[] = lowStr1.toCharArray();
       char str2arr[] = lowStr2.toCharArray();

       //sort the arrays
       Arrays.sort(str1arr);
       Arrays.sort(str2arr);


       // check if length are same
       if(str1arr.length == str2arr.length){

            boolean result = Arrays.equals(str1arr, str2arr);
            if(result){
                System.out.println("anagram");
            }
           else{
                System.out.println("not anagram");
            }

        }
        else{
            System.out.println("not anagram");
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 2 STRINGS");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        is_anagrams(str1, str2);
        sc.close();
    }
    
}
