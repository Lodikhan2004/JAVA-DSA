package Strings;

import java.util.Scanner;

public class printCharacters {
    public static void print(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String name=sc.nextLine();
        print(name);
        sc.close();
    }
    
}
