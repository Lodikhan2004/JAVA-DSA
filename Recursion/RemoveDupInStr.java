package Recursion;

public class RemoveDupInStr {
    public static void RmvDuplInStr(String str, int i, StringBuilder newstr, boolean map[]){
    
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        int idx = str.charAt(i) - 'a';
        if(map[idx] == true){
            // duplicate
            //so check for next character
            RmvDuplInStr(str, i+1, newstr, map);  
        }
        else{
            // unique element: no duplicates
            map[idx] = true; // set the element as true : occured
            RmvDuplInStr(str, i+1, newstr.append(str.charAt(i)), map);
        }

    }
    public static void main(String arg[]){
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        String str = "appnnacollege";
        RmvDuplInStr(str, 0, newstr, map);

    }
    
}
