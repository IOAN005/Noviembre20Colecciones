package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarList {
    public static void main(String[] args) {
        List lista=new ArrayList();
        System.out.println("Numero de elementos " + lista.size());
        System.out.println("esta vacia la lista ?" + lista.isEmpty());
        lista.add("casa");
        lista.add("casa");
        System.out.println(lista);
        System.out.println("Contiene el Sring casa -> " +lista.contains("casa"));
        lista.add(7);
        System.out.println("Obtener el elemento 0" + lista.get(0));
        lista.set(0,"Piso");
        System.out.println(lista);
        lista.set(0,"adosado");
        System.out.println(lista);
        System.out.println("Posicion del elemento numerico 7 ->" + lista.indexOf(7));
        lista.remove("adosado");
        System.out.println(lista);
        Empleado e1 =new Empleado(6);
        lista.add(e1);
        System.out.println(lista);
        System.out.println("recorer con un bucle");

        for (Object elemento:lista
             ) {
            System.out.println(elemento.toString());

        }
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        //DeclaRAR UN ARRAYde 5 elementos y recorrerlo
        int [] numeros={1,3,5,7,9};
        for (int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }
        //declarar un ARRAY DE LISTY DECORRERLO
        List articulos =new ArrayList();
        articulos.add("pantalon");
        articulos.add("camisa");
        articulos.add("zapatos");
        articulos.add("gorra");
        articulos.add("sudadera");

        for (Object elemento:articulos
             ) {
            System.out.println(elemento.toString());
        }



    }
}
