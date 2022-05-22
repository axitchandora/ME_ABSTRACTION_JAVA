package com.example.abstraction.base_code.dto;

public class ResolvConfig {
    private String nameserver;
    private String options;

    public String getNameserver() {
        return nameserver;
    }

    public void setNameserver(String nameserver) {
        this.nameserver = nameserver;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "ResolvConfig [nameserver=" + nameserver + ", options=" + options + "]";
    }

    
}