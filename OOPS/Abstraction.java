package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
    
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 leg");
    }

}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


/*  Constructor's in abstract class implementation : 
//child class object first calls parent class constructor then it's constructor
public class Abstraction {
    public static void main(String[] args) {
       
        Mustang m1 = new Mustang();
        System.out.println(m1.color);
    }
    
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called ");
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{

    
    Horse(){
        System.out.println("Horse constructor is called ");
        color = "darkbrown";
    }
    void walk(){
        System.out.println("walks on 4 leg");
    }

}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
        color ="White";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
*/