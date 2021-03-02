package Prueba;

public class Poligonos {
    public int CantidadLados;
    public int altura;
    public int base;
    // Constructor
    public Poligonos(){ 
    }
    public Poligonos(int CantidadLados, int altura, int base){
        this.CantidadLados = CantidadLados;
        this.altura = altura;
        this.base = base;
    }
    // Getters
    public int getCantidadLados(){
            return CantidadLados;
        }
    public int getaltura(){
            return altura;
        }
    public int getbase(){
            return base;
        }
    // Setters
    public void setCantidadLados (int CantidadLados){
            this.CantidadLados = CantidadLados;
        }
    public void setaltura (int altura){
            this.altura = altura;
        }
    public void setbase (int base){
            this.base = base;
        }
    // Metodos
    public void area(){
        if(CantidadLados == 3){
            System.out.println("El area del triangulo es " + ((altura * base) / 2));
        } else if(CantidadLados == 4){
            System.out.println("El area del rectangulo es " + (altura * base));
        }
    }
}

