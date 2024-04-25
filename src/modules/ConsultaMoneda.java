package modules;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaConversion(String monedaEntrada, String monedaSalida) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/ca3f722ac5cf73a786281366/pair/" + monedaEntrada + "/" + monedaSalida);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró la conversión.");
        }

    }
}
