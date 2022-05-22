package com.example.abstraction.base_code;

import com.example.abstraction.base_code.config.ConfigManager;
import com.example.abstraction.base_code.dto.MySqlConfig;
import com.example.abstraction.base_code.dto.ResolvConfig;

public class VendorHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of vendor management team");
        ConfigManager.writeConfig("vendor_mysql_config.json", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of vendor management team");
        MySqlConfig mySqlConfig = ConfigManager.readConfig("vendor_mysql_config.json", MySqlConfig.class);
        return mySqlConfig;
    }

    public static void storeResolvConfig(ResolvConfig resolvConfig) {
        System.out.println("Storing resolv config of all vendor management servers");
        ConfigManager.writeConfig("vendor_server_resolv_config.json", resolvConfig);
    }

    public static ResolvConfig readResolvConfig() {
        System.out.println("Reading resolv config vendor management servers");
        ResolvConfig resolvConfig = ConfigManager.readConfig("vendor_server_resolv_config.json", ResolvConfig.class);
        return resolvConfig;
    }

}