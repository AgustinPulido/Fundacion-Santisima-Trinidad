package PrimerosEjercicios;

import java.util.Scanner;

public class Requerimiento4 {
    public Requerimiento4() {
        super();
    }

    public static void main(String[] args) {
        Requerimiento4 requerimiento4 = new Requerimiento4();
        Scanner teclado = new Scanner(System.in);
        Float base = teclado.nextFloat();
        Float altura = teclado.nextFloat();
        Float areaRectangulo = base * altura;
        Float areaTrianguloRec = areaRectangulo / 2;
        System.out.println("Altura = " + altura);
        System.out.println("base = " + base);
        System.out.println("�rea rect�ngulo = " + areaRectangulo);
        System.out.println("�rea tri�ngulo rect�ngulo = " + areaTrianguloRec);
        if (areaRectangulo.compareTo(789.5f) > 0) {
            System.out.println("El �rea del rect�ngulo es mayor a: " + "789,5 m");
        }
    }
}
