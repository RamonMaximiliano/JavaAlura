import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! This is a test");

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();    
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);
    }
}


/* 
Tes comment

API:
https://imdb-api.com/en/API/Top250Movies/k_n3fyslp2

https://imdb-api.com/api/#Top250Movies-header

Imersão Java 2ª edição | Aula 01 | Desafio 01

https://www.youtube.com/watch?v=v4Dpul7b5bU&ab_channel=Alura

Main class video: 1:05 min
https://www.youtube.com/watch?v=D2NpRPs4CcE&ab_channel=Alura

Read:
https://www.alura.com.br/imersao-java/aula01-consumindo-api-com-java
https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code
https://code.visualstudio.com/docs/java/java-tutorial#_coding-pack-for-java
https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java



JSON examples:

https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json


*/