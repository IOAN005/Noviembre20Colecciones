package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Probar la interface set
        HashSet conjunto=new HashSet();  //sin utilizar polimorfismo
        Set conjunto1=new HashSet(); //utilizamos polimorfismo como recomendacion
        System.out.println("Esta vacio ?" + conjunto1.isEmpty());
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1);
        conjunto1.add("jardin");
        System.out.println(conjunto1);

        System.out.println("la colection contiene el elemento casa?" +conjunto1.contains("casa"));
        System.out.println("numero de elementos " +conjunto1.size());
        conjunto1.add("silla");
        conjunto1.add("mesa");
        System.out.println(conjunto1);
        conjunto1.add(5);
        System.out.println(conjunto1);

        Empleado e1=new Empleado(1);
        conjunto1.add(e1);
        System.out.println(conjunto1);
        System.out.println(conjunto1.remove(e1));
        System.out.println(conjunto1);
        System.out.println("Recorer el conjunto..");

        for (Object elemento:conjunto1
             ) {
            System.out.println(elemento.toString());
        }


    }
}