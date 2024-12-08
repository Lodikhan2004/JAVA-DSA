package BitManipulation;

public class Operators {
    public static void main(String[] args) {
        int x=5 , y=6;
        //AND
        System.out.println("AND Operation :" + (x & y));

        //OR
        System.out.println("OR Operation :"+ (x | y));

        //XOR
        System.out.println("XOR Operation is: "+ (x ^ y));

        //NOT
        System.out.println("Ones Compliment :"+ (~0)); // o/p =>-1 (msb is 1)

        //Binary Left Shift (<<)
        //formula => a<<b = a * (2^b)
        System.out.println("Binary Left Shift is: " + (5 << 2));

        //Binary Right Shift (>>)
        //formula => a>>b = a / (2^b)
        System.out.println("Binary Right Shift is: " + (5 >> 2));



    }
    
}
