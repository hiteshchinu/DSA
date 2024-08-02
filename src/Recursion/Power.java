package Recursion;

public class Power {

    public int powerOf(int n, int power) {
        if (power == 0) return 1;
        return n * powerOf(n, power - 1);
    }
    public static void main(String[] args) {
        Power obj = new Power();
        System.out.println(obj.powerOf(5, 3));
    }
    
}