package OOPS;


public class Getters_Setters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());

        System.out.println(p1.getColor());
    }
    
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

