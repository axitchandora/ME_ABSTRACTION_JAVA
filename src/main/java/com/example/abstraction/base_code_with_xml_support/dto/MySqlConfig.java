package com.example.abstraction.base_code_with_xml_support.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "config")
public class MySqlConfig {
    private int maxThreads;
    private int port;
    private int maxConn;

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

    public int getMaxConn() {
        return maxConn;
    }

    @XmlElement
    public void setMaxConn(int maxConn) {
        this.maxConn = maxConn;
    }

    @Override
    public String toString() {
        return "MySqlConfig [maxConn=" + maxConn + ", maxThreads=" + maxThreads + ", port=" + port + "]";
    }
    
}