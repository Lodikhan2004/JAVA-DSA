import java.util.Scanner;
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
public class String_arrayofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter array elements:");
        int total_length=0;
        for(int i=0;i<n;i++){
            a[i]=sc.next();
            total_length+=a[i].length();
        }
        System.out.println(total_length);
        
        sc.close();
        
    }
    
}
