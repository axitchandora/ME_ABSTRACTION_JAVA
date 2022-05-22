package com.example.abstraction.oop_way.config;

import java.io.File;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigManagerXML implements ConfigManager {
    public static final String CONFIG_FOLDER = 
        "src/main/java/com/example/abstraction/oop_way/config_files/";
    public static final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T readConfig(String filename, Class<T> configClass) {
        T config = null;
        try {
            File filePath = Paths.get(CONFIG_FOLDER + filename + ".xml").toFile();
            JAXBContext context = JAXBContext.newInstance(configClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            config = (T) unmarshaller.unmarshal(filePath);        
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        return config;
    }

    public <T> void writeConfig(String filename, T configData) {
        try {
            File filePath = Paths.get(CONFIG_FOLDER + filename + ".xml").toFile();
            File configDir = new File(CONFIG_FOLDER);
            boolean bool = configDir.mkdir();
            JAXBContext context = JAXBContext.newInstance(configData.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(configData, filePath);
        
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}