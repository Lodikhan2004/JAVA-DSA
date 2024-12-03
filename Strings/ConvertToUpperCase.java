package Strings;

public class ConvertToUpperCase {

    public static String upperCase(String str){

        StringBuilder newStr = new StringBuilder("");
        newStr.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){ //"hi, iam afzal " in this case index out of bound if this cond(i<str.length()-1) not written 
                newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString(); //converting StringBuilder to String
    }
    public static void main(String[] args) {
        String str ="hi, iam afzal khan ";
        //System.out.println(str.length());
        System.out.println(upperCase(str));
   }
    
}
