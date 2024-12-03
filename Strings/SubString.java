package Strings;

public class SubString {
    //MY LOGIC
    /*public static String subString(String str, int sindex,int eindex){
        String subStr="";
        for(int i=sindex; i<eindex; i++){
            subStr +=str.charAt(i);

        }
        return subStr;
    }*/
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("SUB STRING :" + str.substring(0, 5));
        //System.out.println(subString(str,0,3));
    }
    
}
