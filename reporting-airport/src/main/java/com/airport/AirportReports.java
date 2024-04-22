package com.airport;

import com.sunilpatil.ReportingExt;

import java.util.List;

public class AirportReports implements ReportingExt {
    @Override
    public String getReportingExtId() {
        return "";
    }

    @Override
    public List<String> getAllReporting() {
        return List.of();
    }
}
