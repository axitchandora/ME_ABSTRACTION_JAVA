package com.example.abstraction.base_code_with_xml_support.config;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigManager {
    public static final String CONFIG_FOLDER = "src/main/java/com/example/abstraction/base_code_with_xml_support/config_files/";
    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T readConfigFromJson(String filename, Class<T> configClass) {
        T config = null;
        File filePath = Paths.get(CONFIG_FOLDER + filename).toFile();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            config = objectMapper.readValue(filePath, configClass);
        } catch (IOException ex) {
            System.out.println("Error on reading data");
        }
        return config;
    }

    public static <T> void writeConfigToJson(String filename, T configData) {
        File filePath = Paths.get(CONFIG_FOLDER + filename).toFile();
        File configDir = new File(CONFIG_FOLDER);
        boolean bool = configDir.mkdir();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(filePath, configData);
        } catch (IOException ex) {
            System.out.println("Error on writing data");
        }
    }

    public static <T> T readConfigFromXML(String filename, Class<T> configClass) {
        T config = null;
        try {
            // Adapted from: https://attacomsian.com/blog/java-read-write-xml
            File filePath = Paths.get(CONFIG_FOLDER + filename).toFile();
        
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(configClass);
        
            // create an instance of `Unmarshaller`
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // read from XML file
            config = (T) unmarshaller.unmarshal(filePath);
        
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        return config;
    }

    public static <T> void writeConfigToXML(String filename, T configData) {
        try {
            // Adapted from: https://attacomsian.com/blog/java-read-write-xml
            File filePath = Paths.get(CONFIG_FOLDER + filename).toFile();
            File configDir = new File(CONFIG_FOLDER);
            boolean bool = configDir.mkdir();

            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(configData.getClass());
        
            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();
        
            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
            // convert user object to XML file
            marshaller.marshal(configData, filePath);
        
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}