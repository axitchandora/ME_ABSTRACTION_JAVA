package com.example.abstraction.base_code_with_xml_support;

import com.example.abstraction.base_code_with_xml_support.config.ConfigManager;
import com.example.abstraction.base_code_with_xml_support.dto.MySqlConfig;
import com.example.abstraction.base_code_with_xml_support.dto.ResolvConfig;

public class VendorHardware {
    public static void storeMySqlConfig(MySqlConfig mySqlConfig) {
        System.out.println("Storing mysql config of vendor management team");
        ConfigManager.writeConfigToJson("vendor_mysql_config.json", mySqlConfig);
    }

    public static MySqlConfig readMySqlConfig() {
        System.out.println("Reading mysql config of vendor management team");
        MySqlConfig mySqlConfig = ConfigManager.readConfigFromJson("vendor_mysql_config.json", MySqlConfig.class);
        return mySqlConfig;
    }

    public static void storeResolvConfig(ResolvConfig resolvConfig) {
        System.out.println("Storing resolv config of all vendor management servers");
        ConfigManager.writeConfigToJson("vendor_server_resolv_config.json", resolvConfig);
    }

    public static ResolvConfig readResolvConfig() {
        System.out.println("Reading resolv config vendor management servers");
        ResolvConfig resolvConfig = ConfigManager.readConfigFromJson("vendor_server_resolv_config.json",
                ResolvConfig.class);
        return resolvConfig;
    }

}