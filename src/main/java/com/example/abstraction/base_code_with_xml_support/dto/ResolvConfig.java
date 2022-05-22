package com.example.abstraction.base_code_with_xml_support.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "config")
public class ResolvConfig {
    private String nameserver;
    private String options;

    public String getNameserver() {
        return nameserver;
    }
    
    @XmlElement
    public void setNameserver(String nameserver) {
        this.nameserver = nameserver;
    }

    public String getOptions() {
        return options;
    }

    @XmlElement
    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "ResolvConfig [nameserver=" + nameserver + ", options=" + options + "]";
    }

    
}