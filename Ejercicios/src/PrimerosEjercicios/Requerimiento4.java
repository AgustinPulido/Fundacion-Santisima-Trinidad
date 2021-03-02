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
        System.out.println("Área rectángulo = " + areaRectangulo);
        System.out.println("Área triángulo rectángulo = " + areaTrianguloRec);
        if (areaRectangulo.compareTo(789.5f) > 0) {
            System.out.println("El área del rectángulo es mayor a: " + "789,5 m");
        }
    }
}
