package com.example.abstraction.oop_way.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "config")
public class RestServerConfig {
    private int maxThreads;
    private int port;
    private int maxListeners;

    public int getMaxThreads() {
        return maxThreads;
    }

    @XmlElement
    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public int getPort() {
        return port;
    }

    @XmlElement
    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxListeners() {
        return maxListeners;
    }

    @XmlElement
    public void setMaxListeners(int maxListeners) {
        this.maxListeners = maxListeners;
    }

    @Override
    public String toString() {
        return "RestServer [maxListeners=" + maxListeners + ", maxThreads=" + maxThreads + ", port=" + port + "]";
    }
}