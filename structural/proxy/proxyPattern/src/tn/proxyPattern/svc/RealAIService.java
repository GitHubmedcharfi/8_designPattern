package tn.proxyPattern.svc;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RealAIService implements AIService {

    private final String apiUrl;
    private final String model;

    private final HttpClient httpClient;

    public RealAIService(String apiUrl, String model) {
        this.apiUrl = apiUrl;
        this.model = model;
        this.httpClient = HttpClient.newHttpClient();
    }

    @Override
    public String generateResponse(String prompt) {

        try {

            // Ollama /api/generate request body
            String jsonBody = """
                    {
                      "model": "%s",
                      "prompt": "%s",
                      "stream": false
                    }
                    """.formatted(
                            model,
                            escapeJson(prompt)
                    );

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                    .build();

            HttpResponse<String> response =
                    httpClient.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );

            if (response.statusCode() != 200) {

                throw new RuntimeException(
                        "Ollama API error: "
                                + response.statusCode()
                                + " - "
                                + response.body()
                );
            }

            return extractResponse(response.body());

        } catch (IOException | InterruptedException e) {

            Thread.currentThread().interrupt();

            throw new RuntimeException(
                    "Failed to call Ollama API",
                    e
            );
        }
    }

    private String escapeJson(String text) {

        return text
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r");
    }

    private String extractResponse(String json) {

        String marker = "\"response\":\"";

        int start = json.indexOf(marker);

        if (start == -1) {
            return json;
        }

        start += marker.length();

        int end = json.indexOf("\"", start);

        if (end == -1) {
            return json.substring(start);
        }

        return json.substring(start, end);
    }
}