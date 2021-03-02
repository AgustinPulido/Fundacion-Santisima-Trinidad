package PrimerosEjercicios;

public class Requerimiento1 {
    public Requerimiento1() {
        super();
    }

    public static void main(String[] args) {
        Requerimiento1 requerimiento1 = new Requerimiento1();
        int altura = 3;
        int base = 4;
        int areaRectangulo = base * altura;
        int areaTriangulo = (base * altura) / 2;
        System.out.println("El area del rectangulo es " + areaRectangulo);
        System.out.println("El area del triangulo es " + areaTriangulo);
    }
}
