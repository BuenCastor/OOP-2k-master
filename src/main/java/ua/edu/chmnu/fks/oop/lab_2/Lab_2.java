package ua.edu.chmnu.fks.oop.lab_2;

public class Lab_2 {

    private static double part1() {
        double a, b, c, x;
        a = 4.51;
        b = 6.23;
        c = 10.01;
        x = 2.21;

        double y = Math.pow(a, Math.cbrt(x + b)) + Math.exp(c * Math.log(2 * x - 1));
        System.out.println("answer with given values: " + y);
        return y;
    }

    private static double part2() {
        double a, b, c, x;
        double start = 1;
        double end = 10;
        a = start + Math.random() * (end - start); //Random value from 1 to 10
        b = start + Math.random() * (end - start);
        c = start + Math.random() * (end - start);
        x = Math.random() * Math.abs(end - start);

        double y = Math.pow(a, Math.cbrt(x + b)) + Math.exp(c * Math.log(2 * x - 1));
        System.out.println("answer with random values: " + y);
        return y;
    }

    public static void main(String[] args) {

        Lab_2.part1();
        Lab_2.part2();
    }
}
//4.51^(cbrt(x+6.23))+exp(10.01*log(2*x-1)) formula for wolfram alfa