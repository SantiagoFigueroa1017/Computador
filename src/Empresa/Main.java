package Empresa;

import Empresa.service.Principal;

public class Main {

    public static void main(String[] args){
        Principal principal = new Principal();
        principal.imprimirPredeterminados();
        principal.crearProducto();
        principal.imprimir();

    }
}
