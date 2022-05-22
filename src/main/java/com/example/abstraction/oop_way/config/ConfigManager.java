package com.example.abstraction.oop_way.config;

public interface ConfigManager {
    public <T> T readConfig(String filename, Class<T> configClass);
    public <T> void writeConfig(String filename, T configData);
}