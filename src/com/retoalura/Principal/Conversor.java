package com.retoalura.Principal;

public class Conversor {

    public void ejecutar(String monedaOrigen, String monedaDestino, int monto) {
        ConsultaCambio consulta = new ConsultaCambio();

        try {
            Moneda moneda = consulta.buscarCambio(monedaOrigen, monedaDestino, monto);
            if (moneda.result().equalsIgnoreCase("error")) {
                System.out.println("Error en la conversión, posiblemente origen o destino incorrecto");
            } else {
                System.out.println("Moneda origen.: " + moneda.base_code());
                System.out.println("Moneda destino: " + moneda.target_code());
                System.out.println("Tipo de cambio: " + moneda.conversion_rate());
                System.out.println("Conversión....: " + moneda.conversion_result());
                System.out.println("Actualizado en: " + moneda.time_last_update_utc());
            }
        } catch (NumberFormatException e) {
            System.out.println("Moneda no encontrada");
        }
    }
}
