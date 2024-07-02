package com.duoc.primesecure;

import java.util.Scanner;
import primesecure.entites.PrimesList;

public class PrimeSecure {
/*  Que tal profesor, espero se encuentre muy bien, le comento un poco sobre el proyecto
    y es mas que nada por la simplisidad de este. Como aun no estan todas las indicaciones
    para crear el sistema por completo, me enfoque en los objetivos de la rubrica, implementando
    la herencia de clases en PrimesList, sobreescribi sus metodos e implemente los metodos
    que se encargaran de trabajar con numeros primos.
    Asique nada, a modo de ejemplo de estos metodos, deje al comienzo un recuento de registros
    y apartir de ahi, la idea es que elija un numero para que representa la cantidad de numeros que 
    se trataran de agregar a la lista. Al agregarlos definira si son numeros primos, y si esque no
    lanzara la excepcion IllegalArgumentException, sin detener el flujo del sistema.
    De antemano muchas gracias por la revision
    */
    public static void main(String[] args) {
        PrimesList primesList = new PrimesList();
        Scanner sc = new Scanner(System.in);
        int registros = 0;
        System.out.println("Bienvenido al sistema de mensajeria de Prime Secure");
        System.out.println("De momento esto solo es una alfa y se esta comprobando el metodo de encriptacion de mensajeria");
        System.out.println("Para iniciar, cuantos registros desea ingresar?");
        registros = sc.nextInt();

        for (int i = 0; i < registros; i++) {
            System.out.println("Ingrese un numero para ver si es primo o no");
            int numero = sc.nextInt();
            try {
                primesList.add(numero);
                System.out.println("Numero agregado a la lista");
            } catch (IllegalArgumentException e) { //Uso de IllegalArgumentException
                e.printStackTrace();
            }
        }
        //Imprimo la lista de numeros primos
        primesList.getPrimesCount(primesList);
    }

}
