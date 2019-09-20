package com.company;

public class Experience {
    private static String company;
    private static String title;
    private static String datesOfEmployment;
    private static String jobDescription;

    public Experience(String company, String title, String date, String jobDescription) {
        this.company = company;
        this.title = title;
        this.datesOfEmployment = date;
        this.jobDescription = jobDescription;
    }

    public static String getCompany() {
        return company;
    }

    public static String getTitle() {
        return title;
    }

    public static String getDatesOfEmployment() {
        return datesOfEmployment;
    }

    public static String getJobDescription() {
        return jobDescription;
    }

    public static void setCompany(String company) {
        Experience.company = company;
    }

    public static void setTitle(String title) {
        Experience.title = title;
    }

    public static void setDatesOfEmployment(String datesOfEmployment) {
        Experience.datesOfEmployment = datesOfEmployment;
    }

    public static void setJobDescription(String jobDescription) {
        Experience.jobDescription = jobDescription;
    }
}