package Tiempo;

import Tiempo.services.RelojService;

public class Main {
    public static void main(String[] args){
        RelojService relojService = new RelojService();
        relojService.crearHora();
    }
}
