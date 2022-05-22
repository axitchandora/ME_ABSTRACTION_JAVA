package com.example.abstraction.oop_way;

import com.example.abstraction.oop_way.config.ConfigManager;
import com.example.abstraction.oop_way.config.ConfigManagerJson;
import com.example.abstraction.oop_way.dto.MySqlConfig;

public class InventoryHardware {
    ConfigManager configManager = new ConfigManagerJson();
    
    public void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of inventory team");
        configManager.writeConfig("inventory_mysql_config", mySqlConfig);
    }

    public MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of inventory team");
        MySqlConfig mySqlConfig = configManager.readConfig("inventory_mysql_config", MySqlConfig.class);
        return mySqlConfig;
    }
}