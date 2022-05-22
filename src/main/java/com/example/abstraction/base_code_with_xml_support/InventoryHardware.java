package com.example.abstraction.base_code_with_xml_support;

import com.example.abstraction.base_code_with_xml_support.config.ConfigManager;
import com.example.abstraction.base_code_with_xml_support.dto.MySqlConfig;

public class InventoryHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of inventory team");
        ConfigManager.writeConfigToJson("inventory_mysql_config.json", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of inventory team");
        MySqlConfig mySqlConfig = ConfigManager.readConfigFromJson("inventory_mysql_config.json", MySqlConfig.class);
        return mySqlConfig;
    }
}