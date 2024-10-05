package com.retoalura.Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String origen, destino;
        int monto;

        var optMenu = 0;
        do {
            System.out.println("+-----------------------------------------------+");
            System.out.println("+              CONVERSOR DE MONEDAS             +");
            System.out.println("+-----------------------------------------------+");
            System.out.println("+                                               +");
            System.out.println("+ 1. GTQ - USD (Quetzales a Dólare américano)   +");
            System.out.println("+ 2. GTQ - ARS (Quetzales a Peso argentino)     +");
            System.out.println("+ 3. GTQ - CAD (Quetzales a Dólar canadiense)   +");
            System.out.println("+ 4. GTQ - CHF (Quetzales a Franco suizo)       +");
            System.out.println("+ 5. ACERCA DEL DESARROLLADOR                   +");
            System.out.println("+ 6. SALIR                                      +");
            System.out.println("+                                               +");
            System.out.println("+-----------------------------------------------+");
            System.out.println("OPCIÓN: ");
            optMenu = lectura.nextInt();

            Conversor conversor = new Conversor();

            monto = 0;
            if (optMenu != 5 && optMenu != 6) {
                System.out.println("Monto a convertir: ");
                monto = lectura.nextInt();
                lectura.nextLine();
            }

            origen = "GTQ";
            switch (optMenu) {
                case 1:
                    destino = "USD";
                    conversor.ejecutar(origen, destino, monto);
                    break;
                case 2:
                    destino = "ARS";
                    conversor.ejecutar(origen, destino, monto);
                    break;
                case 3:
                    destino = "CAD";
                    conversor.ejecutar(origen, destino, monto);
                    break;
                case 4:
                    destino = "CHF";
                    conversor.ejecutar(origen, destino, monto);
                    break;
                case 5:
                    System.out.println("Desarrollado por........: Fernando Iván Paz");
                    System.out.println("Nacimiento..............: 24 de dic. 1985");
                    System.out.println("País de origen..........: Guatemala");
                    System.out.println("Moneda origen utilizada.: GTQ (Quetzal guatemalteco)");
                    break;
            }

            if (optMenu != 6 && optMenu != 5) {
                System.out.println("+-----------------------------------------------+");
                System.out.println("Presione cualquier tecla para ir al menú");
                lectura.nextLine();
            }

            if (optMenu == 5) {
                try {
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("Volveras automáticamente en 5 segundos");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } while (optMenu != 6);
    }
}
