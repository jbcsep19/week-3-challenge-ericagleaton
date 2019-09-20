package com.company;

public class JSeeker {
    private static String name;
    private static String phoneNum;
    private static String email;
    private static Education education;
    private static Experience experience;
    private static Skills skills;


    public JSeeker(String name, String phoneNum, String email, Education education, Experience experience, Skills skills) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }


    public static String getName() {
        return name;
    }

    public static String getPhoneNum() {
        return phoneNum;
    }

    public static String getEmail() {
        return email;
    }

    public static Education getEducation() {
        return education;
    }

    public static Experience getExperience() {
        return experience;
    }

    public static Skills getSkills() {
        return skills;
    }


    public static void setName(String name) {
        JSeeker.name = name;
    }

    public static void setPhoneNum(String phoneNum) {
        JSeeker.phoneNum = phoneNum;
    }

    public static void setEmail(String email) {
        JSeeker.email = email;
    }

    public static void setEducation(Education education) {
        JSeeker.education = education;
    }

    public static void setExperience(Experience experience) {
        JSeeker.experience = experience;
    }

    public static void setSkills(Skills skills) {
        JSeeker.skills = skills;
    }
}