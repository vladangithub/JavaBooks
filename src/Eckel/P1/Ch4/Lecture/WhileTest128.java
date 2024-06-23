package Eckel.P1.Ch4.Lecture;

public class WhileTest128 {
    static boolean condition() {
        boolean result = Math.random() > 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'"); // внутри
        System.out.println("Exited 'while'"); // снаружи

    }
}
