package Figura;

public class Rectangulo {
    public double longitud = 1.0;
    public double anchura = 1.0;



    public Rectangulo(double longitud, double anchura){
        setLongitud(longitud);
        setAnchura(anchura);

    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if(longitud > 0.0 && longitud < 20.0){
            this.longitud = longitud;
        } else {
            System.out.println("Error: Los valores deben ser mayores que 0.0 y menores que 20.0");
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if(anchura > 0.0 && anchura < 20.0){
            this.anchura = anchura;
        }else {
            System.out.println("Error: los valores deben ser mayores que 0.0 y menores que 20.0");
        }
    }


    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", anchura=" + anchura +
                '}';
    }
}
