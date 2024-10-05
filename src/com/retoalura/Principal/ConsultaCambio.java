package com.retoalura.Principal;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {
    Moneda buscarCambio(String origen, String destino, int monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/72c2d7b1a01cfc20052ec5b8/pair/"+ origen + "/" + destino + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda");
        }

    }
}
