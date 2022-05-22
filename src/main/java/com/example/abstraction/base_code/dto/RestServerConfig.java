package com.example.abstraction.base_code.dto;

public class RestServerConfig {
    private int maxThreads;
    private int port;
    private int maxListeners;

    public int getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxListeners() {
        return maxListeners;
    }

    public void setMaxListeners(int maxListeners) {
        this.maxListeners = maxListeners;
    }

    @Override
    public String toString() {
        return "RestServer [maxListeners=" + maxListeners + ", maxThreads=" + maxThreads + ", port=" + port + "]";
    }
}