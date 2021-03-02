package PrimerosEjercicios;

import java.util.Scanner;

public class Requerimiento3 {
    public Requerimiento3() {
        super();
    }

    public static void main(String[] args) {
        Requerimiento3 requerimiento3 = new Requerimiento3();
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextFloat();
        double altura = teclado.nextFloat();
        double areaRectangulo = base * altura;
        double areaTrianguloRec = areaRectangulo / 2;
        System.out.println("Altura = " + altura);
        System.out.println("base = " + base);
        System.out.println("Área rectángulo = " + areaRectangulo);
        System.out.println("Área triángulo rectángulo = " + areaTrianguloRec);
        if (areaRectangulo > 365.5) {
            System.out.println("El área del rectángulo es mayor a: " + "365,5 m");
        }
    }
}
