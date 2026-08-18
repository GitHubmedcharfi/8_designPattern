package tn.proxyPattern.svc;

public class Main {

    public static void main(String[] args) {

        // Ollama local API
        String apiUrl = "http://localhost:11434/api/generate";

        // Ollama model
        String model = "tinyllama";

        // Real AI service
        AIService realAIService =
                new RealAIService(
                        apiUrl,
                        model
                );

        // Proxy around the real service
        AIService aiServiceProxy =
                new AIServiceProxy(realAIService);

        // Client uses the proxy
        AIClient client =
                new AIClient(aiServiceProxy);

        String prompt =
                "Explain the Proxy Design Pattern in Java.";

        System.out.println("===== First Request =====");
        client.ask(prompt);

        System.out.println();

        System.out.println("===== Second Request =====");
        client.ask(prompt);
    }
}