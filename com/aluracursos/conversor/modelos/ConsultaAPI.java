package com.aluracursos.conversor.modelos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public String consultarMonedas(String monedaBase,String monedaConvertir, double montoConvertir) throws IOException, InterruptedException {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d14d159c08cd0af96f386cfb/pair/" + monedaBase + "/"
                    + monedaConvertir + "/" + montoConvertir);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            var json = response.body();
            JsonElement jsonElement = JsonParser.parseString(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            return jsonObject.get("conversion_result").getAsString();
        }
        catch (NumberFormatException e) {
            System.out.println("Ocurrio un error!!!!!!");
            throw new RuntimeException("Error" + e.getMessage());
        }

    }


}
