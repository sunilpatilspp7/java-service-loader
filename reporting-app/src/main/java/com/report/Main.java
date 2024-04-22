package com.report;

import com.sunilpatil.ReportingExt;

import java.util.Map;
import java.util.HashMap;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<ReportingExt> serviceLoader = ServiceLoader.load(ReportingExt.class);

        Map<String, ReportingExt> services = new HashMap<>();
        for(ReportingExt service :serviceLoader)
        {
            System.out.println("I've found a service called '" + service.getReportingExtId() + "' !");
            services.put(service.getReportingExtId(), service);
        }

        System.out.println("Found "+services.size()+" services!");
    }

}