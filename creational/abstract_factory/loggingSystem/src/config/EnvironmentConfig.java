package config;

import factory.CloudFactory;
import factory.DevFactory;
import factory.LoggingFactory;
import factory.ProdFactory;

public class EnvironmentConfig {

    public static LoggingFactory getFactory(String env) {
        switch (env.toUpperCase()) {
            case "DEV":
                return new DevFactory();
            case "PROD":
                return new ProdFactory();
            case "CLOUD":
                return new CloudFactory();
            default:
                throw new IllegalArgumentException("Unknown environment: " + env);
        }
    }
}
