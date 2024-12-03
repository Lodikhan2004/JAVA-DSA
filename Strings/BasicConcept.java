package Strings;
import java.util.*;
public class BasicConcept {
    public static void main(String[] args) {
        /*char arr[] ={'a','b','c','d'};
        String str="abcd";
        String str1= new String("abcd");
        
        //String input
        Scanner sc=new Scanner(System.in);
        //String name =sc.nextLine();
        //System.out.println(name);
        
        //String length
        //System.out.println(name.length());

        //concatination
        String firstName ="Afzal";
        String lastName ="Khan";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName + " ==> FULL NAME LENGTH :"+ fullName.length());

        //charAt() function
        System.out.print(fullName.charAt(9));
        */

        //String Comparison
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        if(s1 == s3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
        


        
    }
    
}
