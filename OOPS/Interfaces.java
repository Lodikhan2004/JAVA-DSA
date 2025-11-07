package OOPS;
/* 
public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}

interface ChessPlayer{
    //abstract method by default no need to write abstract keyword
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal (in any direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal (By one step)");
    }
}
*/
public class Interfaces {
    public static void main(String[] args) {
        Child afzal =new Child();
        System.out.println(afzal.height);
        afzal.speakingStyle();
        afzal.cookingSkills();
      
        
    }
    
}

interface Father{
    int height = 180;
    void surname();
    void speakingStyle();
}

interface Mother{
    void cookingSkills();
}

class Child implements Father,Mother{

    public void surname(){
        System.out.println("Lodi");
    }

    public void speakingStyle(){
        System.out.println("speaks like Father");
    }

    public void cookingSkills(){
        System.out.println("Cooks delicious food like mom");
    }
}

