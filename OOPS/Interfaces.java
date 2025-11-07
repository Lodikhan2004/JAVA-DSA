package OOPS;
//Total Abstraction using Interfaces
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


/*                 Multiple-Inheritance using Interfaces
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


*/
// Diamond shape multiple inheretance example
/*interface A {
    void show();
}

interface B extends A { }

interface C extends A { }

class D implements B, C {
    public void show() {           // Must implement here
        System.out.println("Hello");
    }
}
 */