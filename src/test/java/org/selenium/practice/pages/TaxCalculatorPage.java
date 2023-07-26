package org.selenium.practice.pages;

public interface TaxCalculatorPage {


    void calculate(double income);

    String readErrorMessage();

    String readSummaryReportTaxToBePaid();

    boolean CheckSummaryReportStatus();

    int getTimeToOpenTheCalculator();

}
