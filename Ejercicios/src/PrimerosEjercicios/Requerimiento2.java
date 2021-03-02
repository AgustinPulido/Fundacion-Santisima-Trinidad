package PrimerosEjercicios;

import java.util.Locale;
import java.util.Scanner;

public class Requerimiento2 {
    public Requerimiento2() {
        super();
    }

    public static void main(String[] args) {
        Requerimiento2 requerimiento2 = new Requerimiento2();
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base");
        float base = sc.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = sc.nextFloat();
        float areaRectangulo = base * altura;
        float areaTriangulo = (base * altura) / 2;
        if (areaRectangulo > 124.5){
            System.out.println("Se ha superado el valor permitido");
        }
    }
}
