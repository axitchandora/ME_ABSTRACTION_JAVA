package com.example.abstraction.base_code;

import com.example.abstraction.base_code.config.ConfigManager;
import com.example.abstraction.base_code.dto.MySqlConfig;

public class InventoryHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of inventory team");
        ConfigManager.writeConfig("inventory_mysql_config.json", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of inventory team");
        MySqlConfig mySqlConfig = ConfigManager.readConfig("inventory_mysql_config.json", MySqlConfig.class);
        return mySqlConfig;
    }
}