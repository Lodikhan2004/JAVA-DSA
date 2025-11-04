import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //method 1
       /*  int marks[]=new int[3];
        marks[0]=99;
        marks[1]=63;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

       //method 2
       /* int num[]={99,98,100};
        for(int i=0; i<3; i++){
            System.out.println(num[i]);
        } */
         
        //method 3 taking input from user and giving output
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Elements of the array:"+" ");
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }
        sc.close();
    }
    
}
