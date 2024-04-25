package joaovitorlopes.com.github.main;

import joaovitorlopes.com.github.calculations.Sortable;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter a movie name for search:");
        var search = reading.nextLine();
        String url = "https://www.omdbapi.com/?t=" + search + "&apikey=5c08242";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
