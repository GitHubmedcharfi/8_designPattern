package tn.proxyPattern.svc;

import java.util.HashMap;
import java.util.Map;

public class AIServiceProxy implements AIService {

    private final AIService realAIService;

    private final Map<String, String> cache = new HashMap<>();

    public AIServiceProxy(AIService realAIService) {
        this.realAIService = realAIService;
    }

    @Override
    public String generateResponse(String prompt) {

        if (cache.containsKey(prompt)) {

            System.out.println("[Proxy] Response found in cache.");

            return cache.get(prompt);
        }

        System.out.println(
                "[Proxy] Cache miss. Calling real AI service..."
        );

        String response =
                realAIService.generateResponse(prompt);

        cache.put(prompt, response);

        System.out.println(
                "[Proxy] Response stored in cache."
        );

        return response;
    }
}