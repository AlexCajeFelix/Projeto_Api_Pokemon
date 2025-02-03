import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import Pokemon.Pokemon;
import Pokemon.Types.Types;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String namePokemon = "Snorlax"; // Define o nome do Pokémon
        URI uri = URI.create("https://pokeapi.co/api/v2/pokemon/" + namePokemon);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        Gson gson = new Gson();
        Pokemon pokemon = gson.fromJson(response.body(), Pokemon.class);

        System.out.println("Name: " + pokemon.getName());

        for (Types type : pokemon.getTypes()) {
                System.out.println("- " + type.getType().getName()); 
        }
    }
}
