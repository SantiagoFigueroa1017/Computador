package Tiempo.services;

import Tiempo.models.Reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RelojService {

    private Scanner sc;
    private Reloj reloj;

    public RelojService(){
        sc = new Scanner(System.in);
    }

    public void crearHora(){
        System.out.println("Ingrese la hora");
        int hora = sc.nextInt();
        System.out.println("Ingrese los minutos");
        int minuto = sc.nextInt();
        System.out.println("Ingrese los segundos");
        int segundos = sc.nextInt();

        reloj = new Reloj(hora, minuto, segundos);
        formato24Horas(reloj);



    }

    private void formato24Horas(Reloj reloj){

    }

    private void formato12Horas(Reloj reloj){

    }


}
