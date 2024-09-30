package Empresa.service;

import Empresa.models.Producto;

import java.util.Scanner;

public class Principal {

    private Producto producto;
    private Scanner sc;

    public Principal(){
        sc = new Scanner(System.in);

    }

    public void imprimirPredeterminados(){
        producto = new Producto();
        producto.imprimir();
    }

    public void imprimir(){
        if(producto != null){
            producto.imprimir();
        }else{
            System.out.println("Aún no se ha creado ningún producto");
        }
    }

    public void crearProducto(){
        System.out.println("Ingrese código del producto");
        String codigo = sc.next();
        System.out.println("Ingrese nombre del producto");
        String nombre = sc.next();
        System.out.println("Ingrese valor del producto");
        double valor = sc.nextDouble();

        producto = new Producto(codigo, nombre, valor);

    }
}
