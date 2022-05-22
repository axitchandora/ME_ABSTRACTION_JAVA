package com.example.abstraction.oop_way;

import com.example.abstraction.oop_way.config.ConfigManager;
import com.example.abstraction.oop_way.config.ConfigManagerJson;
import com.example.abstraction.oop_way.dto.MySqlConfig;
import com.example.abstraction.oop_way.dto.ResolvConfig;

public class VendorHardware {
    ConfigManager configManager = new ConfigManagerJson();

    public void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of vendor management team");
        configManager.writeConfig("vendor_mysql_config", mySqlConfig);
    }

    public MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of vendor management team");
        MySqlConfig mySqlConfig = configManager.readConfig("vendor_mysql_config", MySqlConfig.class);
        return mySqlConfig;
    }

    public void storeResolvConfig(ResolvConfig resolvConfig) {
        System.out.println("Storing resolv config of all vendor management servers");
        configManager.writeConfig("vendor_server_resolv_config", resolvConfig);
    }

    public ResolvConfig readResolvConfig() {
        System.out.println("Reading resolv config vendor management servers");
        ResolvConfig resolvConfig = configManager.readConfig("vendor_server_resolv_config",
                ResolvConfig.class);
        return resolvConfig;
    }

}