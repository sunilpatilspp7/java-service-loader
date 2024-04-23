package com.reportg;

import com.google.auto.service.AutoService;
import com.sunilpatil.ReportingExt;

import java.util.List;

@AutoService(ReportingExt.class)
public class googleAutoService implements ReportingExt {

    @Override
    public String getReportingExtId() {
        return "googleAutoService";
    }

    @Override
    public List<String> getAllReporting() {
        return List.of("gol","gol2");
    }

}
