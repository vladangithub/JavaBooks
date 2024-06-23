package Shildt.P1.Ch3;
/*
Динамическая инициализация. программа вычисляет длину гипотенузы прямоугольного треугольника при известных катетах
 */
public class DinInitP92 {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Длина гипотенузы равна " + c);
    }
}
