package OOPS;

public class OOP{
    public static void main(String arg[]){
        // created pen object called p1
        Pen p1 = new Pen(); 
        p1.setColor("BLUE");
        System.out.println(p1.color);
        //p1.setTip(5);
        System.out.println(p1.tip = 5);

        //created Student object called s1
        Student s1 = new Student();
        double res=s1.percentage =85;
        System.out.println(res);
        
        //creted BankAccount obj called acc
        BankAccount acc = new BankAccount();
        acc.username="afzal";
        System.out.println(acc.username);
       
       //acc.password="lodi@123"; => cannot be accessed
       acc.setPassword("lodi@123");// can be modified

    }   
}

class BankAccount{
    public String username; //can be accessed
    private String password; //cannot be accessed

    public void setPassword(String pwd){ //can be accessed
        password = pwd;
    }
    

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    float percentage;
    
    void calcpercentage(int math ,int phy, int chem){
        percentage = (math + phy + chem)/3;
    }
}



