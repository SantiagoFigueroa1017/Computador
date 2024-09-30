package Tiempo.models;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundos;

    public Reloj(){
        this.hora = 0;
        this.minuto = 0;
        this.segundos = 0;
    }

    public Reloj(int hora, int minuto, int segundos){
        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundos=" + segundos +
                '}';
    }
}
