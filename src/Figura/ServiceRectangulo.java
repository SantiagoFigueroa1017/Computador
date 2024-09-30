package Figura;

import java.util.Scanner;

public class ServiceRectangulo {

    private Scanner sc;
    private Rectangulo rectangulo;

    public ServiceRectangulo(){
        sc = new Scanner(System.in);
    }

    public void crearFigura(){
        System.out.println("Ingrese la longitud del rectangulo");
        double longitud = sc.nextDouble();
        System.out.println("Ingrese la anchura del rectangulo");
        double anchura = sc.nextDouble();

        rectangulo = new Rectangulo(longitud, anchura);
        System.out.println("Perimetro: " + perimetro(rectangulo));
        System.out.println("Area: "+ area(rectangulo));
        System.out.println(rectangulo);
    }

private double perimetro(Rectangulo rectangulo){
    return 2 * (rectangulo.getLongitud() + rectangulo.getAnchura());
}

private double area(Rectangulo rectangulo){
    return (rectangulo.getLongitud() * rectangulo.getAnchura());
}

}
