package com.example.abstraction.base_code.dto;

public class MySqlConfig {
    private int maxThreads;
    private int port;
    private int maxConn;

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

    public int getMaxConn() {
        return maxConn;
    }

    public void setMaxConn(int maxConn) {
        this.maxConn = maxConn;
    }

    @Override
    public String toString() {
        return "MySqlConfig [maxConn=" + maxConn + ", maxThreads=" + maxThreads + ", port=" + port + "]";
    }
    
}