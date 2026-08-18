package tn.proxyPattern.svc;

public class AIClient {

    private final AIService aiService;

    public AIClient(AIService aiService) {
        this.aiService = aiService;
    }

    public void ask(String prompt) {

        System.out.println("Prompt: " + prompt);

        String response =
                aiService.generateResponse(prompt);

        System.out.println("Response: " + response);
    }
}