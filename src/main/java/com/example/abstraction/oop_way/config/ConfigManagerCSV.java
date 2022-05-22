package com.example.abstraction.oop_way.config;

public class ConfigManagerCSV implements ConfigManager {
    public static final String CONFIG_FOLDER = "src/main/java/com/example/abstraction/oop_way/config_files/";

    public <T> T readConfig(String filename, Class<T> configClass) {
        // Similarly you can write this function to read from csv
        return null;
    }

    public <T> void writeConfig(String filename, T configData) {
        // Similarly you can write this function to read from csv
    }
}