package com.example.abstraction.base_code_with_xml_support;

import com.example.abstraction.base_code_with_xml_support.dto.MySqlConfig;
import com.example.abstraction.base_code_with_xml_support.dto.ResolvConfig;
import com.example.abstraction.base_code_with_xml_support.dto.RestServerConfig;

public class Main {
    
    public static void main(String[] args) {
        // Code from different teams will be calling these functions.
        // Calling them from main for illustration purposes.
    

        // Vendor team storing their vendor detail.
        MySqlConfig vendorMySqlConfig = new MySqlConfig();
        vendorMySqlConfig.setMaxThreads(10);
        vendorMySqlConfig.setPort(3307);
        vendorMySqlConfig.setMaxConn(200);
        VendorHardware.storeMySqlConfig(vendorMySqlConfig);

        // Vendor team storing the resolv.conf file config of their main server.
        ResolvConfig vendoResolvConfig = new ResolvConfig();
        vendoResolvConfig.setNameserver("127.0.0.53");
        vendoResolvConfig.setOptions("edns0");
        VendorHardware.storeResolvConfig(vendoResolvConfig);

        // Logistics team storing some configuration of their own.        MySqlConfig inventoryMySqlConfig = new MySqlConfig();
        RestServerConfig logisticsRestServerConfig = new RestServerConfig();
        logisticsRestServerConfig.setMaxThreads(10);
        logisticsRestServerConfig.setPort(80);
        logisticsRestServerConfig.setMaxListeners(50);
        LogisticsHardware.storeLogisticsRestServerConfig(logisticsRestServerConfig);

        // Inventory team storing their inventory detail.
        MySqlConfig inventoryMySqlConfig = new MySqlConfig();
        inventoryMySqlConfig.setMaxThreads(100);
        inventoryMySqlConfig.setPort(3306);
        inventoryMySqlConfig.setMaxConn(10);
        InventoryHardware.storeMySqlConfig(inventoryMySqlConfig);

        //  Read stored configs of vendor team later.
        System.out.println("Printing MySQL config of vendor team");
        System.out.println(VendorHardware.readMySqlConfig());
        System.out.println("Print resolv config of vendor servers");
        System.out.println(VendorHardware.readResolvConfig());


        //  Read stored configs of logistics team later.
        System.out.println("Printing rest server config of logistics team");
        System.out.println(LogisticsHardware.readLogisticsRestServerConfig());

        // Read stored configs of inventory team later.
        System.out.println("Printing MySQL config of inventory team");
        System.out.println(InventoryHardware.readMySqlConfig());
    }
}