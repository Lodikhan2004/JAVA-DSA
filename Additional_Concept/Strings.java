package Additional_Concept;
import java.util.*;
public class Strings {
    public static void print(String full){
        for(int i =0; i<full.length(); i++){
            System.out.print(full.charAt(i)+" ");
        }

    }
    public static double direction(String str){
        int x=0, y=0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i)== 'S'){
                y--;

            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        double shortestPath = Math.sqrt(x2 + y2);
        return shortestPath;

    }
    public static boolean palindrom( String str){
        
        for(int i=0; i< str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
              
                return false;
            }
           
        }
        return true;
    }
     
       
public static String toUpper(String str){
    StringBuilder str1 = new StringBuilder(" ");
    str1.append(Character.toUpperCase(str.charAt(0)));
    for(int i=1; i < str.length(); i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
            str1.append(str.charAt(i));
            i++;
            str1.append(Character.toUpperCase(str.charAt(i)));

        }
        else{
            str1.append(str.charAt(i));
        }

    }return str1.toString();

    
}
public static String stringCompress(String str){
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<str.length(); i++){
        
        Integer count = 1;
        while( i<= str.length()-2 && str.charAt(i) == str.charAt(i+1) ){//i<n-2
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count > 1){
            sb.append(count.toString());
        }
        
   }
   return sb.toString();

}

public static void main(String[] args) {
    String str = "abcd";
    System.out.println(stringCompress(str));
    // System.out.println(toUpper(str));
   


    // String fruit[] = {"apple","mango", "banana"}; 
    // String largest = fruit[0];
    // for(int i=1; i< fruit.length;i++){
    //     if(largest.compareTo(fruit[i]) < 0){
    //         largest = fruit[i];
    //     }
    // }
    // String str ="afzal";
    // System.out.println(System.identityHashCode(str));
    // str ="afzala";
    // System.out.println(System.identityHashCode(str));

    // StringBuilder sb = new StringBuilder("");
    // for(char ch = 'a'; ch<='z' ; ch++){
    //     sb.append(ch);
       
    // }
    // System.out.println(sb);
    // System.out.println(str);
    // System.out.println("largest string :" + largest);
    // String s1 = "apple";
    // System.out.println(s1.substring(0, 5));
    // // String s2 = new String("Tony");
    // System.out.println(s1.equals(s2));
    // String str = "WNEENESENNN";
    // System.out.println("Shortest path is : "+ direction(str));
    // // String str = "racpcar";
    // System.out.println(palindrom(str));


//     String str = "afzal";
//     System.out.println(str);
//     String str1 = new String("khan");
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a string");
//     String name = sc.nextLine();
//     System.out.println(name);
//    System.out.println("lenght : " + name.length());

    // String str1 = "afzal";
    // String str2 ="khan";
    // String full = str1 + " "+str2;
    // print(full);
}

}
