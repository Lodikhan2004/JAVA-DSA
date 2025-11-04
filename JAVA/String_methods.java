import java.util.Scanner;

public class String_methods {
    public static void main(String[] args) {
        
    /* 
    //concatination
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter first and last name:");
    String f_name=sc.nextLine();
    String l_name=sc.nextLine();
    sc.close();
    String fullname=f_name + " " + l_name;

    //length() method used to find length of string
    System.out.println(fullname.length());

    //charAt() method to retrive single charecters
    System.out.println(fullname.charAt(0));
    System.out.println(fullname.charAt(6));


    //charAt() method is used to print charecters in a string
     for(int i=0; i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
    }
    sc.close();

    //CompareTo() method compares 2 strings and returns some value
    // if s1>s2: +ve value
    // if s1==s2: zero
    //if s1<s2:  -ve value

    String name1="tony";
    String name2="tony";
    if(name1.compareTo(name2)==0){
        System.out.println("strings are equal");
    }
    else{
        System.out.println("strings are not equal");
    }
    

    //substring(start_index,end_index) method give substring of a complete string
    String sentence="Tony is mad";
    System.out.println(sentence.length());
    String name=sentence.substring(0,sentence.length());
    System.out.println(name);
    }

    //ParseInt method converts string to int 
    String str="123";
    int num=Integer.parseInt(str);
    System.out.println(num);

    */

    //toString method converts int value to string
    int num1=123;
    String str1=Integer.toString(num1);
    System.out.println(str1);
    System.out.println(str1.charAt(0));
    
    
}
}