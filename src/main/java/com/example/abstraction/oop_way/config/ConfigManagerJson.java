package com.example.abstraction.oop_way.config;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;


import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigManagerJson implements ConfigManager {
    public static final String CONFIG_FOLDER = "src/main/java/com/example/abstraction/oop_way/config_files/";
    public static final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T readConfig(String filename, Class<T> configClass) {
        T config = null;

        File filePath = Paths.get(CONFIG_FOLDER + filename + ".json").toFile();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            config = objectMapper.readValue(filePath, configClass);

        } catch (IOException ex) {
            System.out.println("Error on reading data");
        }

        return config;
    }

    public <T> void writeConfig(String filename, T configData) {
        File filePath = Paths.get(CONFIG_FOLDER + filename + ".json").toFile();
        File configDir = new File(CONFIG_FOLDER);
        boolean bool = configDir.mkdir();
        
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(filePath, configData);
            
        } catch (IOException ex) {
            System.out.println("Error on writing data");
        }
    }
}