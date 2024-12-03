package Strings;

public class LargestString {
    public static String largestString(String fruit[]){
        String largest = fruit[0];
        for(int i=1; i<fruit.length;i++){
            //if apple < mango
            if(largest.compareToIgnoreCase(fruit[i])<0){ //if largest is < nextString then largest =nextString
                largest=fruit[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
       String fruit[]={"apple","mango","banana"};
       System.out.println("Largest String is :" + largestString(fruit));
    }
    
}
//TIME COMPLEXITY ==> O(x*N) WHERE X is largest number of string and N is no of strings 
                        