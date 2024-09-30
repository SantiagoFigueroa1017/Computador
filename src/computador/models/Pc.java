package computador.models;

public class Pc {
    private String procesador;
    private int ram;
    private int espacioDisco;
    private String sistemaOperativo;

    public Pc(){
        this.procesador = "";
        this.ram = 0;
        this.espacioDisco = 0;
        this.sistemaOperativo = "";
    }

    public Pc(String procesador, int ram, int espacioDisco, String sistemaOperativo){
        this.procesador = procesador;
        this.ram = ram;
        this.espacioDisco = espacioDisco;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getEspacioDisco() {
        return espacioDisco;
    }

    public void setEspacioDisco(int espacioDisco) {
        this.espacioDisco = espacioDisco;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", espacioDisco=" + espacioDisco +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
