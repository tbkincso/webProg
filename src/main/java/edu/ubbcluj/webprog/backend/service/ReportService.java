package edu.ubbcluj.webprog.backend.service;

import edu.ubbcluj.webprog.backend.model.Report;
import edu.ubbcluj.webprog.backend.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kincso on 14.06.2017.
 */
@Service
public class ReportService {

    private final ReportRepository reportRepository;

    @Autowired
    public ReportService(ReportRepository reportRepository) {

        this.reportRepository = reportRepository;
    }

    public ReportRepository getReportRepository() {

        return reportRepository;
    }

    public void insert(Report task) {

    }

    public void delete(Report task) {

    }
}
