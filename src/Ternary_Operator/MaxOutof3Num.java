package Ternary_Operator;

public class MaxOutof3Num {
    public static void main(String[] args) {
        int a = 54667;
        int b = 289987834;
        int c = 5674;

        String max = a > b ? (a > c ? "a is max" : "c is max") : (b > c ? "b is max" : "c is max");
        System.out.println(max);
    }
}