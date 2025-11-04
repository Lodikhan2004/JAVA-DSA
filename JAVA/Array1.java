import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE SEARCH ELEMENT:");
        int elem=sc.nextInt();
        sc.close();
        for(int j=0;j<n;j++){
            if(arr[j]==elem){
                System.out.println("Element " + elem + "found at position" + j);
                return;
            }
        }
        System.out.println("not found");
    
    }
}

