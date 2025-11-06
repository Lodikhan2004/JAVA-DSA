package OOPS;

/*                   Single-Level Inheritance 
             Animal
               │
               │
              Fish
               


*/
// Single-Level Inheritance 
public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        
    }
    
}
 
//Base Class / Super Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breath");
    }
}

//Derived Class / Sub Class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}



/*                    Multi-Level Inheritance
            Animal
               │
               │
            Mammal
               │
               │
              Dog


*/
/*  
public class Inheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog();
    
        puppy.breath();//Animal class

        puppy.legs = 4;
        System.out.println(puppy.legs);// Mammal Class

        System.out.println(puppy.breed="German");//Dog Class   
  
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//Derive Class
class Mammal extends Animal{
    int legs;

}

class Dog extends Mammal{
    String breed;
}
*/




/*                  Hierarchial-Level Inheritance 
            Animal
        /      |     \
   Mammal     Fish    Bird


*/
/*
public class Inheritance {
    public static void main(String[] args) {
        Fish shark =new Fish();
        shark.eat();
        Bird sparrow = new Bird();
        sparrow.breath();
    }
    
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//Derive Class 1
class Mammal extends Animal{
    void walk(){
        System.out.println("walk's");
    }

}

//Derive Class 2
class Fish extends Animal{
    void swim(){
        System.out.println("swim's");
    }

}

//Derive Class 3
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }

}
*/




/*                    Hybrib-Level Inheritance
                Animal
        /        |         \
   Mammal       Fish        Bird
    /   \        |          |
  Dog   Cat     Tuna      Peacock

*/

/* 
public class Inheritance {
    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.eat(); 
        p1.fly();
        p1.feathers();
      
    }
    
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

//Derive Class 1
class Mammal extends Animal{
    void walk(){
        System.out.println("walk's");
    }

}
class Dog extends Mammal{
    void breed(){
        System.out.println("German");
    }
}
class Cat extends Mammal{
    void breedOfCat(){
        System.out.println("Persian");
    }
}


//Derive Class 2
class Fish extends Animal{
    void swim(){
        System.out.println("swim's");
    }

}
class Tuna extends Fish{
    int size;
}

//Derive Class 3
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
class Peacock extends Bird{
    void feathers(){
        System.out.println("opens when rains");
    }
}
*/