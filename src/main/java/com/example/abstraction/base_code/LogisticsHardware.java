package com.example.abstraction.base_code;

import com.example.abstraction.base_code.config.ConfigManager;
import com.example.abstraction.base_code.dto.MySqlConfig;
import com.example.abstraction.base_code.dto.RestServerConfig;

public class LogisticsHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of logistics team");
        ConfigManager.writeConfig("logistics_mysql_config.json", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of logistics team");
        MySqlConfig mySqlConfig = ConfigManager.readConfig("logistics_mysql_config.json", MySqlConfig.class);
        return mySqlConfig;
    }

    public static void storeLogisticsRestServerConfig(RestServerConfig restServerConfig) {
        System.out.println("Storing rest_server config of logistics team");
        ConfigManager.writeConfig("logistics_rest_server.json", restServerConfig);
    }

    public static RestServerConfig readLogisticsRestServerConfig() {
        System.out.println("Reading rest_server config of logistics team");
        RestServerConfig restServerConfig = ConfigManager.readConfig("logistics_rest_server.json", RestServerConfig.class);
        return restServerConfig;
    }
}