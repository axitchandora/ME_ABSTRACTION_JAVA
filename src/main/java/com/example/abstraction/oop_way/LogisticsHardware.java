package com.example.abstraction.oop_way;

import com.example.abstraction.oop_way.config.ConfigManager;
import com.example.abstraction.oop_way.config.ConfigManagerXML;
import com.example.abstraction.oop_way.dto.MySqlConfig;
import com.example.abstraction.oop_way.dto.RestServerConfig;


public class LogisticsHardware {
    ConfigManager configManager = new ConfigManagerXML();
    
    public void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of logistics team");
        configManager.writeConfig("logistics_mysql_config", mySqlConfig);
    }

    public MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of logistics team");
        MySqlConfig mySqlConfig = configManager.readConfig("logistics_mysql_config", MySqlConfig.class);
        return mySqlConfig;
    }

    public void storeLogisticsRestServerConfig(RestServerConfig restServerConfig) {
        System.out.println("Storing rest_server config of logistics team");
        configManager.writeConfig("logistics_rest_server", restServerConfig);
    }

    public RestServerConfig readLogisticsRestServerConfig() {
        System.out.println("Reading rest_server config of logistics team");
        RestServerConfig restServerConfig = configManager.readConfig("logistics_rest_server",
                RestServerConfig.class);
        return restServerConfig;
    }
}