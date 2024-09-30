package computador.services;

import computador.models.Pc;

import java.util.ArrayList;
import java.util.Scanner;

public class PcService {

    private Scanner sc;
    private Pc pc;
    private ArrayList<Pc> listaPc;

    public PcService(){
        sc = new Scanner(System.in);
        listaPc = new ArrayList<>();

    }

    public void menu (){
        System.out.println("::MENÚ::");

        System.out.println("1 - INGRESAR CARACTERÍSTICAS PC");
        System.out.println("2 - VER CARACTERÍSTICAS PC");
        System.out.println("Ingrese una opción del menú");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                caracteristicasPc();
                break;
            case 2:
                todasCaracteristicas();
                break;
            default:
                System.out.println("Gracis por utilizar este menú");
        }
    }

    public void caracteristicasPc(){
        System.out.println(":: CARACTERÍSTICAS PC::");

        System.out.println("Ingrese el procesador del pc");
        String procesador = sc.next();

        System.out.println("Ingrese la memoria Ram del pc");
        int ram = sc.nextInt();

        System.out.println("Ingrese el espacio del disco duro");
        int espacioDisco = sc.nextInt();

        System.out.println("Ingrese el sistema operativo del pc");
        String sistemaOperativo = sc.next();

        listaPc.add(new Pc(procesador, ram, espacioDisco, sistemaOperativo));

        menu();

    }

    public void verCaracteristicas(Pc pc){
            System.out.println("Procesador: " + pc.getProcesador() + " | "+  "Ram: " + pc.getRam() + "GB" + " | "
                    +"Espacio del Disco: "+pc.getEspacioDisco()+ "GB" + " | "+"Sistema Operativo: " + pc.getSistemaOperativo());

    }

    public void todasCaracteristicas(){
        if (listaPc.isEmpty()){
            System.out.println("No hay pc registradas");
        }else {
            for(Pc pc : listaPc){
                verCaracteristicas(pc);
                System.out.println("-------------------");
            }
            menu();
        }
    }

}
