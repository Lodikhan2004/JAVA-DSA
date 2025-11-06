package OOPS;


/*                       Function Overloading

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(10,10));
        System.out.println(c1.sum(1.3f,1.3f));
        System.out.println(c1.sum(10,10,10));
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
*/

// Funtion Overriding
public class Polymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        Animal a =new Animal();
        a.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eat's anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat's grass");
    }
}

