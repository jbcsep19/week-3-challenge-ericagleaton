package com.company;

public class Education {

    private static String school;
    private static String type;
    private static String major;
    private static String year;
    private static String degree;

    public Education(String school, String year, String major, String degree, String type) {
        this.type = type;
        this.school = school;
        this.year = year;
        this.major = major;
        this.degree = degree;
    }

    public static String getSchool() {
        return school;
    }

    public static String getYear() {
        return year;
    }

    public static String getMajor() {
        return major;
    }

    public static String getDegree() {
        return degree;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Education.type = type;
    }

    public static void setSchool(String school) {
        Education.school = school;
    }

    public static void setMajor(String major) {
        Education.major = major;
    }

    public static void setYear(String year) {
        Education.year = year;
    }

    public static void setDegree(String degree) {
        Education.degree = degree;
    }
}