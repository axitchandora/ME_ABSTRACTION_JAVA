package com.example.abstraction.base_code_with_xml_support;

import com.example.abstraction.base_code_with_xml_support.config.ConfigManager;
import com.example.abstraction.base_code_with_xml_support.dto.MySqlConfig;
import com.example.abstraction.base_code_with_xml_support.dto.RestServerConfig;

public class LogisticsHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of logistics team");
        ConfigManager.writeConfigToXML("logistics_mysql_config.xml", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of logistics team");
        MySqlConfig mySqlConfig = ConfigManager.readConfigFromXML("logistics_mysql_config.xml", MySqlConfig.class);
        return mySqlConfig;
    }

    public static void storeLogisticsRestServerConfig(RestServerConfig restServerConfig) {
        System.out.println("Storing rest_server config of logistics team");
        ConfigManager.writeConfigToXML("logistics_rest_server.xml", restServerConfig);
    }

    public static RestServerConfig readLogisticsRestServerConfig() {
        System.out.println("Reading rest_server config of logistics team");
        RestServerConfig restServerConfig = ConfigManager.readConfigFromXML("logistics_rest_server.xml",
                RestServerConfig.class);
        return restServerConfig;
    }
}