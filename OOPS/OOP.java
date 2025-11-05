package OOPS;

public class OOP{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // crated a pen object
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.name = "adf";
        myAcc.setPassword(646);
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

class BankAccount{
    public String name;
    private int password;

    public void setPassword(int newpassword){
        password = newpassword;
    }

}

  





