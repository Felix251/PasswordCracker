package FactoryMethod.PasswordCracker;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientPostForm {
    public HttpClientPostForm() {

    }

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    public  int getPassword(String url, String email, String password)
            throws IOException, InterruptedException {

        // formatage des donnees en json pour l'envoyer a mon api
        String json = new StringBuilder()
                .append("{")
                .append("\"email\":\""+email+"\",")
                .append("\"password\":\""+password+"\"")
                .append("}").toString();

        // donnee d'entete http
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(url))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return (response.statusCode());
    }
}
