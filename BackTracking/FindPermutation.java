package BackTracking;

public class FindPermutation {
    public static void findPer(String str, String ans){
        //Base Case
        if(str.length() == 0){//empty String
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // abcde = ab + de => abde
            String Newstr = str.substring(0, i) + str.substring(i+1); //ending indx default last elem
            findPer(Newstr, ans + curr);
        }
    }
    public static void main(String arg[]){
        String str = "abc";
        findPer(str, "");

    }
    
}
